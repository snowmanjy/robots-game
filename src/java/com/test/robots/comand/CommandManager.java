package com.test.robots.comand;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class CommandManager {
    private Queue<Command> commandQueue = new ConcurrentLinkedDeque<>();

    public void addCommand(Command command) {
        commandQueue.add(command);
    }

    public void executeCommands()
    {
        while(!commandQueue.isEmpty()) {
            commandQueue.remove().execute();
        }
    }
}
