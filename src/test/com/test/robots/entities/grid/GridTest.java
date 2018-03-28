package com.test.robots.entities.grid;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GridTest {

    @Test
    public void testGridPositions() {
        IGrid grid = new Grid(3, 3);

        assertEquals(Boolean.TRUE, grid.isAvailable(2, 2));

        grid.occupyPosition(2, 2);
        assertEquals(Boolean.FALSE, grid.isAvailable(2, 2));

        grid.resetPosition(2, 2);
        assertEquals(Boolean.TRUE, grid.isAvailable(2, 2));

        grid.occupyPosition(5, 5);
        assertEquals(Boolean.FALSE, grid.isAvailable(5, 5));
        grid.resetPosition(5, 5);
        assertEquals(Boolean.FALSE, grid.isAvailable(5, 5));

    }

}
