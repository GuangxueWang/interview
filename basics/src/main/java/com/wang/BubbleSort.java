package com.wang;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] array = {3, 2, 1, 6, 7, 4};
        int[] array = {1, 2, 3, 4, 5, 7};
//        new BubbleSort().bubbleSort(array);
//        new BubbleSort().bubbleSort_v2(array);
//        new BubbleSort().bubbleSort_v3(array);
        new BubbleSort().bubbleSort_v4(array);
    }


    /**
     * bubble sort
     */
    public void bubbleSort(int[] array) {
        for (int i = 0; i < array.length -1; i++) { // epoch
            System.out.println("Epoch " + (i+1));
            for (int j = 0; j < array.length-1; j++) { // compare
                if (array[j] > array[j + 1]) {
                    swap(array, j + 1, j);
                    System.out.println(Arrays.toString(array));
                }
            }
            System.out.println("Epoch " + (i+1) + ":" + Arrays.toString(array));
        }

    }

    public void bubbleSort_v2(int[] array) {
        for (int i = 0; i < array.length -1; i++) { // epoch
            System.out.println("Epoch " + (i+1));
            // reduce compare times
            for (int j = 0; j < array.length-1-i; j++) { // compare
                if (array[j] > array[j + 1]) {
                    swap(array, j + 1, j);
                    System.out.println(Arrays.toString(array));
                }
            }
            System.out.println("Epoch " + (i+1) + ":" + Arrays.toString(array));
        }
    }

    public void bubbleSort_v3(int[] array) {
        // reduce epoch times
        boolean flag = false;
        for (int i = 0; i < array.length -1; i++) { // epoch
            System.out.println("Epoch " + (i+1));

            for (int j = 0; j < array.length-1-i; j++) { // compare
                if (array[j] > array[j + 1]) {
                    flag = true;
                    swap(array, j + 1, j);
                    System.out.println(Arrays.toString(array));
                }
            }
            // reduce compare times
            if (!flag) {
                break;
            }
            System.out.println("Epoch " + (i+1) + ":" + Arrays.toString(array));
        }
    }

    /**
     * reduce compare times using last swap index
     */
    public void bubbleSort_v4(int[] array) {
        int n = array.length - 1;
        while (true) {
            int last = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i + 1, i);
                    last = i;
                    System.out.println(Arrays.toString(array));
                }
            }
            n = last;
            if (n == 0) {
                break;
            }
        }
    }

    /**
     * swap array element of index i and index j
     */
    public void swap(int[] array, int i, int j) {
        if (array[i] != array[j]) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
