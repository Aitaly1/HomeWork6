package com.company;

public class Boss extends GameEntity {

    private Weapon weapon;

    public Boss(int health, int damage, Weapon weapon) {
        super(health, damage);
        this.weapon = weapon;
    }

   

    @Override
    public String getInfo() {
        return super.getInfo() + " " + weapon.getWeaponType() + " " + weapon.getWeaponName();
    }
}

