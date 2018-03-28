package com.test.robots.comand.impl;

import com.test.robots.entities.grid.IGrid;
import org.apache.log4j.Logger;

public class MoveRobotCommand extends RobotCommand{
    final static Logger logger = Logger.getLogger(MoveRobotCommand.class);

    protected IGrid grid;

    private RobotPositionCaculator robotPositionCaculator;

    public void setGrid(IGrid grid) {
        this.grid = grid;
    }

    public void setRobotPositionCaculator(RobotPositionCaculator robotPositionCaculator) {
        this.robotPositionCaculator = robotPositionCaculator;
    }

    @Override
    public void execute() {
        if(robotPositionCaculator == null) {
            robotPositionCaculator = new RobotPositionCaculator(robot);
        }

        robotPositionCaculator.calculateMovingToCoordinate();
        int movingToX = robotPositionCaculator.getMovingToX();
        int movingToY = robotPositionCaculator.getMovingToY();

        if(!grid.isAvailable(movingToX, movingToY)) {
            logger.info("coordinate:" + movingToX + "," + movingToY + " not available");
            return;
        }

        grid.resetPosition(robot.getCoordinateX(), robot.getCoordinateY());
        robot.move(movingToX, movingToY);
        grid.occupyPosition(robot.getCoordinateX(), robot.getCoordinateY());
    }

}
