package week2;

import java.util.Scanner;

/*
        Реализовать System.out.println(), используя System.out.print() и табуляцию \n
        Входные данные: два слова, считываемые из консоли

        Входные данные
        Hello World
        Выходные данные
        Hello
        World
        */

public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String str2 = scanner.next();

        System.out.println(str + "\n" + str2);
    }
}
