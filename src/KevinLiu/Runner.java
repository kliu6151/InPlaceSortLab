package KevinLiu;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        int[] arr = InPlaceSorts.randIntArr(500);
        System.out.println(Arrays.toString(arr));
        InPlaceSorts.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        time = System.currentTimeMillis() - time;
        System.out.println("Time taken: " + time * 0.001 + " seconds");
        System.out.println("---------------");
        double[] arrDouble = InPlaceSorts.randDoubleArr(500);
        System.out.println(Arrays.toString(arrDouble));
        InPlaceSorts.selectionSort(arrDouble);
        System.out.println(Arrays.toString(arrDouble));
        System.out.println("---------------");
        String[] arrString = {"always", "American","among","hi","beep","zzep","zoo","bye"};
        System.out.println(Arrays.toString(arrString));
        InPlaceSorts.bubbleSort(arrString);
        System.out.println(Arrays.toString(arrString));
    }
}