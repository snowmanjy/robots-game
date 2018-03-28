package com.test.robots.command.impl;

import com.test.robots.comand.impl.LeftRobotCommand;
import com.test.robots.entities.robot.IRobot;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class LeftRobotCommandTest {
    @Mock
    IRobot mockRobot;

    @Test
    public void testTurnLeft() {
        LeftRobotCommand leftRobotCommand = new LeftRobotCommand();
        leftRobotCommand.setRobot(mockRobot);
        leftRobotCommand.execute();

        verify(mockRobot, times(1)).turnLeft();
    }
}
