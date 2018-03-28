package com.test.robots;

import com.test.robots.entities.grid.Grid;
import com.test.robots.entities.grid.IGrid;

public class App {
    public static void main(String[] args) {
        RobotRunner robotRunner = new RobotRunner();
        IGrid grid = new Grid(5, 5);

        robotRunner.run("1 2 N", "LMLMLMLMM", grid);//1 3 N
        robotRunner.run("3 3 E", "MMRMMRMRRM", grid);//5 1 E

        // added additional test cases
        grid = new Grid(2, 3);

        robotRunner.run("0 0 N", "RMMMMMLMMMMMM", grid);//2 3 N
        robotRunner.run("0 0 N", "RMMMMMLMMMMMM", grid);//2 2 N
        robotRunner.run("0 0 N", "LMMRMMMMMLMMMRMMMM", grid);//0 3 N

        // test out of grid
        robotRunner.run("5 5 N", "LMMRMM", grid);//init robot failed, coordinate:5,5 not available
        // test init with another robot's position
        robotRunner.run("2 3 N", "LMMRMM", grid);//init robot failed, coordinate:2,3 not available

        //another test
        grid = new Grid(1, 1);

        robotRunner.run("0 0 N", "MMRMM", grid);//1 1 E
        robotRunner.run("0 0 N", "MMRMM", grid);//0 1 E
        robotRunner.run("0 0 N", "RMMLM", grid);//1 0 N
        robotRunner.run("0 0 N", "RMLMRMRMRM", grid);//0 0 W

    }
}
