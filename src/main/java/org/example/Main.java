package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] firstArray = new int[3][3];

        System.out.println("Пустой массив: " + Arrays.deepToString(firstArray));

        for (byte i = 0; i <= 2; i++) {
            for (byte j = 0; j <= 2; j++) {
                Random random = new Random();
                firstArray[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Заполненный массив: " + Arrays.deepToString(firstArray));

        int[][] secondArray = new int[2][5];

        System.out.println("Сравнение массивов: " + Arrays.deepEquals(secondArray, firstArray));
    }
}