package com.test.robots.entities.directions;

public enum Direction {

    NORTH("N") {
        @Override
        public Direction getLeftDirection() {
            return WEST;
        }

        @Override
        public Direction getRightDirection() {
            return EAST;
        }
    },
    SOUTH("S") {
        @Override
        public Direction getLeftDirection() {
            return EAST;
        }

        @Override
        public Direction getRightDirection() {
            return WEST;
        }
    },
    EAST("E") {
        @Override
        public Direction getLeftDirection() {
            return NORTH;
        }

        @Override
        public Direction getRightDirection() {
            return SOUTH;
        }
    },
    WEST("W") {
        @Override
        public Direction getLeftDirection() {
            return SOUTH;
        }

        @Override
        public Direction getRightDirection() {
            return NORTH;
        }
    };

    Direction(String facing){
        this.facing = facing;
    }
    protected String facing;

    public String getFacing(){
        return facing;
    }

    public abstract Direction getLeftDirection();

    public abstract Direction getRightDirection();

}
