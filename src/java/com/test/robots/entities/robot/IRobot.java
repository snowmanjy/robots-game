package com.test.robots.entities.robot;

import com.test.robots.entities.directions.Direction;

public interface IRobot {

    String getPrintString();

    void turnLeft();

    void turnRight();

    void move(int x, int y);

    int getCoordinateX();

    int getCoordinateY();

    Direction getFacing();

}
