package com.techmeskills.lesson_4;

import java.util.Arrays;
import java.util.Scanner;

/** Создайте массив целых чисел. Удалите все вхождения заданного
 * числа из массива.
 * Пусть число задается с консоли (класс Scanner). Если такого числа нет -
 * ведите сообщения об этом.
 * В результате должен быть новый массив без указанного числа.
 */

public class Task_1_Lesson_4 {
    public static void main(String[] args) {
        int[] array = {22, 11, 63, 9, 5, 19, 45, 1, 9, 39, 14, 44};
        System.out.println("Enter the element from the array that you want to delete ...");
        Scanner sc = new Scanner(System.in);
        int argument = sc.nextInt();
        int counter = 0;
        for (int i : array) {
            if (argument == i) {
                counter++;
            }
        }
        int[] newArray = new int[array.length - counter];
        int newCounter = 0;
        for (int i : array) {
            if (i != argument) {
                newArray[newCounter] = i;
                newCounter++;
            }
        }
        if (newArray.length != array.length) {
            System.out.println("The original: " + Arrays.toString(array));
            System.out.println("New: " + Arrays.toString(newArray));
        } else {
            System.out.println("The array remains unchanged.");
        }
    }
}