package week1;

/*
        Напишите аналог функции swap, которая меняет значения двух параметров местами без вспомогательной переменной.
        Входные данные: a = 7, b = 5
        Выходные данные: a = 5, b = 7
 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }
}
