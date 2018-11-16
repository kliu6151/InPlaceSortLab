package KevinLiu;

import java.util.Arrays;

public class Algorithms {

    public static void swapInt(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void swapDouble(double[] arr, int i, int j)
    {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void swapString(String[] arr, int i, int j)
    {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }



    public static void bubbleSort(String[] arr)
    {
        //This will loop through the entire array, ensuring all the indexes are checked
        for (int i = 0; i < arr.length; i++)
        {
            //This will loop through for each individual number/index
            for (int j = 0; j < arr.length - i - 1; j++) {
                //If the number is greater than the next
                // number, then they will switch
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    swapString(arr, j, j + 1);
                }
            }
        }

    }

    public static void selectionSort(double[] arr)
    {
        //Loops through unsorted array
        for(int i = 0; i < arr.length - 1; i++)
        {
            int min = i;
            //Compares arr[i] with all other indexes
            for(int j = i + 1; j<arr.length; j++)
            {
                //Sets min to the index with a number smaller the index it was currently at
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }
            //Swaps the two indexes, unless it is at the same position
            if(min != i)
            {
                swapDouble(arr, i, min);
            }

        }
    }

    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++) {
            int mainValue = arr[i];
            int j = i-1;

            while (j>=0 && arr[j] > mainValue)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = mainValue;
        }
    }

    //Creates an array of random integers
    public static int[] randIntArr(int count)
    {
        int[] arr = new int[count];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random()*10000);
        }
        return arr;
    }

    public static double[] randDoubleArr(int count)
    {
        double[] arr = new double[count];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = Math.random()*10000.0;
        }
        return arr;
    }


}