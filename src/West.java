public class West extends Direction {
    @Override
    public Direction rotate(String command) {
        if (command.equals("r")) {
            return new North();
        } else {
            return new South();
        }
    }

    @Override
    public Position applyDisplacement(int displacement, Position position) {
        return new Position(position.getX() - displacement, position.getY());
    }

    @Override
    public String toString() {
        return "Direction [direction= W]";
    }
}
