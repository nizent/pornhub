package main;
/**
 * Subclase de Attacker donde sus objectos (iceGolem) atacan con un factor 1.5 a knight,
 * 2 a fireMage, 2 a priest, 2 a goblin, 1 a iceGolem,
 * y 2 a undead.
 * @author Kyra
 */
public class IceGolem extends Attacker implements IAttacker {

    public IceGolem() {
        super(250, 30, 800);
    }

    @Override
    public void attack(IAttacker attacker) {
        if (this.canFight())
            attacker.attackedByIceGolem(this);
    }

    @Override
    public void attackedByFireMage(FireMage fireMage) {
        this.receiveDamage(fireMage.calculateDamage(5.0));
    }

    @Override
    public void attackedByGoblin(Goblin goblin) {
    }

    @Override
    public void attackedByIceGolem(IceGolem iceGolem) {
        this.receiveDamage(iceGolem.calculateDamage(1.0));
    }

    @Override
    public void attackedByKnight(Knight knight) {
        this.receiveDamage(knight.calculateDamage(0.5));
    }

    @Override
    public void attackedByUndead(Undead undead) {

    }
}
