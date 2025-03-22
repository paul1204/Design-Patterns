package com.paul1204.builder;

public class OldRobotBuilder implements RobotBuilder{

    private Robot robot;
    public OldRobotBuilder(){
        this.robot = new Robot();
    }
    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Rune Full Helm");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Rune PlateBody");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Barrows Gloves");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Rune PlateLegs");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
