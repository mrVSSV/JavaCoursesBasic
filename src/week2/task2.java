package week2;

import java.util.Scanner;

/*
    Дано число n.
    Если оно четное и больше либо равно 0, то вывести “Четное больше или равно 0”.
    Если четное и меньше 0, то вывести “Четное меньше 0”.
 */
public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

//        if (n % 2 == 0 && n >= 0) {
//            System.out.println("Четное больше или равно 0");
//        } else if (n % 2 == 0 && n < 0) {
//            System.out.println("Четное меньше 0");
//        }

        if (n % 2 == 0) {
            if (n >= 0) {
                System.out.println("Четное больше или равно 0");
            } else {
                System.out.println("Четное меньше 0");
            }
        }
    }
}
