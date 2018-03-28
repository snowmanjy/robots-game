package com.test.robots.comand;

import com.test.robots.comand.impl.LeftRobotCommand;
import com.test.robots.comand.impl.MoveRobotCommand;
import com.test.robots.comand.impl.RightRobotCommand;
import com.test.robots.entities.grid.IGrid;
import com.test.robots.entities.robot.IRobot;

public class CommandFactory {

    private IRobot robot;

    private IGrid grid;

    public CommandFactory(IRobot robot, IGrid grid) {
        this.robot = robot;
        this.grid = grid;
    }

    public Command getCommand(String command) {
        if("L".equals(command)) {
            LeftRobotCommand leftRobotCommand = new LeftRobotCommand() ;
            leftRobotCommand.setRobot(robot);
            return leftRobotCommand;
        } else if("R".equals(command)) {
            RightRobotCommand rightRobotCommand = new RightRobotCommand() ;
            rightRobotCommand.setRobot(robot);
            return rightRobotCommand;
        } else if("M".equals(command)) {
            MoveRobotCommand moveRobotCommand = new MoveRobotCommand() ;
            moveRobotCommand.setRobot(robot);
            moveRobotCommand.setGrid(grid);
            return moveRobotCommand;
        }

        return null;
    }
}
