public class West extends Direction {
    @Override
    public Direction rotate(String command) {
        if (command.equals("r")) {
            return create("N");
        } else {
            return create("S");
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
