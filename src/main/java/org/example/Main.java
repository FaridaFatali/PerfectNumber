package org.example;

import java.util.Scanner;

/**
 * Exercise: <a href="https://www.youtube.com/watch?v=c-xhLemC9X4&list=PLEcJSEQK_cD4HTOlqV7xxMH0CYi29adgX&index=27">...</a>
 * @author Farida Fatali
 */

// Checking if the number entered by the user is a perfect number or not.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if ((number % i == 0)) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println(number + " is the Perfect Number.");
        } else {
            System.out.println(number + " is not the Perfect Number.");
        }
    }
}
