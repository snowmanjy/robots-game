package com.test.robots.entities.directions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectionTest {

    @Test
    public void testGetDirections() {
        //test north
        assertEquals(Direction.WEST, Direction.NORTH.getLeftDirection());
        assertEquals(Direction.EAST, Direction.NORTH.getRightDirection());
        assertEquals("N", Direction.NORTH.getFacing());

        //test south
        assertEquals(Direction.EAST, Direction.SOUTH.getLeftDirection());
        assertEquals(Direction.WEST, Direction.SOUTH.getRightDirection());
        assertEquals("S", Direction.SOUTH.getFacing());

        //test east
        assertEquals(Direction.NORTH, Direction.EAST.getLeftDirection());
        assertEquals(Direction.SOUTH, Direction.EAST.getRightDirection());
        assertEquals("E", Direction.EAST.getFacing());

        //test west
        assertEquals(Direction.SOUTH, Direction.WEST.getLeftDirection());
        assertEquals(Direction.NORTH, Direction.WEST.getRightDirection());
        assertEquals("W", Direction.WEST.getFacing());
    }
}
