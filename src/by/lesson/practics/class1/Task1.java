package by.lesson.practics.class1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        int x, y, z, c;
        // 1. Дано уравнение: (10+12)*x=88;. Найти значение x.
        System.out.println("Задание 1");
        x = 88 / (10 + 12);
        System.out.println("x = " + x);

        // 4. Введите x,y,z. К числу x прибавьте y, число y умножьте на z. Используйте операции присваивания.
        // * Результат выведите в косноль
        System.out.println("*********");
        System.out.println("Задание 2");

        Scanner sc = new Scanner(System.in);
        System.out.printf("x = ");
        x = sc.nextInt();
        System.out.printf("y = ");
        y = sc.nextInt();
        System.out.printf("z = ");
        z = sc.nextInt();
        x += y;
        y *= z;
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);

        // 5. Дано уравнение 213/x+258/x+60=217. Найдите x
        System.out.println("*********");
        System.out.println("Задание 3");

        System.out.println("x = " + (213 + 258) / (217 - 60));

        // 6. Даны значения: x=5; y=2; c=x*y;
        // * 6.2 Расставьте операции инкремента декремента так,
        // * чтобы после выполнения операции (c=x*y) с=10; x=6; y=1
        System.out.println("*********");
        System.out.println("Задание 4");

        x = 5;
        y = 2;
        c = x++ * y--;

        System.out.println("x = " + x + ", y = " + y + ", c = " + c);
    }
}
