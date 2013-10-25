abstract public class Direction {
    public static final String FACING_NORTH = "N";
    public static final String FACING_SOUTH = "S";
    public static final String FACING_WEST = "W";
    public static final String FACING_EAST = "E";
    
    public static Direction create(String direction) {
        if (direction.equals(FACING_NORTH)) {
            return new North();
        } else if (direction.equals(FACING_SOUTH)) {
            return new South();
        } else if (direction.equals(FACING_WEST)) {
            return new West();
        } else {
            return new East();
        }
    }

    abstract public Direction rotateLeft();
    abstract public Direction rotateRight();

    abstract public Position applyDisplacement(int displacement, Position position);

    @Override
    public boolean equals(Object obj) {
        if (getClass() != obj.getClass())
            return false;
        return true;
    }
}
