class IceGolem extends Attacker implements IAttacker {

    IceGolem() {
        super(250, 50, 800);
    }

    @Override
    public void attack(IAttacker attacker) {
        attackIceGolem(this);
    }

    @Override
    public void attackKnight(Knight knight) {

    }

    @Override
    public void attackGoblin(Goblin goblin) {

    }

    @Override
    public void attackIceGolem(IceGolem iceGolem) {

    }

    @Override
    public void attackUndead(Undead undead) {

    }

    @Override
    public void attackFireMage(FireMage fireMage) {

    }

    @Override
    public void attackPriost(Priost priost) {

    }
}
