package week2;

import java.util.Scanner;

/*
        Дана строка и паттерн, заменить паттерн на паттерн, состоящий из заглавных символов
        Входные данные:
        Hello world
        ld
        Выходные данные:
        Hello worLD
 */

public class task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String pat = scanner.nextLine();

        System.out.println(str.replace(pat,pat.toUpperCase()));
    }
}
