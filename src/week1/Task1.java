package week1;

import java.util.Arrays;
import java.util.Scanner;

/*
    Даны числа a, b, c. Перенести значения из a в b, из b в сб с в ф

    Входные данные
    3 2 1
    Выходные данные
    а = 1, b = 3, c = 2
 */
public class Task1 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 3 числа через пробел ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        System.out.println("а = " + a + ", b = " + b + ", c = " + c);

        int temp = c;
        c = b;
        b = a;
        a = temp;
        System.out.println("а = " + a + ", b = " + b + ", c = " + c);
    }
}
