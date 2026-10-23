public class Dragon extends Monster implements Specialattaker {
    Dragon() {
        super("Dragon");
    }

    @Override 
    int attack() {
        int damage = 20;
        return damage;
    }

    @Override
    public int useSpecialAttack() {
        int specialDamge = 5;
        return specialDamge;
    }
}
