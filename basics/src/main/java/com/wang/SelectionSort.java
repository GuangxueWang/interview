package com.wang;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {3, 2, 1, 6, 7, 4};
//        int[] array = {1, 2, 3, 4, 5, 7};
        new SelectionSort().selectionSort(array);
//        System.out.println(Arrays.toString(array));
    }

    /**
     * selection sort
     */
    public void selectionSort(int[] array) {
        // select the min index i
        for (int i = 0; i < array.length-1; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            swap(array, i, min);
            System.out.println(Arrays.toString(array));
        }
    }

    /**
     * swap elements of index i and index j
     */
    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
