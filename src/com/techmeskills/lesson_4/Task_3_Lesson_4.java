package com.techmeskills.lesson_4;

import java.util.Arrays;

/** Создайте 2 массива из 5 чисел.
 * Выведите массивы на консоль в двух отдельных строках.
 * Посчитайте среднее арифметическое элементов каждого массива и
 * сообщите, для какого из массивов это значение оказалось больше (либо
 * сообщите, что их средние арифметические равны).
*/

public class Task_3_Lesson_4 {
    public  static void main(String[] args) {
        int[] arrayOne = {11, 12, 13, 14, 15};
        int[] arrayTwo = {10, 9, 8, 7, 6};
        int sumArrayOne = 0;
        int sumArrayTwo = 0;
        System.out.println(Arrays.toString(arrayOne) + '\n' + Arrays.toString(arrayTwo));

        for (int i = 0; i < arrayOne.length; i++) {
            sumArrayOne += arrayOne[i];
        }
        System.out.println("The sum of the elements of the first array is: " + sumArrayOne);
        for (int i = 0; i < arrayTwo.length; i++) {
            sumArrayTwo += arrayTwo[i];
        }
        System.out.println("The sum of the elements of the second array is: " + sumArrayTwo);

        int magnitudeOne = (int) sumArrayOne / arrayOne.length;
        int magnitudeTwo = (int) sumArrayTwo / arrayTwo.length;

        if (magnitudeOne > magnitudeTwo) {
            System.out.println("The sum of the elements of the first array is greater than the sum of the second array. ");

        } else if (magnitudeOne == magnitudeTwo) {
            System.out.println("The sum of the elements of the first array is equal to the sum of the second array. ");

        } else
            System.out.print("The sum of the elements of the two arrays are not equal!");
    }
}
