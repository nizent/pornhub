package main;

public class Knight extends Human {

    public Knight(String name) {
        super(200, 35, 750, name);
    }

    @Override
    public void attack(IAttacker attacker) {
        if (this.canFight())
            attacker.attackedByKnight(this);
    }


    @Override
    public void attackedByGoblin(Goblin goblin) {
        this.receiveDamage(goblin.calculateDamage(0.5));
    }

    @Override
    public void attackedByIceGolem(IceGolem iceGolem) {
        this.receiveDamage(iceGolem.calculateDamage(1.5));
    }

    @Override
    public void attackedByKnight(Knight knight) {
        this.receiveDamage(knight.calculateDamage(1.0));
    }




}