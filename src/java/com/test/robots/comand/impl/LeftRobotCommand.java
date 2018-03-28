package com.test.robots.comand.impl;

public class LeftRobotCommand extends RobotCommand{

    @Override
    public void execute() {
        robot.turnLeft();
    }
}
