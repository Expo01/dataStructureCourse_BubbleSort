package algorithms.sorts.bubblesort;

import java.util.Arrays;

import static algorithms.sorts.bubblesort.BubbleSort.bubbleSort;

public class Main {
    public static void main(String[] args) {

        int[] myArray = {4,2,6,5,1,3};

        bubbleSort(myArray);

        System.out.println( Arrays.toString(myArray) );
    }
}