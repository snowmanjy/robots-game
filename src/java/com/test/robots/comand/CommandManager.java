package com.test.robots.comand;

import com.test.robots.comand.impl.RobotCommand;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class CommandManager {
    private Queue<RobotCommand> commandQueue = new ConcurrentLinkedDeque<>();

    public void addCommand(RobotCommand command) {
        commandQueue.add(command);
    }

    public void executeCommands()
    {
        while(!commandQueue.isEmpty()) {
            commandQueue.remove().execute();
        }
    }
}
