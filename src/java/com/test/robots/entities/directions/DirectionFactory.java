package com.test.robots.entities.directions;

import java.util.HashMap;
import java.util.Map;

import static com.test.robots.entities.directions.Direction.EAST;
import static com.test.robots.entities.directions.Direction.NORTH;
import static com.test.robots.entities.directions.Direction.SOUTH;
import static com.test.robots.entities.directions.Direction.WEST;

public class DirectionFactory {

    private static final Map<String, Direction> directionMap = initDirectionMap();

    private static Map<String, Direction> initDirectionMap() {
        Map<String, Direction> directionMap = new HashMap<>();

        directionMap.put("E", EAST);
        directionMap.put("W", WEST);
        directionMap.put("N", NORTH);
        directionMap.put("S", SOUTH);

        return directionMap;
    }

    public static Direction getDirectionByFacing(String facing) {
        if(directionMap.containsKey(facing)) {
            return directionMap.get(facing);
        }
        directionMap.v
        return null;
    }
}
