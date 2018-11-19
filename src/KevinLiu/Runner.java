package KevinLiu;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        int[] arr = InPlaceSorts.randIntArr(50000);
        System.out.println(Arrays.toString(arr) + "\n Processing...");
        InPlaceSorts.insertionSort(arr);
        System.out.println(Arrays.toString(arr) + "\n Done");
        time = System.currentTimeMillis() - time;
        System.out.println("Time taken: " + time * 0.001 + " seconds");
        System.out.println("---------------");
        double[] arrDouble = InPlaceSorts.randDoubleArr(50000);
        time = System.currentTimeMillis();
        System.out.println(Arrays.toString(arrDouble) + "\n Processing...");
        InPlaceSorts.selectionSort(arrDouble);
        System.out.println(Arrays.toString(arrDouble) + "\n Done");
        time = System.currentTimeMillis() - time;
        System.out.println("Time taken: " + time * 0.001 + " seconds");
        System.out.println("---------------");
        String[] arrString = InPlaceSorts.randomStringArr(50000, 4);
        time = System.currentTimeMillis();
        System.out.println(Arrays.toString(arrString) + "\n Processing...");
        InPlaceSorts.bubbleSort(arrString);
        System.out.println(Arrays.toString(arrString) + "\n Done");
        time = System.currentTimeMillis() - time;
        System.out.println("Time taken: " + time * 0.001 + " seconds");
    }
}