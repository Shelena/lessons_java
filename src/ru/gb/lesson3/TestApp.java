package ru.gb.lesson3;

import java.util.Arrays;

public class TestApp {
    public static void main(String[] args) {
        int[] firstArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] secondArr = new int[100];
        int[] thirdArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] fourArr = new int[5][5];
        doTask5(5, 2);
        int[] sixArr = {48, 5, 3, 2, 24, 4, 5, 1, 4, 8, 9, 2};
        int max = sixArr[0];
        int min = sixArr[0];

        for (int i = 0; i< firstArr.length; i++)
            if (firstArr[i] == 1) {
                firstArr[i] = 0;
            } else {
                firstArr[i] = 1;
            }

        for (int i = 0; i< secondArr.length; i++) {
            secondArr[i] = i;
        }

        for (int i = 0; i< thirdArr.length; i++) {
            if (thirdArr[i] < 6) {
                thirdArr[i] *=2;
            }
        }

        for (int i = 0; i< fourArr.length; i++) {
            for (int j = 0; j< fourArr.length; j++) {
                if (i == j) {
                    fourArr[i][j] = 1;
                }
                System.out.print(fourArr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < sixArr.length; i++) {
            if (sixArr[i] > max) {
                max = sixArr[i];
            }
        }

        for (int i = 0; i < sixArr.length; i++) {
            if (sixArr[i] < min) {
                min = sixArr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

        System.out.println(Arrays.toString(firstArr));
        System.out.println(Arrays.toString(secondArr));
        System.out.println(Arrays.toString(thirdArr));

    }
    public static void doTask5(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(i + ":" + arr[i] + " ");
        }
        System.out.println();
    }

}
