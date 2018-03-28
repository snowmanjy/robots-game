package com.test.robots.comand.impl;

import com.test.robots.entities.directions.Direction;
import com.test.robots.entities.robot.IRobot;

public class RobotPositionCaculator {

    private static final int MOVE_DISTANCE = 1;

    private int movingToX;
    private int movingToY;
    private IRobot robot;

    public RobotPositionCaculator(IRobot robot) {
        this.robot = robot;
    }

    public int getMovingToX() {
        return movingToX;
    }

    public int getMovingToY() {
        return movingToY;
    }

    public void calculateMovingToCoordinate() {
        if(robot.getFacing() == Direction.NORTH) {
            movingToX = robot.getCoordinateX();
            movingToY = robot.getCoordinateY() + MOVE_DISTANCE;
        } else if(robot.getFacing() == Direction.SOUTH) {
            movingToX = robot.getCoordinateX();
            movingToY = robot.getCoordinateY() - MOVE_DISTANCE;
        }else if(robot.getFacing() == Direction.WEST) {
            movingToX = robot.getCoordinateX() - MOVE_DISTANCE;
            movingToY = robot.getCoordinateY();
        }else if(robot.getFacing() == Direction.EAST) {
            movingToX = robot.getCoordinateX() + MOVE_DISTANCE;
            movingToY = robot.getCoordinateY();
        }
    }
}
