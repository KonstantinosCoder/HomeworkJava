package Drafts;

import java.util.Scanner;

public class Dec2Bin {
    public static void main() {
        Scanner in = new Scanner(System.in);
        int value;
        System.out.print("Enter a number: ");
        value = in.nextInt();

        int temp = value;
        String binary = "";

        while(temp>0){
            int rem = temp%2;
            binary = rem + binary;
            temp = temp/2;
        }
        System.out.println(binary);
    }
}
