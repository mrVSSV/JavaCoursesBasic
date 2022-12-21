package week2;

/*
        Дан символ, поменять со строчного на заглавный или с заглавного на строчный

        Входные данные: d
        Выходные данны: D
        Входные данные: A
        Выходные данные: a
 */

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);

        if (c >= 'a' && c <= 'z') {
            System.out.println((char) (c + ('A' - 'a')));
        } else {
            System.out.println((char) (c - ('A' - 'a')));
        }


    }
}
