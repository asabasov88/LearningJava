package com.learningparsinginjava;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        int enteredNumber;
        double sum = 0;
        double average;
        double inputCounter = 0;

        while (true) {

            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {

                enteredNumber = scanner.nextInt();
                sum += enteredNumber;
                inputCounter++;
                scanner.nextLine();

            } else {

                scanner.close();
                average = Math.round(sum / inputCounter);
                System.out.println("SUM = " + ((int) sum) + " AVG = " + ((int) average));
                break;

            }

        }

    }

}
