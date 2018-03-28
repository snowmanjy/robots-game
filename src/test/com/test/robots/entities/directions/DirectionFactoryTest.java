package com.test.robots.entities.directions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectionFactoryTest {

    @Test
    public void testGetDirectionByFacing() {

        assertEquals(Direction.NORTH, DirectionFactory.getDirectionByFacing("N"));
        assertEquals(Direction.EAST, DirectionFactory.getDirectionByFacing("E"));
        assertEquals(Direction.SOUTH, DirectionFactory.getDirectionByFacing("S"));
        assertEquals(Direction.WEST, DirectionFactory.getDirectionByFacing("W"));

    }
}
