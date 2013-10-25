public class Rover {
    private Direction direction;
    private Position position;

    public Rover(int x, int y, String direction) {
        this.direction = Direction.create(direction);
        this.position = new Position(x, y);
    }

    public void receive(String commandSequence) {
        for (int i = 0; i < commandSequence.length(); ++i) {
            String command = nextCommand(commandSequence, i);
            receiveCommand(command);
        }
    }

    private void receiveCommand(String command) {
        if (isRotationLeft(command)) {
            direction = direction.rotateLeft();
        } else if (isRotationRight(command)) {
            direction = direction.rotateRight();
        } else {
            displace(command);
        }
    }

    private void displace(String command) {
        int displacement = computeDisplacement(command);
        position = direction.applyDisplacement(displacement, position);
    }

    private int computeDisplacement(String command) {
        int displacement = -1;

        if (isMoveForward(command)) {
            displacement = 1;
        }
        return displacement;
    }

    private String nextCommand(String commandSequence, int i) {
        String command = commandSequence.substring(i, i + 1);
        return command;
    }
    
    private boolean isMoveForward(String command) {
        return command.equals("f");
    }

    private boolean isRotationRight(String command) {
        return command.equals("r");
    }

    private boolean isRotationLeft(String command) {
        return command.equals("l");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rover other = (Rover) obj;
        if (direction == null) {
            if (other.direction != null)
                return false;
        } else if (!direction.equals(other.direction))
            return false;
        if (position == null) {
            if (other.position != null)
                return false;
        } else if (!position.equals(other.position))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Rover [direction=" + direction + ", position=" + position + "]";
    }
}
