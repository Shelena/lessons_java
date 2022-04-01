package ru.gb.lesson2;

public class TestApp {
    public static void main(String[] args) {
        System.out.println(pervoeZad(1, 9));
        vtoroeZad(10);
        System.out.println(treteZad(-25));
        chetvZad("Строка", 6);

    }

    public static boolean pervoeZad(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <=20) {
            return true;
        }
        return false;
    }

    public static void vtoroeZad(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean treteZad(int x) {
        if (x >= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void chetvZad(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }

}