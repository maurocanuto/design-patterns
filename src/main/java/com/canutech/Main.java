package com.canutech;

import com.canutech.builder.Armor;
import com.canutech.builder.Hero;
import com.canutech.builder.Profession;
import com.canutech.builder.Weapon;
import com.canutech.chain.Action;
import com.canutech.chain.ActionType;
import com.canutech.chain.Commander;
import com.canutech.decorator.Rider;
import com.canutech.decorator.Robot;
import com.canutech.decorator.TeleporterRider;

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
