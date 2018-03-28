package com.test.robots.entities.grid;

public interface IGrid {

    void occupyPosition(int x, int y);

    void resetPosition(int x, int y);

    boolean isAvailable(int x, int y);
}
