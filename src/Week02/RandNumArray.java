package Week02;

import java.util.Random;
public class RandNumArray {
    public static void main() {

        Random gen = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int a = gen.nextInt(100);
            arr[i] = a;
            System.out.print(arr[i] + " ");
        }
//--------------------------------
        int max = arr[0];
        int min = arr[0];
        for (int n : arr) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        System.out.println("\nMax: " + max);
        System.out.println("Min: " + min);
//---------------------------------
        float avg, sum = 0;
        for (int num : arr) {
            sum += num;
        }
        avg = sum / arr.length;
        System.out.println("The average is: " + avg);
//---------------------------------
        int odd = 0;
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                ++odd;
            } else {
                ++even;
            }
        }
        System.out.println("The odds are: " + odd);
        System.out.println("And the evens are: " + even);

    }
}
