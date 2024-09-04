package com.wang;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1,2,4,5,7,8,9,11,18};
        int target = 19;
        int i = new BinarySearch().binarySearch(array, target);
        System.out.println(i);
    }

    /**
     * binary search
     * @param array
     * @param target
     * @return index of the target or -1
     */
    private int binarySearch(int[] array, int target) {
        if (array == null) {
            return -1;
        }
        int mid;
        int leftIndex = 0, rightIndex = array.length-1;
        while (leftIndex <= rightIndex) {
            mid = (leftIndex + rightIndex) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                leftIndex = mid + 1;
            } else {
                rightIndex = mid - 1;
            }
        }
        return -1;
    }
}
