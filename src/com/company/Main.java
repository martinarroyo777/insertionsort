package com.company;

/**
 * Implementation of Insertion Sort for Data Structures and Algorithms study
 * Time Complexity: O(n^2)
 * Sort Type: Stable
 */
public class Main {

    public static void main(String[] args) {
        int [] intArray = {20,35,-15,7,55,1,-22};
        printArray(intArray);
        System.out.println("---------------------------");
        insertionSort(intArray);
        printArray(intArray);
    }
    // Insertion Sort

    public static void insertionSort(int [] array){
        for (int unsortedIndex=1; unsortedIndex < array.length; unsortedIndex++){
            int newElement = array[unsortedIndex];

            int i;
            /*
            * Start from the unsorted index and check each element against the current new element
            * Keep going through the array from the latest unsortedIndex down to the front (right to left)
            * Break when we reach the front or the element is in it's proper place
            * Assign the element to the current i-position, which is it's proper place
            * Continue until outer loop finishes
            * */
            for (i=unsortedIndex; i > 0 && array[i-1] > newElement; i--){
                array[i] = array[i-1];
            }

            array[i] = newElement;
        }
    }

    // method to print array
    public static void printArray(int [] array){
        for (int i=0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
