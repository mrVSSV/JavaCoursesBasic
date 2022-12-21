package week1;

import java.util.Scanner;

/*
    Вычислить доход работника за неделю.
    Прочитать из консоли данные количество рабочих часов в неделю, часовая ставка, налог.

     Параметры:
     с - количество рабочих часов в неделю
     r - ставка за час
     t - налог

     Входные данные:
     40 часов
     300 в час
     17
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите в консоль 3 часла через пробел: ");
        int c = scanner.nextInt();
        int r = scanner.nextInt();
        int t = scanner.nextInt();

        double result = (c * r) * (100. - t) / 100;
        System.out.println("Доход: " + result);

    }

}
