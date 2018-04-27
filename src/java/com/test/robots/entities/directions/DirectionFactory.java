package com.test.robots.entities.directions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.test.robots.entities.directions.Direction.EAST;
import static com.test.robots.entities.directions.Direction.NORTH;
import static com.test.robots.entities.directions.Direction.SOUTH;
import static com.test.robots.entities.directions.Direction.WEST;

public class DirectionFactory {

    public static Direction getDirectionByFacing(String facing) {
        List<Direction> directionList = Arrays.asList(Direction.values());

        return directionList.stream().filter(item -> facing.equals(item.getFacing())).findFirst().orElse(null);

    }
}
