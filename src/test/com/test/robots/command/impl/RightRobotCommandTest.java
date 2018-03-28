package com.test.robots.command.impl;

import com.test.robots.comand.impl.RightRobotCommand;
import com.test.robots.entities.robot.IRobot;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class RightRobotCommandTest {
    @Mock
    IRobot mockRobot;

    @Test
    public void testRightLeft() {
        RightRobotCommand rightRobotCommand = new RightRobotCommand();
        rightRobotCommand.setRobot(mockRobot);
        rightRobotCommand.execute();

        verify(mockRobot, times(1)).turnRight();
    }
}
