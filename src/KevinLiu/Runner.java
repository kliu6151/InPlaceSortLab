package KevinLiu;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int[] arr = Algorithms.randIntArr(5);
        System.out.println(Arrays.toString(arr));
        Algorithms.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------");
        double[] arrDouble = Algorithms.randDoubleArr(5);
        System.out.println(Arrays.toString(arrDouble));
        Algorithms.selectionSort(arrDouble);
        System.out.println(Arrays.toString(arrDouble));
        System.out.println("---------------");
        String[] arrString = {"always", "American","among","hi","beep","zzep","zoo","bye"};
        System.out.println(Arrays.toString(arrString));
        Algorithms.bubbleSort(arrString);
        System.out.println(Arrays.toString(arrString));
    }
}