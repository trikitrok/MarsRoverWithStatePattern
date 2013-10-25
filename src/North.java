public class North extends Direction {

    @Override
    public Direction rotateRight() {
        return new East();
    }

    @Override
    public Direction rotateLeft() {
        return new West();
    }

    @Override
    public Position applyDisplacement(int displacement, Position position) {
        return new Position(position.getX(), position.getY() + displacement);
    }

    @Override
    public String toString() {
        return "Direction [direction= N]";
    }
}
