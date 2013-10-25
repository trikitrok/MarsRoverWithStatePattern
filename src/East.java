public class East extends Direction {
    @Override
    public Direction rotate(String command) {
        if (command.equals("r")) {
            return new South();
        } else {
            return new North();
        }
    }

    @Override
    public Position applyDisplacement(int displacement, Position position) {
        return new Position(position.getX() + displacement, position.getY());
    }

    @Override
    public String toString() {
        return "Direction [direction= E]";
    }
}
