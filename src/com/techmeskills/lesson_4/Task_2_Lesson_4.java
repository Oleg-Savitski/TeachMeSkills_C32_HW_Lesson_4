package com.techmeskills.lesson_4;

import java.util.Arrays;
import java.util.Scanner;

/** Создайте и заполните массив случайным числами и выведете
 * максимальное, минимальное и среднее значение.
 * Для генерации случайного числа используйте метод Math.random().
 * усть будет возможность создавать массив произвольного размера.
 * Пусть размер массива вводится с консоли.
 */


public class Task_2_Lesson_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array ...");

        int length = sc.nextInt();
        int[] array = new int[length];
        int counter = 0;
        int sum = 0;

        for (int i = 0; i < length; i++) {
            array[i] = (int) ((Math.random() * 100) + counter );
            sum = sum + array[i];

        }
        System.out.println("Your array: " + Arrays.toString(array));
        System.out.println("The minimum value in the array: " + Arrays.stream(array).min().getAsInt());
        System.out.println("The maximum value in the array: " + Arrays.stream(array).max().getAsInt());
        System.out.println("The sum of all values in the array: " + sum);
        System.out.println("The average value of the numbers in the array: " + sum / array.length);

    }
}
