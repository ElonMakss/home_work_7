package com.company;

public abstract class Hero implements HavingSuperAbility{
    int health;
    int strike;
    String superAbilityType;

    public int getHealth() {
        return health;
    }

    public Hero setHealth(int health) {
        this.health = health;
        return this;
    }

    public int getStrike() {
        return strike;
    }

    public Hero setStrike(int strike) {
        this.strike = strike;
        return this;
    }

    public String getSuperAbilityType() {
        return superAbilityType;
    }

    public Hero setSuperAbilityType(String superAbilityType) {
        this.superAbilityType = superAbilityType;
        return this;
    }
}
