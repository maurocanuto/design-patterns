package com.canutech;

import com.canutech.builder.Armor;
import com.canutech.builder.Hero;
import com.canutech.builder.Profession;
import com.canutech.builder.Weapon;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BuilderTest {

    @Test(expected = IllegalArgumentException.class)
    public void missingProfessionTest() throws Exception {
        new Hero.Builder(null, "Sir without a job");
    }

    @Test(expected = IllegalArgumentException.class)
    public void missingNameTest() throws Exception {
        new Hero.Builder(Profession.THIEF, null);
    }

    @Test
    public void buildHeroTest() {
        final String heroName = "Sir Lancelot";

        final Hero hero = new Hero.Builder(Profession.WARRIOR, heroName)
                .withArmor(Armor.CLOTHES)
                .withWeapon(Weapon.SWORD)
                .build();

        assertNotNull(hero);
        assertEquals(Profession.WARRIOR, hero.getProfession());
        assertEquals(heroName, hero.getName());
        assertEquals(Armor.CLOTHES, hero.getArmor());
        assertEquals(Weapon.SWORD, hero.getWeapon());
    }

}
