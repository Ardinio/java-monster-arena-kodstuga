abstract class Monster {
    String name;
    int hp = 100;
    int point = 0;

    Monster(String name) {
        this.name = name;
    }

    abstract int attack();

    abstract int addPoints(); 
}
