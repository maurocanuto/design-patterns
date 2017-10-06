package com.icontainers.builder;

public class Hero {

    private final Profession profession;
    private final String name;
    private final Armor armor;
    private  Weapon weapon;

    private Hero(Builder builder) {
        this.profession = builder.profession;
        this.name = builder.name;
        this.weapon = builder.weapon;
        this.armor = builder.armor;
    }

    public Profession getProfession() {
        return profession;
    }

    public String getName() {
        return name;
    }

    public Armor getArmor() {
        return armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("This is a ")
                .append(profession)
                .append(" named ")
                .append(name);
        if (armor != null) {
            sb.append(" wearing ").append(armor);
        }
        if (weapon != null) {
            sb.append(" and wielding a ").append(weapon);
        }
        sb.append('.');
        return sb.toString();
    }

    /**
     *
     * The builder class.
     *
     */
    public static class Builder {

        private final Profession profession;
        private final String name;
        private Armor armor;
        private Weapon weapon;

        /**
         * Constructor
         */
        public Builder(Profession profession, String name) {
            if (profession == null || name == null) {
                throw new IllegalArgumentException("profession and name can not be null");
            }
            this.profession = profession;
            this.name = name;
        }

        public Builder withArmor(Armor armor) {
            this.armor = armor;
            return this;
        }

        public Builder withWeapon(Weapon weapon) {
            this.weapon = weapon;
            return this;
        }

        public Hero build() {
            return new Hero(this);
        }
    }
}
