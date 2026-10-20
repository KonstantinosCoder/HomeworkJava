package Week01;

import java.util.Random;
public class D6Sim {
    public static void main() {
        Random gen = new Random();

        int result = gen.nextInt(6) + 1;

        System.out.println("You rolled a " + result + ".");
    }
}
