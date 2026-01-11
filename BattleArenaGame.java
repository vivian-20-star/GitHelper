import java.util.Scanner;
import java.util.Random;

public class BattleArenaGame {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    // Biv was here
    public static void main(String[] args) {
        System.out.println("🔥 Welcome to the Battle Arena! 🔥");
        System.out.print("Enter your hero's name: ");
        String playerName = scanner.nextLine();

        int playerHealth = 100;
        int score = 0;
        boolean gameOver = false;

        while (!gameOver) {
            System.out.println("\n⚔️  A wild monster appears!");
            int monsterHealth = random.nextInt(50) + 30;
            System.out.println("Monster Health: " + monsterHealth);

            while (monsterHealth > 0 && playerHealth > 0) {
                System.out.println("\nYour Health: " + playerHealth);
                System.out.println("1. Attack");
                System.out.println("2. Heal");
                System.out.print("Choose your action: ");
                String choice = scanner.nextLine();

                if (choice.equals("1")) {
                    int playerAttack = random.nextInt(20) + 10;
                    monsterHealth -= playerAttack;
                    System.out.println("You attacked the monster for " + playerAttack + " damage!");
                } else if (choice.equals("2")) {
                    int heal = random.nextInt(15) + 10;
                    playerHealth += heal;
                    System.out.println("You healed yourself for " + heal + " health!");
                } else {
                    System.out.println("Invalid action! The monster attacks while you hesitate...");
                }

                if (monsterHealth > 0) {
                    int monsterAttack = random.nextInt(15) + 5;
                    playerHealth -= monsterAttack;
                    System.out.println("The monster attacks you for " + monsterAttack + " damage!");
                }
            }

            if (playerHealth <= 0) {
                System.out.println("\n💀 " + playerName + ", you were defeated! Game Over!");
                gameOver = true;
            } else {
                score += 1;
                System.out.println("\n🎉 You defeated the monster! Current Score: " + score);
                System.out.print("Do you want to fight another monster? (yes/no): ");
                String continueGame = scanner.nextLine().toLowerCase();
                if (!continueGame.equals("yes")) {
                    System.out.println("\n🏆 Thanks for playing! Final Score: " + score);
                    gameOver = true;
                }
            }
        }

        scanner.close();
    }
}
