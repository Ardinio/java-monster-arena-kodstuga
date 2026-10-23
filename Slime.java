public class Slime extends Monster {
    Slime() {
        super("Slime");
    }

    @Override 
    int attack() {
        int damage = 25;
        return damage;
    }
}
