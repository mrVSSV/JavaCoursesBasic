package week2;
/*
Даны два числа a и b. Проверить утверждение, что только одно из них нечетное.
    10 10 false
    11 10 true
    10 11 true
    11 11 false
 */

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println((a ^ b) == 1);
    }
}
