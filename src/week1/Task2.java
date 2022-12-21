package week1;

import java.util.Scanner;

/*
        Дано m – количество гигабайт трафика, используемое пользователем за месяц, с – заплаченная цена за этот трафик.
        Вычислить стоимость одного гигабайта трафика.

        Ограничения:
        0 < m < 100

        Входные данные
        m = 5 c = 20
        Выходные данные
        4.0
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите количество гигабайт ");
        int m = console.nextInt();
        int c = console.nextInt();
        System.out.println("Цена гигабайта " + (double) c / m);
    }
}
