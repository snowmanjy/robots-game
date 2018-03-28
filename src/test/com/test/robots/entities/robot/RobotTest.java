package com.test.robots.entities.robot;

import com.test.robots.entities.directions.Direction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RobotTest {

    @Test
    public void testTurnLeft() {
        IRobot robot = new Robot(0, 0, "S");
        robot.turnLeft();
        assertEquals(Direction.EAST, robot.getFacing());
    }

    @Test
    public void testTurnRight() {
        IRobot robot = new Robot(0, 0, "W");
        robot.turnRight();
        assertEquals(Direction.NORTH, robot.getFacing());
    }

    @Test
    public void testMove() {
        IRobot robot = new Robot(0, 0, "W");
        robot.move(2, 3);
        assertEquals(2, robot.getCoordinateX());
        assertEquals(3, robot.getCoordinateY());
    }

    @Test
    public void testGetPrintString() {
        IRobot robot = new Robot(1, 1, "W");
        assertEquals("final status: 1 1 W", robot.getPrintString());
    }
}
