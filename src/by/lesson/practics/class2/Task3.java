package by.lesson.practics.class2;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    /*  - 1. Необходимо, чтобы программа отображала следующую последовательность чисел:
        7 14 21 28 35 42 49 56 63 70 77 84 91 98 (while)
        - 2. Написать программу, которая посчитает сумму первых 10 чисел (while)
        - 3. Вывести числа от 100 до 1 через запятую. В конце не должно быть запятой
        3.1 Вывести каждый десяток от 1 до 100. (for)
        4. Вывести только нечётные числа от 1 до 100.
        5. Создать массив чисел от 1 до 100. Вывести полученный массив.
        6. Создать массив из чисел. Вывести макс и мин число.
        7. Ввести число с консоли, которое не заканчивается на 0. Вывести среднее значение всех цифр в числе. Использовать оператор %. (while)
        8. Ввести число с консоли, которое не заканчивается на 0. Вывести макс и мин цифру в числе. Использовать оператор %. (while) */

    public static void main(String[] args) {
        // 1
        System.out.println("1 *****");
        int i = 7;
        while (i <= 98) {
            System.out.printf(i + " ");
            i += 7;
        }

        //2
        System.out.println();
        System.out.println("2 *****");
        int sum = 0;
        i = 1;
        while (i < 10) {
            sum += i;
            i++;
        }
        System.out.println(sum);

        //3
        System.out.println("3 *****");

        for (int j = 100; j > 0; j--) {
            System.out.printf(j + (j > 1 ? ", " : ""));
        }

        System.out.println();

        for (int j = 0; j <= 100; j += 10) {
            System.out.printf(j + " ");
        }

        //4
        System.out.println();
        System.out.println("4 *****");

        for (int j = 1; j <= 100; j++) {
            if (j % 2 != 0)
                System.out.printf(j + " ");
        }

        //5
        System.out.println();
        System.out.println("5 *****");
        int[] arr = new int[100];

        for (int j = 0; j < 100; j++) {
            arr[j] = j + 1;
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.printf(arr[j] + " ");
        }

        //6
        System.out.println();
        System.out.println("6 *****");

        int[] arr2 = {1, 2, 8, 4, 0, 6, 7};
        int max = arr2[0], min = arr2[0];

        for (int j = 0; j < arr2.length; j++) {
            if (arr2[j] > max) max = arr2[j];
            if (arr2[j] < min) min = arr2[j];
        }
        System.out.println("max = " + max + ",  min = " + min);

        //7
        System.out.println("7 *****");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(), y = 0, count = 0;

        if (x % 10 != 0) {
            while (x != 0) {
                y += x % 10;
                x /= 10;
                count++;
            }
            System.out.println("y = " + (float) y / count);
        } else System.out.println("Не должно заканчиваться на 0");

        //8
        System.out.println("8 *****");
        x = sc.nextInt();
        max = x % 10;
        min = x % 10;

        if (x % 10 != 0) {
            while (x != 0) {
                max = Math.max(x % 10, max);    //x % 10 > max ? x % 10 : max;
                min = Math.min(x % 10, min);
                ;
                x /= 10;
            }
            System.out.println("max = " + max + ",  min = " + min);
        } else System.out.println("Не должно заканчиваться на 0");

        //9. Сортировать массив чисел в порядке возрастания. Сортировка пузырьком
        System.out.println("9 *****");

        int[] arr3 = {5, 1, 7, 4, 7, 34, 2, 6, 8}; //new int[100];

        /*for (int j = 0; j < 100; j++) {
            arr3[j] = (int) (Math.random() * 100) + 1;
        }*/

        for (int j = 0; j < arr3.length - 1; j++) {
            for (int k = 0; k < arr3.length - 1; k++) {
                int temp = arr3[k + 1];
                arr3[k + 1] = Math.max(arr3[k + 1], arr3[k]);
                arr3[k] = Math.min(temp, arr3[k]);
            }
        }

        for (int k : arr3) {
            System.out.printf(k + " ");
        }
    }
}
