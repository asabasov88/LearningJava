package com.learningparsinginjava;

public class LargestPrime {

    public static void main(String[] args) {

        // test here

    }

    public static int getLargestPrime(int number) {

        if (number <= 1) {

            return -1;

        }

        int i;
        int r;
        int e;


        for (i = (number - 1); i > 1; i--) {

            if (number % i == 0) {

                break;  // here we have 16 % 8 == 0, so the prime [i = 8;]

            }

        }

            for (r = (i - 1); r > 1; r--) {

                if (i % r == 0) {

                    break;

                }

            }

            for (e = (r - 1); e > 1; e--) {

                if (r % e == 0) {

                    break;

                }

            }

        if (i > 1 && r <= 1 && e <= 1) {

            return i;

        } else if (i <= 1 && r <= 1 && e <= 1) {

            return number;

        } else if (r > 1 && e <= 1) {

            return r;

        } else {

            return e;

        }

    }

}
