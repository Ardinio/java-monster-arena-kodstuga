import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Monster[] monsters = {new Dragon(), new Robot(), new Slime()};

        Scanner input = new Scanner(System.in);
        while (true) {
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
            
                default:
                    break;
            }
        }
    }
}