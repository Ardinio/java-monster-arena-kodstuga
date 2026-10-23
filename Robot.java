public class Robot extends Monster implements Specialattaker {
    Robot() {
        super("Robot");
    }

    @Override 
    int attack() {
        int damage = 15;
        return damage;
    }

    @Override 
    int addPoints() {
        return point += 3;
    }

    @Override
    public int useSpecialAttack() {
        int specialDamage = 10;
        return specialDamage;
    }
}
