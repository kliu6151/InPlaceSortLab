package KevinLiu;

import java.util.Arrays;

public class InPlaceSorts {

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

    public static void mergeSort(int[] elements)
    {
        int n = elements.length;
        int[] temp = new int[n];
        mergeSortHelper(elements, 0, n-1, temp);
    }
    private static void mergeSortHelper(int[] elements,
                                        int from, int to, int[] temp)
    {
        if(from < to)
        {
            int middle = (from + to) / 2;
            mergeSortHelper(elements, from, middle, temp);
            mergeSortHelper(elements, middle + 1, to, temp);
            merge(elements, from, middle, to, temp);
        }
    }
    private static void merge(int[] elements,
                              int from, int mid, int to, int[] temp)
    {
        int i = from;
        int j = mid + 1;
        int k = from;

        while(i <= mid && j <= to)
        {
            if(elements[i] < elements[j])
            {
                temp[k] = elements[i];
                i++;
            }
            else
            {
                temp[k] = elements[j];
                j++;
            }
            k++;
        }
        while (i <= mid)
        {
            temp[k] = elements[i];
            i++;
            k++;
        }

        while (j <= to)
        {
            temp[k] = elements[j];
            j++;
            k++;
        }

        for (k = from; k <= to; k++)
        {
            elements[k] = temp[k];
        }
    }
    public static int partition(int[] arr, int left, int right)
    {
        int pivot = arr[right];
        int i = left - 1;
        for(int j  = left; j <right;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                swapInt(arr,i,j);
            }
        }
        swapInt(arr,i+1,right);
        return i+1;
    }

    public static void quickSort(int[] arr,int left, int right)
    {
        if(left<right)
        {
            int pivot = partition(arr,left,right);

            quickSort(arr,left,pivot - 1 );
            quickSort(arr,pivot + 1, right);
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

    public static String[] randomStringArr(int num, int length)
    {
        String [] arr = new String [num];
        while(num>0)
        {
            int i =0;
            String s = "";
            while(i<length)
            {
                char c = (char)((Math.random()*26)+97);
                s = s + c;
                i++;
            }
            num--;
            arr[num]=s;
        }
        return arr;
    }
}
