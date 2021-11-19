package com.company;

public class Main {
    public static final double percent = 1.5;
    public static final int MAX = 99;

    public static void main(String[] args) {
        task();
        task2();
        task3();
    }


    private static void task() {
        System.out.println(bankInvest(20000, 5));
    }


    public static double bankInvest(int s, int n) {
        return s * Math.pow((1 + (1.5 / 100)), n);
    }

    public static void task2() {
        System.out.println(numbers());
    }

    public static String numbers() {
        StringBuilder str = new StringBuilder();
        for (Integer i = 1; i < MAX; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                str.append("HelloWorld" + " ");
            } else if (i % 3 == 0) {
                str.append("Hello" + " ");
            } else if (i % 5 == 0) {
                str.append("World" + " ");
            } else {
                str.append(i).append(" ");
            }
        }
        return str.toString();
    }

    private static void task3() {
        int[] array = {1, 8, 9, 9, 9, 10, 20, 21};
        System.out.println(findBinary(array, 21, 0, array.length - 1));
    }

    public static boolean findBinary(int[] arr, int binaryNum, int startIndex, int endIndex) {

        if (endIndex >= startIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            System.out.println(midIndex);

            if (arr[midIndex] == binaryNum) {
                return true;
            }
            if (arr[midIndex] > binaryNum) {
                return findBinary(arr, binaryNum, startIndex, midIndex - 1);
            } else {
                return findBinary(arr, binaryNum, midIndex + 1, endIndex);
            }

        }

        return false;
    }
}

