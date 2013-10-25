import static org.junit.Assert.*;

import org.junit.Test;

public class RoverEqualityTests {
    @Test
    public void equalRovers() {
        assertEquals(new Rover(1, 1, Direction.FACING_NORTH), new Rover(1, 1, Direction.FACING_NORTH));
    }

    @Test
    public void notEqualRovers() {
        assertFalse(new Rover(1, 1, Direction.FACING_NORTH).equals(new Rover(1, 1, Direction.FACING_SOUTH)));
        assertFalse(new Rover(1, 1, Direction.FACING_NORTH).equals(new Rover(1, 2, Direction.FACING_NORTH)));
        assertFalse(new Rover(1, 1, Direction.FACING_NORTH).equals(new Rover(0, 1, Direction.FACING_NORTH)));
    }
}
