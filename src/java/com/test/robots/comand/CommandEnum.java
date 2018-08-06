package com.test.robots.comand;

import com.test.robots.comand.impl.LeftRobotCommand;
import com.test.robots.comand.impl.MoveRobotCommand;
import com.test.robots.comand.impl.RightRobotCommand;
import com.test.robots.comand.impl.RobotCommand;

public enum CommandEnum {

    L {
        @Override
        public RobotCommand getCommand() {
            return new LeftRobotCommand();
        }
    },
    R {
        @Override
        public RobotCommand getCommand() {
            return new RightRobotCommand();
        }
    },
    M {
        @Override
        public RobotCommand getCommand() {
            return new MoveRobotCommand();
        }
    };

    public abstract RobotCommand getCommand();
}
