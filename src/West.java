public class West extends Direction {
    
    @Override
    public Direction rotateRight() {
        return new North();
    }

    @Override
    public Direction rotateLeft() {
        return new South();
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
