/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

/**
 *
 * @author Tanzim
 */
import java.util.Scanner;

import java.util.Random;

public class SumWithoutSmallest {

    public static void indexEven(int[] randomNumbers) {

        System.out.print("Even index elements are: ");

        for (int i = 0; i < randomNumbers.length; i++) {

            if (i % 2 == 0) {

                System.out.print(randomNumbers[i] + " ");

            }

        }

        System.out.println();

    }

    public static void evenelement(int[] randomNumbers) {

        System.out.print("Every even element: ");

        for (int i = 0; i < randomNumbers.length; i++) {

            if (randomNumbers[i] % 2 == 0) {

                System.out.print(randomNumbers[i] + " ");

            }

        }

        System.out.println();

    }

    public static void reverseOrder(int[] randomNumbers) {

        System.out.print("All elements in reverse order: ");

        for (int i = randomNumbers.length - 1; i >= 0; i--) {

            System.out.print(randomNumbers[i] + " ");

        }

        System.out.println();

    }

    public static void firstLast(int[] randomNumbers) {

        System.out.print("First and last elements are: ");

        System.out.print(randomNumbers[0] + " " + randomNumbers[randomNumbers.length - 1]);

        System.out.println();

    }

    public static void main(String[] args) {

// create instance of Random class
        Random rand = new Random();

        System.out.print("Array: ");

        int[] randomNumbers = new int[10];

        for (int i = 0; i < randomNumbers.length; i++) {

            randomNumbers[i] = rand.nextInt(100);

            System.out.print(randomNumbers[i] + " ");

        }

        System.out.println();

        indexEven(randomNumbers);

        evenelement(randomNumbers);

        reverseOrder(randomNumbers);

        firstLast(randomNumbers);

    }

}
