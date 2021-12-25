package kg.geektech.game.players;

public class Berserk extends Hero {
    private int dmgPoint;
    public Berserk(int health, int damage,int dmgPoint, String name) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
        this.dmgPoint= dmgPoint;
    }

    public int getDmgPoint() {
        return dmgPoint;
    }

    public void setDmgPoint(int dmgPoint) {
        this.dmgPoint = dmgPoint;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (this.getHealth()>0) {
            boss.setHealth(boss.getHealth() - this.dmgPoint);
            this.setHealth(this.getHealth()+this.dmgPoint);
        }
    }
}
