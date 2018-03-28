package com.test.robots.command.impl;

import com.test.robots.comand.impl.RobotPositionCaculator;
import com.test.robots.entities.robot.IRobot;
import com.test.robots.entities.robot.Robot;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RobotPositionCaculatorTest {

    @Test
    public void testCalculateNextCoordinate() {
        IRobot robot = new Robot(1, 1, "N");

        RobotPositionCaculator robotPositionCaculator = new RobotPositionCaculator(robot);
        robotPositionCaculator.calculateMovingToCoordinate();
        assertEquals(1, robotPositionCaculator.getMovingToX());
        assertEquals(2, robotPositionCaculator.getMovingToY());

        robot.turnRight();//E
        robotPositionCaculator.calculateMovingToCoordinate();
        assertEquals(2, robotPositionCaculator.getMovingToX());
        assertEquals(1, robotPositionCaculator.getMovingToY());

        robot.turnRight();//S
        robotPositionCaculator.calculateMovingToCoordinate();
        assertEquals(1, robotPositionCaculator.getMovingToX());
        assertEquals(0, robotPositionCaculator.getMovingToY());

        robot.turnRight();//W
        robotPositionCaculator.calculateMovingToCoordinate();
        assertEquals(0, robotPositionCaculator.getMovingToX());
        assertEquals(1, robotPositionCaculator.getMovingToY());
    }
}
