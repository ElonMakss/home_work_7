package com.company;

public class Medic extends  Hero{
    int HeroHealth;

    public int getHeroHealth() {
        return HeroHealth;
    }

    public Medic setHeroHealth(int heroHealth) {
        HeroHealth = heroHealth;
        return this;
    }

    @Override
    public void applySuperAbility() {
        if (HeroHealth >= 100){
            health = health + strike;
        }

    }
}
