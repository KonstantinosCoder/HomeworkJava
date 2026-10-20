package Week01;

import java.util.Random;
public class D6BiasTest {
    public static void main() {
        Random random = new Random();
        int ones = 0;
        int twos = 0;
        int threes = 0;
        int fours = 0;
        int fives = 0;
        int sixes = 0;

        for (int i = 0; i < 1200; i++) {
            int roll = random.nextInt(6) + 1;

            switch (roll) {
                case 1:
                    ones++;
                    break;
                case 2:
                    twos++;
                    break;
                case 3:
                    threes++;
                    break;
                case 4:
                    fours++;
                    break;
                case 5:
                    fives++;
                    break;
                case 6:
                    sixes++;
                    break;
            }
        }


        System.out.println("Results after 1200 rolls:");
        System.out.println("Ones:   " + ones);
        System.out.println("Twos:   " + twos);
        System.out.println("Threes: " + threes);
        System.out.println("Fours:  " + fours);
        System.out.println("Fives:  " + fives);
        System.out.println("Sixes:  " + sixes);

        System.out.println("\nTotal rolls counted: " + (ones + twos + threes + fours + fives + sixes));
    }
}
