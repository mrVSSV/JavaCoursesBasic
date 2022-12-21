package week1;

import java.util.Scanner;

/*
    Дано двузначное число.
    Вывести сначала первую цифру (единицы), затем правую (десятки)
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = x / 10;
        int b = x % 10;
        System.out.println(a);
        System.out.println(b);
    }

}
