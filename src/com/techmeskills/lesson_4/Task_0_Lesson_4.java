package com.techmeskills.lesson_4;

import java.util.Arrays;
import java.util.Scanner;

/** Создайте массив целых чисел. Напишете программу, которая выводит
 * сообщение о том, входит ли заданное число в массив или нет.
 * Пусть число для поиска задается с консоли (класс Scanner).
 */

public class Task_0_Lesson_4 {
    public static void main(String[] args) {

        int[] array = {22, 11, 63, 9, 5, 19, 45, 1, 9, 39, 14, 44};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an array element ... ");
        int argument = sc.nextInt();
        boolean found = Arrays.stream(array).anyMatch(num -> num == argument);

        System.out.print(found ? "Element " + argument + " found."
                               : "Element " + argument + " not found.");
    }
}