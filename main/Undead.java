package main;
/**
 * Subclase de Attacker donde sus objectos (undead) atacan con un factor 1 a knight, fireMage, priest y goblin.
 * Además,quienes pertenecen a esta clase no le hacen daño a iceGolem, y undead
 * @author Kyra
 */

public class Undead extends Attacker implements IAttacker {

    public Undead(){
        super(400,30,900);
    }

    @Override
    public void attack(IAttacker attacker) {
        if (this.canFight())
            attacker.attackedByUndead(this);
    }

    @Override
    public void attackedByFireMage(FireMage fireMage) {
        this.receiveDamage(fireMage.calculateDamage(0.5));
    }

    @Override
    public void attackedByGoblin(Goblin goblin) {
    }

    @Override
    public void attackedByKnight(Knight knight) {
        this.receiveDamage(knight.calculateDamage(1.0));
    }

    @Override
    public void attackedByPriest(Priest priest) {
        this.receiveDamage(priest.calculateDamage(5.0));
    }

    @Override
    public void attackedByUndead(Undead undead) {
    }

}
