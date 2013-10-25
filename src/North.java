
public class North extends Direction {
    @Override
    public Direction rotate(String command) {
        if (command.equals("r")) {
            return create("E");
        } else {
            return create("W");
        }
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
