
abstract public class Direction {
    public static Direction create(String direction) {
        if(direction.equals("N")) {
            return new North();
        } else if(direction.equals("S")) {
            return new South();
        } else if (direction.equals("W")){
            return new West();
        } else {
            return new East();
        }
    }
    
    abstract public Direction rotate(String command);
    
    abstract public Position applyDisplacement(int displacement, Position position);

    @Override
    public boolean equals(Object obj) {
        if (getClass() != obj.getClass())
            return false;
        return true;
    }
}
