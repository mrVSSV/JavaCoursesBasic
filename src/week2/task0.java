package week2;

/*
    С помощью тернарного оператора замените инициализацию переменной y в указанном коде:
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y;
    if (x > 0) {
        if (x < 100) {
            y = 1;
        } else {
            y = 0;
        }
    } else {
        y = -1;
    }
 */

import java.util.Scanner;

public class task0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = (x > 0) ? (x < 100) ? 1 : 0 : -1;

        System.out.println(y);

    }
}
