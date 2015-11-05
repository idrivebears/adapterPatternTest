package mx.iteso.adapter.enemy.impl;

import mx.iteso.adapter.enemy.EnemyAttacker;

public class EnemyTank implements EnemyAttacker {

    public String fireWeapon() {
        String message = "Enemy tank fires weapon";
        System.out.println(message);
        return message;
    }

    public String driveForward() {
        String message = "Enemy Tank moves forward";
        System.out.println();
        return message;
     }

    public String assignDriver(String driverName) {
        String message = driverName + " is driving the tank";
        System.out.println(message);
        return message;
    }

}
