package week1;
/*
        n - число детей
        k - число конфет

        1. Вывести сколько конфет достанется каждому ребенку, если стараться делить их поровну
        2. Вывести сколько конфет останется взрослым после выдачи конфет детям

        (1) Входные данные: 5 3
        (2) Входные данные: 3 17
 */

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите количество детей: ");
        int child = scanner.nextInt();

        System.out.print("Укажите количество конфет: ");
        int sweet = scanner.nextInt();

        int sweetForChild = sweet / child;
        System.out.println("Каждому ребенку достанется по " + sweetForChild + " конфет.");
        int sweetForAdult = sweet % child;
        System.out.println("Взрослым остается " + sweetForAdult + " конфеты.");
    }
}
