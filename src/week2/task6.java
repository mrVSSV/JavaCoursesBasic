package week2;

import java.util.Scanner;

/*
        Даны три целых числа a, b, c.
        Проверить есть ли среди них прямо противоположные. ( 5 и -5 прямо противоположные числа).
        0 и 0 не считать прямо противоположными.
        Входные данные
        -1 1 0
        Выходные данные
        true
        Входные данные
        -2 1 0
        Выходные данные
        false
 */

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        System.out.println((x == -y && x != 0) || (x == -y && x != 0) || (y == -z && y != 0));


    }
}
