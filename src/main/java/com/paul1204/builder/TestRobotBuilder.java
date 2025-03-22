package com.paul1204.builder;

public class TestRobotBuilder {

    public static void main(String[] args){
        RobotBuilder robot = new OldRobotBuilder();
        RobotDirector robotDirector = new RobotDirector(robot);

        robotDirector.makeRobot();

        Robot firstRobot = robotDirector.getRobot();

        System.out.println("Robot Built");
        System.out.println("Robot Head " + firstRobot.getRobotHead());
        System.out.println("Robot Torso " + firstRobot.getRobotTorso());
        System.out.println("Robot Arms " + firstRobot.getRobotArms());
        System.out.println("Robot Legs " + firstRobot.getRobotLegs());
    }
}
