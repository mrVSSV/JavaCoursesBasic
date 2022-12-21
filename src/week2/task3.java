package week2;

import java.util.Scanner;

// Дано четырехзначное число. Проверить является ли оно палиндромом.

/*
        Входные данные: 1881
        Выходные данные: true

        Входные данные: 5081
        Выходные данные: false
 */

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int c1 = n / 1000;
        int c2 = c1 / 100;
        int c3 = c2 / 10;
        int c4 = n % 10;
        System.out.println(c1 == c4 && c2 == c3);
    }

}
