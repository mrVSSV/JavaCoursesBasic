package week1;
/*
    Перевод литров в галлоны.
    С консоли считывается число n –  количество литров, которое нужно перевести в галлоны.
    (1 литр = 0,219969 галлонна)
 */

import java.util.Scanner;

public class Task10 {
    static final double LITER_TO_GALLON = 0.219969;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количетсво литров: ");
        int n = scanner.nextInt();

        System.out.println("Количество галлонов " + n * LITER_TO_GALLON + " в литре");

    }
}
