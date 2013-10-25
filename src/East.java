public class East extends Direction {
    
    @Override
    public Direction rotateRight() {
        return new South();
    }

    @Override
    public Direction rotateLeft() {
        return new North();
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
