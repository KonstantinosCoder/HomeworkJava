package Week01;

import java.util.Random;
public class D6Sim2 {
    public static void main() {
        Random random = new Random();
        int player = random.nextInt(6) + 1;
        int computer = random.nextInt(6) + 1;

        System.out.println("\nThe Player rolled: " + player);
        System.out.println("The Computer rolled: " + computer);

        if (player > computer) {
            System.out.println("Player wins!");
        } else if (computer > player) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
