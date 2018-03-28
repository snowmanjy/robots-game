package com.test.robots.entities.robot;

import com.test.robots.entities.directions.Direction;
import com.test.robots.entities.directions.DirectionFactory;
import org.apache.log4j.Logger;

public class Robot implements IRobot {

    final static Logger logger = Logger.getLogger(Robot.class);

    private int coordinateX;

    private int coordinateY;

    private Direction facing;

    public Robot(int x, int y, String facing) {
        this.coordinateX = x;
        this.coordinateY = y;
        this.facing = DirectionFactory.getDirectionByFacing(facing);
        logger.info("init coordinate:" + coordinateX +"," + coordinateY);
        logger.info("init facing:" + this.facing.getFacing());

    }

    public String getPrintString() {
        String printString = this.coordinateX + " " + this.coordinateY + " " + ((this.facing == null) ? "" : this.facing.getFacing());
        logger.info("final status: " + printString);
        return printString;
    }

    @Override
    public void turnLeft() {
        facing = facing.getLeftDirection();
        logger.info("new facing:" + this.facing.getFacing());

    }

    @Override
    public void turnRight() {
        facing = facing.getRightDirection();
        logger.info("new facing:" + this.facing.getFacing());

    }

    @Override
    public void move(int x, int y) {
        this.coordinateX = x;
        this.coordinateY = y;

        logger.info("new coordinate:" + coordinateX +"," + coordinateY);
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public Direction getFacing() {
        return facing;
    }
}
