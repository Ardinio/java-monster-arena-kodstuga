import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isRunning = true;

        Monster[] monsters = {new Dragon(), new Robot(), new Slime()};

        List<Monster> monsters2 = new ArrayList<>();

        monsters2.add(new Dragon());
        monsters2.add(new Robot());
        monsters2.add(new Slime());

        Scanner input = new Scanner(System.in);
        while (isRunning) {
            System.out.println("Skriv in en siffra för att välja ett av förljande alternativ: \n1. Visa alla montser"
                + "\n2. Starta en match \n3. Visa topplistan \n4. Avsluta programet"
            );
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    for (Monster monster : monsters) {
                        System.out.println(monster.name);
                    } 
                    break;

                case 2:
                    Collections.shuffle(monsters2);

                    System.out.println("Matchen börjar!");

                    Queue<Monster> queueMonsters = new LinkedList<>();


                    while (monsters2.get(0).hp > 0 && monsters2.get(1).hp > 0) {

                        queueMonsters.offer(monsters2.get(0));
                        queueMonsters.offer(monsters2.get(1));       
                        
                        System.out.println(queueMonsters.poll() + " attakerar och gör " + (monsters2.get(1).hp -= monsters2.get(0).attack()) + " hp");
                        System.out.println(queueMonsters.poll() + " attakerar och gör " + (monsters2.get(0).hp -= monsters2.get(1).attack()) + " hp");
                    }

                    if (monsters2.get(0).hp > 0) {
                        System.out.println("Vinnaren är " + monsters2.get(0).name + " och får " + monsters2.get(0).addPoints() + " points");
                    }
                    else {
                        System.out.println("Vinnaren är " + monsters2.get(1).name + " och får " + monsters2.get(1).addPoints() + " points");
                    }
                    break;

                case 3: 
                    Map<String, Integer> highScore = new HashMap<>();

                    highScore.put(monsters2.get(0).name, monsters2.get(0).point);
                    highScore.put(monsters2.get(1).name, monsters2.get(1).point);
                    highScore.put(monsters2.get(2).name, monsters2.get(2).point);

                    System.out.print(highScore.values());
                    break;

                case 4:
                    System.out.println("Nu avslutas programet");
                    isRunning = false;
                    break;
                default:
                    break;
            }
        }
    }
}