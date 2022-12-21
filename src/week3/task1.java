package week3;

/*
Проверить, является ли введенная строка корректным hex номером цвета.
Корректная строка состоит из 7 символов, первый символ “#”, далее цифры или буквы от A до F (заглавные или прописные).

Если строка является корректным hex номером цвета, то вывести true, иначе false.

#00AA12
true

00FFFF
false

#00FA
false
 */

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        System.out.println(line.matches("#[0-9]{2}[a-zA-Z]{2}[0-9]{2}"));

    }
}
