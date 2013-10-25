import static org.junit.Assert.*;

import org.junit.Test;

public class RoverPositionTests {
    @Test
    public void facingNorthMoveForward() {
        Rover rover = new Rover(0, 0, Direction.FACING_NORTH);

        rover.receive("f");

        assertEquals(new Rover(0, 1, Direction.FACING_NORTH), rover);
    }

    @Test
    public void facingNorthMoveBackward() {
        Rover rover = new Rover(0, 0, Direction.FACING_NORTH);

        rover.receive("b");

        assertEquals(new Rover(0, -1, Direction.FACING_NORTH), rover);
    }

    @Test
    public void facingSouthMoveForward() {
        Rover rover = new Rover(0, 0, Direction.FACING_SOUTH);

        rover.receive("f");

        assertEquals(new Rover(0, -1, Direction.FACING_SOUTH), rover);
    }

    @Test
    public void facingSouthMoveBackward() {
        Rover rover = new Rover(0, 0, Direction.FACING_SOUTH);

        rover.receive("b");

        assertEquals(new Rover(0, 1, Direction.FACING_SOUTH), rover);
    }

    @Test
    public void facingWestMoveForward() {
        Rover rover = new Rover(0, 0, Direction.FACING_WEST);

        rover.receive("f");

        assertEquals(new Rover(-1, 0, Direction.FACING_WEST), rover);
    }

    @Test
    public void facingWestMoveBackward() {
        Rover rover = new Rover(0, 0, Direction.FACING_WEST);

        rover.receive("b");

        assertEquals(new Rover(1, 0, Direction.FACING_WEST), rover);
    }

    @Test
    public void facingEastMoveForward() {
        Rover rover = new Rover(0, 0, Direction.FACING_EAST);

        rover.receive("f");

        assertEquals(new Rover(1, 0, Direction.FACING_EAST), rover);
    }

    @Test
    public void facingEastMoveBackward() {
        Rover rover = new Rover(0, 0, Direction.FACING_EAST);

        rover.receive("b");

        assertEquals(new Rover(-1, 0, Direction.FACING_EAST), rover);
    }
}
