package se.iths.samyah;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Spelare 1 förnamn: ");
        String firstName1 = scanner.nextLine();
        System.out.print("Spelare 1 efternamn: ");
        String lastName1 = scanner.nextLine();
        Player player1 = new Player(firstName1, lastName1);

        System.out.print("Spelare 2 förnamn: ");
        String firstName2 = scanner.nextLine();
        System.out.print("Spelare 2 efternamn: ");
        String lastName2 = scanner.nextLine();
        Player player2 = new Player(firstName2, lastName2);

        System.out.println();

        for (int i = 1; i <= 2; i++) {
            int diceRoll = RandomGenerator.getDefault().nextInt(1, 7);
            System.out.println(player1.getFullName() + " slog: " + diceRoll);
            player1.addToScore(diceRoll);
        }

        for (int i = 1; i <= 2; i++) {
            int diceRoll = RandomGenerator.getDefault().nextInt(1, 7);
            System.out.println(player2.getFullName() + " slog: " + diceRoll);
            player2.addToScore(diceRoll);
        }

        System.out.println();
        System.out.println(player1.getFullName() + " fick score: " + player1.getScore());
        System.out.println(player2.getFullName() + " fick score: " + player2.getScore());

        if (player1.getScore() > player2.getScore()) {
            System.out.println("Vinnare: " + player1.getFullName());
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println("Vinnare: " + player2.getFullName());
        } else {
            System.out.println("Det blev oavgjort.");
        }

        scanner.close();
    }
}