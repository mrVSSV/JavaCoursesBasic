package week1;

import java.util.Scanner;

/*
    Напишите программу, которая получает два числа с плавающей точкой х и у в аргументах командной строки
    и выводит евклидово расстояние от точки (х, у) до точки (0, 0)
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите х и у через пробел ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        System.out.println(Math.sqrt(Math.pow(x,2) + Math.pow(y,2)));

    }
}
