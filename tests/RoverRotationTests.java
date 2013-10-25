import static org.junit.Assert.*;

import org.junit.Test;

public class RoverRotationTests {
    @Test
    public void facingNorthRotateLeft() {
        Rover rover = new Rover(0, 0, Direction.FACING_NORTH);

        rover.receive("l");

        assertEquals(new Rover(0, 0, Direction.FACING_WEST), rover);
    }

    @Test
    public void facingNorthRotateRight() {
        Rover rover = new Rover(0, 0, Direction.FACING_NORTH);

        rover.receive("r");

        assertEquals(new Rover(0, 0, Direction.FACING_EAST), rover);
    }

    @Test
    public void facingSouthRotateLeft() {
        Rover rover = new Rover(0, 0, Direction.FACING_SOUTH);

        rover.receive("l");

        assertEquals(new Rover(0, 0, Direction.FACING_EAST), rover);
    }

    @Test
    public void facingSouthRotateRight() {
        Rover rover = new Rover(0, 0, Direction.FACING_SOUTH);

        rover.receive("r");

        assertEquals(new Rover(0, 0, Direction.FACING_WEST), rover);
    }

    @Test
    public void facingWestRotateLeft() {
        Rover rover = new Rover(0, 0, Direction.FACING_WEST);

        rover.receive("l");

        assertEquals(new Rover(0, 0, Direction.FACING_SOUTH), rover);
    }

    @Test
    public void facingWestRotateRight() {
        Rover rover = new Rover(0, 0, Direction.FACING_WEST);

        rover.receive("r");

        assertEquals(new Rover(0, 0, Direction.FACING_NORTH), rover);
    }

    @Test
    public void facingEastRotateLeft() {
        Rover rover = new Rover(0, 0, Direction.FACING_EAST);

        rover.receive("l");

        assertEquals(new Rover(0, 0, Direction.FACING_NORTH), rover);
    }

    @Test
    public void facingEastRotateRight() {
        Rover rover = new Rover(0, 0, Direction.FACING_EAST);

        rover.receive("r");

        assertEquals(new Rover(0, 0, Direction.FACING_SOUTH), rover);
    }
}
