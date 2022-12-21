package week2;

// Дано число n. Нужно проверить четное ли оно.
/*

        Входные данные: 4
        Выходные данные: true или (Число четное)

        Входные данные: 3
        Выходные данные: false или (Число нечетное)
 */

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        String str;

        if (n % 2 == 0) {
            str = "четное";
        } else {
            str = "нечетное";
        }
        System.out.println(str);

        String str2 = (n % 2 == 0) ? "число четное" : "число нечетное";
        System.out.println(str2);
    }
}
