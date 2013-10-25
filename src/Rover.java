public class Rover {
    private Direction direction;
    private Position position;

    public Rover(int x, int y, String direction) {
        this.direction = Direction.create(direction);
        this.position = new Position(x, y);
    }
    
    public void receive(String commandSequence) {
        for (int i = 0; i < commandSequence.length(); ++i) {
            String command = commandSequence.substring(i, i + 1);
            receiveOneCommand(command);
        }
    }

    private void receiveOneCommand(String command) {
        if (isRotation(command)) {
            direction = direction.rotate(command);
        } else {
            displace(command);
        }
    }

    private boolean isRotation(String command) {
        return command.equals("l") || command.equals("r");
    }

    private void displace(String command) {
        int displacement = computeDisplacement(command);
        position = direction.applyDisplacement(displacement, position);
    }

    private int computeDisplacement(String command) {
        int displacement = -1;

        if (command.equals("f")) {
            displacement = 1;
        }
        return displacement;
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
