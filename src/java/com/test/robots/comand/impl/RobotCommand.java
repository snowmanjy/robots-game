package com.test.robots.comand.impl;

import com.test.robots.comand.Command;
import com.test.robots.entities.grid.IGrid;
import com.test.robots.entities.robot.IRobot;

public abstract class RobotCommand implements Command {
    protected IRobot robot;

    protected IGrid grid;

    public void setRobot(IRobot robot) {
        this.robot = robot;
    }

    public void setGrid(IGrid grid) {
        this.grid = grid;
    }
}
