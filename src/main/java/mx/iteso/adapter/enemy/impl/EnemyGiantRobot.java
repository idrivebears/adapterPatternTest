package mx.iteso.adapter.enemy.impl;

import mx.iteso.adapter.enemy.EnemyRobot;

public class EnemyGiantRobot implements EnemyRobot{

    public String smashWithHands() {
        String message = "Enemy Robot Causes Damage With Its Hands";
        System.out.println(message);
        return message;
    }

    public String walkForward() {
        String message = "Enemy Robot Walks Forward";
        System.out.println();
        return message;
    }

    public String reactToHuman(String driverName) {
        String message = "Enemy Robot Tramps on " + driverName;
        System.out.println(message);
        return message;
    }

}
