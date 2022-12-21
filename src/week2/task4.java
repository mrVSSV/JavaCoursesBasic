package week2;

import java.util.Scanner;
/*
Напишите систему проверки цен на номер отеля по его типу.
Считать данные из консоли о типе номера отеля (Данные вводятся в виде значения int).
1 - VIP, 2 - Premium,  3 - Comfort,  4 - Economy.
Вывести цену номера:  VIP 12500 руб., Premium 9000 руб.,  Standard 6300 руб., Economy 3800 руб.
 */
public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        switch (n) {
            case 1 -> System.out.println("VIP 12500 руб.");
            case 2 -> System.out.println("Premium 9000 руб.");
            case 3 -> System.out.println("Standard 6300 руб.");
            case 4 -> System.out.println("Economy 3800 руб.");
        }
//        if (n > 0 && n <=4) {
//            if (n == 1) {
//                System.out.println("VIP 12500 руб.");
//            } else if (n == 2) {
//                System.out.println("Premium 9000 руб.");
//            } else if (n == 3) {
//                System.out.println("Standard 6300 руб.");
//            } else if (n == 4) {
//                System.out.println("Economy 3800 руб.");
//            }
//        } else {
//            System.out.println("Произошла ошибка!");
//        }


    }
}
