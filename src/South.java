public class South extends Direction {
    
    @Override
    public Direction rotateRight() {
        return new West();
    }

    @Override
    public Direction rotateLeft() {
        return new East();
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
