package com.test.robots.entities.grid;

public class Grid implements IGrid {

    private int[][] gridPositions;

    public Grid(int x, int y) {
        gridPositions = new int[y+1][x+1];
    }

    @Override
    public void occupyPosition(int x, int y) {
        if(isXInRange(x) && isYInRange(y)) {
            gridPositions[y][x] = 1;
        }
    }

    @Override
    public void resetPosition(int x, int y) {
        if(isXInRange(x) && isYInRange(y)) {
            gridPositions[y][x] = 0;
        }
    }

    @Override
    public boolean isAvailable(int x, int y) {
        return isXInRange(x) && isYInRange(y) && gridPositions[y][x] == 0;
    }

    private boolean isXInRange(int x) {
        return x >= 0 && x < gridPositions[0].length;
    }

    private boolean isYInRange(int y) {
        return y >= 0 && y < gridPositions.length;
    }
}
