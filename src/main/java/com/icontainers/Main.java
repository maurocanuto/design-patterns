package com.icontainers;

import com.icontainers.builder.Armor;
import com.icontainers.builder.Hero;
import com.icontainers.builder.Profession;
import com.icontainers.builder.Weapon;
import com.icontainers.chain.Action;
import com.icontainers.chain.ActionType;
import com.icontainers.chain.Commander;
import com.icontainers.decorator.Rider;
import com.icontainers.decorator.Robot;
import com.icontainers.decorator.TeleporterRider;

public class Main {

    public static void main(String[] args) {

        runBuilder();

        runDecorator();

        runChainOfResponsibility();

    }

    private static void runBuilder() {
        System.out.println("###### Builder ######");
        Hero mage =
                new Hero.Builder(Profession.WIZARD, "Riobard").withWeapon(Weapon.DAGGER).build();
        System.out.println(mage.toString());

        Hero warrior =
                new Hero.Builder(Profession.WARRIOR, "Amberjill").withArmor(Armor.LEATHER).withWeapon(Weapon.SWORD)
                        .build();
        System.out.println(warrior.toString());

        Hero thief =
                new Hero.Builder(Profession.THIEF, "Desmond").withWeapon(Weapon.BOW).build();
        System.out.println(thief.toString());
    }

    private static void runDecorator() {
        System.out.println("###### Decorator ######");
        Robot robot = new Rider();
        robot.attack();
        System.out.println("power:" + robot.getPower());
        System.out.println("power:" + robot.getPower());
        robot.escape();

        robot = new TeleporterRider(robot);
        robot.attack();
        System.out.println("power:" + robot.getPower());
        robot.escape();
    }

    private static void runChainOfResponsibility() {
        System.out.println("###### Chain ######");
        Commander commander = new Commander();
        commander.sendAction(new Action(ActionType.KILL, "kill the enemy"));
        commander.sendAction(new Action(ActionType.STEAL, "steal the flag"));
        commander.sendAction(new Action(ActionType.DEFEND, "defend the zone"));
    }


}
