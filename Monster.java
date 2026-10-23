abstract class Monster {
    String name;
    int hp = 100;

    Monster(String name) {
        this.name = name;
    }

    abstract int attack();
}
