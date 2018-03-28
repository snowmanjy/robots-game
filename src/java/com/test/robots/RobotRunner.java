package com.test.robots;

import com.test.robots.comand.CommandFactory;
import com.test.robots.comand.CommandManager;
import com.test.robots.entities.grid.IGrid;
import com.test.robots.entities.robot.IRobot;
import com.test.robots.entities.robot.Robot;
import org.apache.log4j.Logger;

public class RobotRunner {

    final static Logger logger = Logger.getLogger(RobotRunner.class);

    public String run(String initRobot, String commands, IGrid grid) {

        String[] initInfo = initRobot.split(" ");
        if(initInfo.length == 3) {
            int initX = Integer.parseInt(initInfo[0]);
            int initY = Integer.parseInt(initInfo[1]);

            if(!grid.isAvailable(initX, initY)) {
                String result = "init robot failed, coordinate:" + initX + "," + initY + " not available";
                logger.info(result);
                return result;
            }

            IRobot robot = new Robot(initX, initY, initInfo[2]);

            CommandFactory commandFactory = new CommandFactory(robot, grid);

            CommandManager commandManager = new CommandManager();
            for(char c : commands.toCharArray()) {
                commandManager.addCommand(commandFactory.getCommand("" + c));
            }

            commandManager.executeCommands();

            System.out.println(robot.getPrintString());

            return robot.getPrintString();
        }

        return null;
    }
}
