package by.lesson.practics.class1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        // 1. Ввести числа a и b с консоли. Если a>b, то вывести разность (a-b) передав ее в новую переменную. Иначе если a=b  вывести сумму этих чисел.
        // * Иначе, вывести разность b-a. Результат вычисления передать в новую переменную.
        System.out.println("Задание 1");

        System.out.printf("a = ");
        a = sc.nextInt();
        System.out.printf("b = ");
        b = sc.nextInt();

        System.out.printf("result = ");
        if (a > b) {
            c = a - b;
            System.out.println(c);
        } else if (a == b) {
            c = a + b;
            System.out.println(c);
        } else {
            c = b - a;
            System.out.println(c);
        }

        // 2. Ввести числа a и b с консоли. Если a>b и b не равно 0-вывести результат деления a на b.
        // * Иначе если a не равно 0, вывести b/a, Иначе вывести сумму чисел a и b.
        System.out.println("*********");
        System.out.println("Задание 2");

        System.out.printf("a = ");
        a = sc.nextInt();
        System.out.printf("b = ");
        b = sc.nextInt();

        System.out.printf("result = ");
        if (a > b && b != 0) {
            c = a / b;
            System.out.println(c);
        } else if (a != 0) {
            c = b / a;
            System.out.println(c);
        } else {
            c = a + b;
            System.out.println(c);
        }

        // 3. На вход дано число. Определить, делиться ли оно на три. Вывести соответствующий текст.
        System.out.println("*********");
        System.out.println("Задание 3");

        // 4. На вход дано число. Определить, делиться ли оно на 3 и на 7, если нет, тогда проверить делиться ли оно на 3, если не делиться, то проверить, делиться ли оно на 7. Вывести соответствующий текст.
        System.out.println("*********");
        System.out.println("Задание 4");

        // 6. На вход даны три числа. Определить максимальное из них
        System.out.println("*********");
        System.out.println("Задание 5");


    }
}