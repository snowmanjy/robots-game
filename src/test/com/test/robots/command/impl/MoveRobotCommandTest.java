package com.test.robots.command.impl;

import com.test.robots.comand.impl.MoveRobotCommand;
import com.test.robots.comand.impl.RobotPositionCaculator;
import com.test.robots.entities.grid.IGrid;
import com.test.robots.entities.robot.IRobot;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MoveRobotCommandTest {
    @Mock
    IRobot mockRobot;

    @Mock
    IGrid grid;

    @Mock
    RobotPositionCaculator robotPositionCaculator;

    @Test
    public void testMove() {
        MoveRobotCommand moveRobotCommand = new MoveRobotCommand();
        moveRobotCommand.setRobot(mockRobot);
        moveRobotCommand.setGrid(grid);
        moveRobotCommand.setRobotPositionCaculator(robotPositionCaculator);

        when(robotPositionCaculator.getMovingToX()).thenReturn(1);
        when(robotPositionCaculator.getMovingToY()).thenReturn(1);

        when(grid.isAvailable(1, 1)).thenReturn(Boolean.TRUE);
        when(mockRobot.getCoordinateX()).thenReturn(0);
        when(mockRobot.getCoordinateY()).thenReturn(0);

        moveRobotCommand.execute();

        verify(grid, times(1)).resetPosition(eq(0), eq(0));
        verify(mockRobot, times(1)).move(eq(1), eq(1));
        verify(grid, times(1)).occupyPosition(eq(0), eq(0));
    }
}
