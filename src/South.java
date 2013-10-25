public class South extends Direction {
    @Override
    public Direction rotate(String command) {
        if (command.equals("r")) {
            return create("W");
        } else {
            return create("E");
        }
    }

    @Override
    public Position applyDisplacement(int displacement, Position position) {
        return new Position(position.getX(), position.getY() - displacement);
    }
    

    @Override
    public String toString() {
        return "Direction [direction= S]";
    }
}
