package com.test.robots.comand;

import com.test.robots.comand.impl.LeftRobotCommand;
import com.test.robots.comand.impl.MoveRobotCommand;
import com.test.robots.comand.impl.RightRobotCommand;
import com.test.robots.comand.impl.RobotCommand;
import com.test.robots.entities.grid.IGrid;
import com.test.robots.entities.robot.IRobot;

import java.util.Arrays;

public class CommandFactory {

    private IRobot robot;

    private IGrid grid;

    public CommandFactory(IRobot robot, IGrid grid) {
        this.robot = robot;
        this.grid = grid;
    }

    public RobotCommand getCommand(String command) {
        CommandEnum commandEnum = Arrays
                .stream(CommandEnum.values())
                .filter(item -> command.equals(item.name()))
                .findFirst()
                .orElse(null);

        if (commandEnum != null) {
            RobotCommand robotCommand = commandEnum.getCommand();
            robotCommand.setRobot(this.robot);
            robotCommand.setGrid(this.grid);
            return robotCommand;
        }

        return null;
    }
}
