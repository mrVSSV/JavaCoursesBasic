package week1;

import java.util.Scanner;

/*
        Дана площадь круга, нужно найти диаметр окружности и длину окружности.
        Входные данные: 91
        Выходные данные:
        Diameter: 10.764051215546116 length: 33.81626422162396
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double s = scanner.nextDouble();
        double diameter = Math.sqrt(s * 4 / Math.PI);
        double length = Math.PI * diameter;

        System.out.println("Diameter: " + diameter + " length: " + length);
    }
}
