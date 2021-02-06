package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input a value: ");
            int number = in.nextInt();
            if (number < 0) System.out.println("Forbidden! Entered number is negative");
            if (number >= 0 && number <= 17) System.out.println("Entered number part of interval 0 - 17");
            if (number >= 18 && number <= 65) System.out.println("Entered number part of interval 18 - 65");
            if (number >= 66) System.out.println("Entered number part of interval 66 - ∞");
        } catch (InputMismatchException e) {
            System.out.println("Something went wrong.");
        }
    }
}
