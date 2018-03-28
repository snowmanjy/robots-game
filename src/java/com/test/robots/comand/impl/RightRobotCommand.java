package com.test.robots.comand.impl;

public class RightRobotCommand extends RobotCommand{

    @Override
    public void execute() {
        robot.turnRight();
    }
}
