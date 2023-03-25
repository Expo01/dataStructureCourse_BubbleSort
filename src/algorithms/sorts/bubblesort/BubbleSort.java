package algorithms.sorts.bubblesort;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) { // first for loop really only defines the termination for the
            // seceond loop. supposing a list has 6 items,
            for (int j = 0; j < i; j++) { //this gets a little tricky, so i'll explain using the unsorted array from main
                // {4,2,6,5,1,3}. Note that the first for loop decrements because each full loop of the nested looop
                // with variable 'j' will effectively move the highest value into the right most spot but may also swap
                // other values along the way. such that beceause the highest value is in the highest place from being
                //bubbled up, the number of comparisons for remaining itemes will be decremented as seen in the first for
                // loop because 5 is not greater than 6 in the higheest place value
                if (array[j] > array[j + 1]) { // using start value '4' as the example, it is higher than 2
                    int temp = array[j]; // temp variable assigned,
                    array[j] = array[j + 1];
                    array[j + 1] = temp; //variables effectively swapped. at this point '2' is at index 0 and '4' is at
                    // index one which finishes the first loop where 'j' = '0'. In second iteration, 'j' = '1' and 4 got
                    // moved to index '1' so 4 is still the subject of comparison. however, 4 is not bigger than 6 and the
                    // other code is not run. Now 'j' = 2 but since 4 was not swapped, 4 is no longer the subject of comparison
                    // rather '6' is the value at index 2. this loop will continue swapping 6 for other values where 6
                    // will remain the subject of comparison because the its array index increases along with the 'j' value
                    // indicating the index value of comparison. finally 6 reaches the largeeset index (index 5) and the
                    // nested loop breaks and we return to outer loop which sets the new termination as one less, as 6 has
                    // successfully assumed the highest index as the highest value. now the nested for loop starts over again,
                    // starting with index 0 which has value of '2', etc.
                }
            }
        }
    }
}