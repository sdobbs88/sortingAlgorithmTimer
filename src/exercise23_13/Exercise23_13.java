/**
 * Class: CSCI2410 Data Structures and Algorithms
 * Instructor: Y. Daniel Liang
 * Description: Measures the time in which it takes various sort methods 
 * to sort arrays of different sizes
 * Due: 10/03/2016
 *
 * @author Shaun C. Dobbs
 * @version 1.0
 *
 * I pledge by honor that I have completed the programming assignment
 * independently. I have not copied the code from a student or any source. I
 * have not given my code to any student. * Sign here: Shaun C. Dobbs
 */
package exercise23_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise23_13 extends Application {

    static int[] list5K = new int[50000];
    static int[] list10K = new int[100000];
    static int[] list15K = new int[150000];
    static int[] list20K = new int[200000];
    static int[] list25K = new int[250000];
    static int[] list30K = new int[300000];

    @Override
    public void start(Stage primaryStage) {

        GridPane pane = new GridPane();
        pane.setGridLinesVisible(true);

        //Adding random numbers between 1 and 99 to each list
        for (int i = 0; i < list5K.length; i++) {
            int num = (int) (Math.random() * 100);
            list5K[i] = num;
        }

        for (int i = 0; i < list10K.length; i++) {
            int num = (int) (Math.random() * 100);
            list10K[i] = num;
        }

        for (int i = 0; i < list15K.length; i++) {
            int num = (int) (Math.random() * 100);
            list15K[i] = num;
        }

        for (int i = 0; i < list20K.length; i++) {
            int num = (int) (Math.random() * 100);
            list20K[i] = num;
        }

        for (int i = 0; i < list25K.length; i++) {
            int num = (int) (Math.random() * 100);
            list25K[i] = num;
        }

        for (int i = 0; i < list30K.length; i++) {
            int num = (int) (Math.random() * 100);
            list30K[i] = num;
        }

        //Add static elements to the GUI grid
        Label arraySize = new Label("Array Size ");
        Label lbl5K = new Label("50,000");
        Label lbl10K = new Label("100,000");
        Label lbl15K = new Label("150,000");
        Label lbl20K = new Label("200,000");
        Label lbl25K = new Label("250,000");
        Label lbl30K = new Label("300,000");
        Label lblinsertion = new Label(" Insertion Sort ");
        Label lblradix = new Label(" Radix Sort ");
        Label lblbubble = new Label(" Bubble Sort ");
        Label lblmerge = new Label(" Merge Sort ");
        Label lblquick = new Label(" Quick Sort ");
        Label lblheap = new Label(" Heap Sort ");

        pane.add(arraySize, 0, 0);
        pane.add(lbl5K, 0, 1);
        pane.add(lbl10K, 0, 2);
        pane.add(lbl15K, 0, 3);
        pane.add(lbl20K, 0, 4);
        pane.add(lbl25K, 0, 5);
        pane.add(lbl30K, 0, 6);

        pane.add(lblinsertion, 1, 0);
        pane.add(lblradix, 2, 0);
        pane.add(lblbubble, 3, 0);
        pane.add(lblmerge, 4, 0);
        pane.add(lblquick, 5, 0);
        pane.add(lblheap, 6, 0);

        //Timing insertion sort methods with different array sizes
        long startTime0 = System.currentTimeMillis();
        insertionSort(list5K);
        long endTime0 = System.currentTimeMillis();
        long insertionTime5K = endTime0 - startTime0;

        long startTime1 = System.currentTimeMillis();
        insertionSort(list10K);
        long endTime1 = System.currentTimeMillis();
        long insertionTime10K = endTime1 - startTime1;

        long startTime2 = System.currentTimeMillis();
        insertionSort(list15K);
        long endTime2 = System.currentTimeMillis();
        long insertionTime15K = endTime2 - startTime2;

        long startTime3 = System.currentTimeMillis();
        insertionSort(list20K);
        long endTime3 = System.currentTimeMillis();
        long insertionTime20K = endTime3 - startTime3;

        long startTime4 = System.currentTimeMillis();
        insertionSort(list25K);
        long endTime4 = System.currentTimeMillis();
        long insertionTime25K = endTime4 - startTime4;

        long startTime5 = System.currentTimeMillis();
        insertionSort(list30K);
        long endTime5 = System.currentTimeMillis();
        long insertionTime30K = endTime5 - startTime5;

        //Calculating sort times, adding them to a label then adding label to pane
        Label lblInsertionTime5K = new Label(Long.toString(insertionTime5K));
        Label lblInsertionTime10K = new Label(Long.toString(insertionTime10K));
        Label lblInsertionTime15K = new Label(Long.toString(insertionTime15K));
        Label lblInsertionTime20K = new Label(Long.toString(insertionTime20K));
        Label lblInsertionTime25K = new Label(Long.toString(insertionTime25K));
        Label lblInsertionTime30K = new Label(Long.toString(insertionTime30K));

        pane.add(lblInsertionTime5K, 1, 1);
        pane.add(lblInsertionTime10K, 1, 2);
        pane.add(lblInsertionTime15K, 1, 3);
        pane.add(lblInsertionTime20K, 1, 4);
        pane.add(lblInsertionTime25K, 1, 5);
        pane.add(lblInsertionTime30K, 1, 6);

        //Repopulate list for next sort
        for (int i = 0; i < list5K.length; i++) {
            int num = (int) (Math.random() * 100);
            list5K[i] = num;
        }

        for (int i = 0; i < list10K.length; i++) {
            int num = (int) (Math.random() * 100);
            list10K[i] = num;
        }

        for (int i = 0; i < list15K.length; i++) {
            int num = (int) (Math.random() * 100);
            list15K[i] = num;
        }

        for (int i = 0; i < list20K.length; i++) {
            int num = (int) (Math.random() * 100);
            list20K[i] = num;
        }

        for (int i = 0; i < list25K.length; i++) {
            int num = (int) (Math.random() * 100);
            list25K[i] = num;
        }

        for (int i = 0; i < list30K.length; i++) {
            int num = (int) (Math.random() * 100);
            list30K[i] = num;
        }

        //Bubble sort
        long startTime00 = System.currentTimeMillis();
        bubbleSort(list5K);
        long endTime00 = System.currentTimeMillis();
        long bubbleTime5K = endTime00 - startTime00;

        long startTime01 = System.currentTimeMillis();
        bubbleSort(list10K);
        long endTime01 = System.currentTimeMillis();
        long bubbleTime10K = endTime01 - startTime01;

        long startTime02 = System.currentTimeMillis();
        bubbleSort(list15K);
        long endTime02 = System.currentTimeMillis();
        long bubbleTime15K = endTime02 - startTime02;

        long startTime03 = System.currentTimeMillis();
        bubbleSort(list20K);
        long endTime03 = System.currentTimeMillis();
        long bubbleTime20K = endTime03 - startTime03;

        long startTime04 = System.currentTimeMillis();
        bubbleSort(list25K);
        long endTime04 = System.currentTimeMillis();
        long bubbleTime25K = endTime04 - startTime04;

        long startTime05 = System.currentTimeMillis();
        bubbleSort(list30K);
        long endTime05 = System.currentTimeMillis();
        long bubbleTime30K = endTime05 - startTime05;

        //Calculating sort times, adding them to a label then adding label to pane
        Label lblBubbleTime5K = new Label(Long.toString(bubbleTime5K));
        Label lblBubbleTime10K = new Label(Long.toString(bubbleTime10K));
        Label lblBubbleTime15K = new Label(Long.toString(bubbleTime15K));
        Label lblBubbleTime20K = new Label(Long.toString(bubbleTime20K));
        Label lblBubbleTime25K = new Label(Long.toString(bubbleTime25K));
        Label lblBubbleTime30K = new Label(Long.toString(bubbleTime30K));

        pane.add(lblBubbleTime5K, 3, 1);
        pane.add(lblBubbleTime10K, 3, 2);
        pane.add(lblBubbleTime15K, 3, 3);
        pane.add(lblBubbleTime20K, 3, 4);
        pane.add(lblBubbleTime25K, 3, 5);
        pane.add(lblBubbleTime30K, 3, 6);

        for (int i = 0; i < list5K.length; i++) {
            int num = (int) (Math.random() * 100);
            list5K[i] = num;
        }

        for (int i = 0; i < list10K.length; i++) {
            int num = (int) (Math.random() * 100);
            list10K[i] = num;
        }

        for (int i = 0; i < list15K.length; i++) {
            int num = (int) (Math.random() * 100);
            list15K[i] = num;
        }

        for (int i = 0; i < list20K.length; i++) {
            int num = (int) (Math.random() * 100);
            list20K[i] = num;
        }

        for (int i = 0; i < list25K.length; i++) {
            int num = (int) (Math.random() * 100);
            list25K[i] = num;
        }

        for (int i = 0; i < list30K.length; i++) {
            int num = (int) (Math.random() * 100);
            list30K[i] = num;
        }

        //Merge Sort
        long startTime10 = System.currentTimeMillis();
        mergeSort(list5K);
        long endTime10 = System.currentTimeMillis();
        long mergeTime5K = endTime10 - startTime10;

        long startTime11 = System.currentTimeMillis();
        mergeSort(list10K);
        long endTime11 = System.currentTimeMillis();
        long mergeTime10K = endTime11 - startTime11;

        long startTime12 = System.currentTimeMillis();
        mergeSort(list15K);
        long endTime12 = System.currentTimeMillis();
        long mergeTime15K = endTime12 - startTime12;

        long startTime13 = System.currentTimeMillis();
        mergeSort(list20K);
        long endTime13 = System.currentTimeMillis();
        long mergeTime20K = endTime13 - startTime13;

        long startTime14 = System.currentTimeMillis();
        mergeSort(list25K);
        long endTime14 = System.currentTimeMillis();
        long mergeTime25K = endTime14 - startTime14;

        long startTime15 = System.currentTimeMillis();
        mergeSort(list30K);
        long endTime15 = System.currentTimeMillis();
        long mergeTime30K = endTime15 - startTime15;

        //Calculating sort times, adding them to a label then adding label to pane
        Label lblMergeTime5K = new Label(Long.toString(mergeTime5K));
        Label lblMergeTime10K = new Label(Long.toString(mergeTime10K));
        Label lblMergeTime15K = new Label(Long.toString(mergeTime15K));
        Label lblMergeTime20K = new Label(Long.toString(mergeTime20K));
        Label lblMergeTime25K = new Label(Long.toString(mergeTime25K));
        Label lblMergeTime30K = new Label(Long.toString(mergeTime30K));

        pane.add(lblMergeTime5K, 4, 1);
        pane.add(lblMergeTime10K, 4, 2);
        pane.add(lblMergeTime15K, 4, 3);
        pane.add(lblMergeTime20K, 4, 4);
        pane.add(lblMergeTime25K, 4, 5);
        pane.add(lblMergeTime30K, 4, 6);

        for (int i = 0; i < list5K.length; i++) {
            int num = (int) (Math.random() * 100);
            list5K[i] = num;
        }

        for (int i = 0; i < list10K.length; i++) {
            int num = (int) (Math.random() * 100);
            list10K[i] = num;
        }

        for (int i = 0; i < list15K.length; i++) {
            int num = (int) (Math.random() * 100);
            list15K[i] = num;
        }

        for (int i = 0; i < list20K.length; i++) {
            int num = (int) (Math.random() * 100);
            list20K[i] = num;
        }

        for (int i = 0; i < list25K.length; i++) {
            int num = (int) (Math.random() * 100);
            list25K[i] = num;
        }

        for (int i = 0; i < list30K.length; i++) {
            int num = (int) (Math.random() * 100);
            list30K[i] = num;
        }

        //Quick Sort
        long startTime20 = System.currentTimeMillis();
        quickSort(list5K);
        long endTime20 = System.currentTimeMillis();
        long quickTime5K = endTime20 - startTime20;

        long startTime21 = System.currentTimeMillis();
        quickSort(list10K);
        long endTime21 = System.currentTimeMillis();
        long quickTime10K = endTime21 - startTime21;

        long startTime22 = System.currentTimeMillis();
        quickSort(list15K);
        long endTime22 = System.currentTimeMillis();
        long quickTime15K = endTime22 - startTime22;

        long startTime23 = System.currentTimeMillis();
        quickSort(list20K);
        long endTime23 = System.currentTimeMillis();
        long quickTime20K = endTime23 - startTime23;

        long startTime24 = System.currentTimeMillis();
        quickSort(list25K);
        long endTime24 = System.currentTimeMillis();
        long quickTime25K = endTime24 - startTime24;

        long startTime25 = System.currentTimeMillis();
        quickSort(list30K);
        long endTime25 = System.currentTimeMillis();
        long quickTime30K = endTime25 - startTime25;

        //Calculating sort times, adding them to a label then adding label to pane
        Label lblQuickTime5K = new Label(Long.toString(quickTime5K));
        Label lblQuickTime10K = new Label(Long.toString(quickTime10K));
        Label lblQuickTime15K = new Label(Long.toString(quickTime15K));
        Label lblQuickTime20K = new Label(Long.toString(quickTime20K));
        Label lblQuickTime25K = new Label(Long.toString(quickTime25K));
        Label lblQuickTime30K = new Label(Long.toString(quickTime30K));

        pane.add(lblQuickTime5K, 5, 1);
        pane.add(lblQuickTime10K, 5, 2);
        pane.add(lblQuickTime15K, 5, 3);
        pane.add(lblQuickTime20K, 5, 4);
        pane.add(lblQuickTime25K, 5, 5);
        pane.add(lblQuickTime30K, 5, 6);

        for (int i = 0; i < list5K.length; i++) {
            int num = (int) (Math.random() * 100);
            list5K[i] = num;
        }

        for (int i = 0; i < list10K.length; i++) {
            int num = (int) (Math.random() * 100);
            list10K[i] = num;
        }

        for (int i = 0; i < list15K.length; i++) {
            int num = (int) (Math.random() * 100);
            list15K[i] = num;
        }

        for (int i = 0; i < list20K.length; i++) {
            int num = (int) (Math.random() * 100);
            list20K[i] = num;
        }

        for (int i = 0; i < list25K.length; i++) {
            int num = (int) (Math.random() * 100);
            list25K[i] = num;
        }

        for (int i = 0; i < list30K.length; i++) {
            int num = (int) (Math.random() * 100);
            list30K[i] = num;
        }

        Integer[] list0 = new Integer[list5K.length];
        Integer[] list1 = new Integer[list10K.length];
        Integer[] list2 = new Integer[list15K.length];
        Integer[] list3 = new Integer[list20K.length];
        Integer[] list4 = new Integer[list25K.length];
        Integer[] list5 = new Integer[list30K.length];

        for (int i = 0; i < list5K.length; i++) {
            list0[i] = list5K[i];
        }

        for (int i = 0; i < list10K.length; i++) {
            list1[i] = list10K[i];
        }

        for (int i = 0; i < list15K.length; i++) {
            list2[i] = list15K[i];
        }

        for (int i = 0; i < list20K.length; i++) {
            list3[i] = list20K[i];
        }

        for (int i = 0; i < list25K.length; i++) {
            list4[i] = list25K[i];
        }

        for (int i = 0; i < list30K.length; i++) {
            list5[i] = list30K[i];
        }

        //Heap sort
        long startTime30 = System.currentTimeMillis();
        heapSort(list0);
        long endTime30 = System.currentTimeMillis();
        long heapTime5K = endTime30 - startTime30;

        long startTime31 = System.currentTimeMillis();
        heapSort(list1);
        long endTime31 = System.currentTimeMillis();
        long heapTime10K = endTime31 - startTime31;

        long startTime32 = System.currentTimeMillis();
        heapSort(list2);
        long endTime32 = System.currentTimeMillis();
        long heapTime15K = endTime32 - startTime32;

        long startTime33 = System.currentTimeMillis();
        heapSort(list3);
        long endTime33 = System.currentTimeMillis();
        long heapTime20K = endTime33 - startTime33;

        long startTime34 = System.currentTimeMillis();
        heapSort(list4);
        long endTime34 = System.currentTimeMillis();
        long heapTime25K = endTime34 - startTime34;

        long startTime35 = System.currentTimeMillis();
        heapSort(list5);
        long endTime35 = System.currentTimeMillis();
        long heapTime30K = endTime35 - startTime35;

//        //Calculating sort times, adding them to a label then adding label to pane
        Label lblHeapTime5K = new Label(Long.toString(heapTime5K));
        Label lblHeapTime10K = new Label(Long.toString(heapTime10K));
        Label lblHeapTime15K = new Label(Long.toString(heapTime15K));
        Label lblHeapTime20K = new Label(Long.toString(heapTime20K));
        Label lblHeapTime25K = new Label(Long.toString(heapTime25K));
        Label lblHeapTime30K = new Label(Long.toString(heapTime30K));
//
        pane.add(lblHeapTime5K, 6, 1);
        pane.add(lblHeapTime10K, 6, 2);
        pane.add(lblHeapTime15K, 6, 3);
        pane.add(lblHeapTime20K, 6, 4);
        pane.add(lblHeapTime25K, 6, 5);
        pane.add(lblHeapTime30K, 6, 6);

        for (int i = 0; i < list5K.length; i++) {
            int num = (int) (Math.random() * 100);
            list5K[i] = num;
        }

        for (int i = 0; i < list10K.length; i++) {
            int num = (int) (Math.random() * 100);
            list10K[i] = num;
        }

        for (int i = 0; i < list15K.length; i++) {
            int num = (int) (Math.random() * 100);
            list15K[i] = num;
        }

        for (int i = 0; i < list20K.length; i++) {
            int num = (int) (Math.random() * 100);
            list20K[i] = num;
        }

        for (int i = 0; i < list25K.length; i++) {
            int num = (int) (Math.random() * 100);
            list25K[i] = num;
        }

        for (int i = 0; i < list30K.length; i++) {
            int num = (int) (Math.random() * 100);
            list30K[i] = num;
        }

        //Raxix sort
        long startTime40 = System.currentTimeMillis();
        radixSort(list5K);
        long endTime40 = System.currentTimeMillis();
        long radixTime5K = endTime40 - startTime40;

        long startTime41 = System.currentTimeMillis();
        radixSort(list10K);
        long endTime41 = System.currentTimeMillis();
        long radixTime10K = endTime41 - startTime41;

        long startTime42 = System.currentTimeMillis();
        radixSort(list15K);
        long endTime42 = System.currentTimeMillis();
        long radixTime15K = endTime42 - startTime42;

        long startTime43 = System.currentTimeMillis();
        radixSort(list20K);
        long endTime43 = System.currentTimeMillis();
        long radixTime20K = endTime43 - startTime43;

        long startTime44 = System.currentTimeMillis();
        radixSort(list25K);
        long endTime44 = System.currentTimeMillis();
        long radixTime25K = endTime44 - startTime44;

        long startTime45 = System.currentTimeMillis();
        radixSort(list30K);
        long endTime45 = System.currentTimeMillis();
        long radixTime30K = endTime45 - startTime45;

        //Calculating sort times, adding them to a label then adding label to pane
        Label lblRadixTime5K = new Label(Long.toString(radixTime5K));
        Label lblRadixTime10K = new Label(Long.toString(radixTime10K));
        Label lblRadixTime15K = new Label(Long.toString(radixTime15K));
        Label lblRadixTime20K = new Label(Long.toString(radixTime20K));
        Label lblRadixTime25K = new Label(Long.toString(radixTime25K));
        Label lblRadixTime30K = new Label(Long.toString(radixTime30K));

        pane.add(lblRadixTime5K, 2, 1);
        pane.add(lblRadixTime10K, 2, 2);
        pane.add(lblRadixTime15K, 2, 3);
        pane.add(lblRadixTime20K, 2, 4);
        pane.add(lblRadixTime25K, 2, 5);
        pane.add(lblRadixTime30K, 2, 6);
        Scene scene = new Scene(pane, 470, 135);

        primaryStage.setTitle("Exercise 23.13");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //Insertion Sort
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            /**
             * insert list[i] into a sorted sublist list[0..i-1] so that
             * list[0..i] is sorted.
             */
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }

            // Insert the current element into list[k+1]
            list[k + 1] = currentElement;
        }
    }

    //Bubble Sort
    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            // Array may be sorted and next pass not needed
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    // Swap list[i] with list[i + 1]
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; // Next pass still needed
                }
            }
        }
    }

    //Merge Sort
    public static void mergeSort(int[] list) {
        if (list.length > 1) {
            // Merge sort the first half
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);

            // Merge sort the second half
            int secondHalfLength = list.length - list.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list, list.length / 2,
                    secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);

            // Merge firstHalf with secondHalf into list
            merge(firstHalf, secondHalf, list);
        }
    }

    /**
     * Merge two sorted lists
     */
    public static void merge(int[] list1, int[] list2, int[] temp) {
        int current1 = 0; // Current index in list1
        int current2 = 0; // Current index in list2
        int current3 = 0; // Current index in temp

        while (current1 < list1.length && current2 < list2.length) {
            if (list1[current1] < list2[current2]) {
                temp[current3++] = list1[current1++];
            } else {
                temp[current3++] = list2[current2++];
            }
        }

        while (current1 < list1.length) {
            temp[current3++] = list1[current1++];
        }

        while (current2 < list2.length) {
            temp[current3++] = list2[current2++];
        }
    }

    //Quick Sort
    public static void quickSort(int[] list) {
        quickSort(list, 0, list.length - 1);
    }

    private static void quickSort(int[] list, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }

    /**
     * Partition the array list[first..last]
     */
    private static int partition(int[] list, int first, int last) {
        int pivot = list[first]; // Choose the first element as the pivot
        int low = first + 1; // Index for forward search
        int high = last; // Index for backward search

        while (high > low) {
            // Search forward from left
            while (low <= high && list[low] <= pivot) {
                low++;
            }

            // Search backward from right
            while (low <= high && list[high] > pivot) {
                high--;
            }

            // Swap two elements in the list
            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high > first && list[high] >= pivot) {
            high--;
        }

        // Swap pivot with list[high]
        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        } else {
            return first;
        }
    }

    public static <E extends Comparable<E>> void heapSort(E[] list) {
        // Create a Heap of integers
        Heap<E> heap = new Heap<>();

        // Add elements to the heap
        for (int i = 0; i < list.length; i++) {
            heap.add(list[i]);
        }

        // Remove elements from the heap
        for (int i = list.length - 1; i >= 0; i--) {
            list[i] = heap.remove();
        }
    }
    //Radix Sort
    public static final int DEFAULT_RADIX_SIZE = 10;

    public static void radixSort(int[] intArray) {
        sort(intArray, DEFAULT_RADIX_SIZE);
    }

    public static void sort(int[] numArray, int radix) {
        int maxNums = 1 + (int) (Math.log(findMax(numArray)) / Math.log(radix));
        int divisor = 1;
        for (int pos = 0; pos < maxNums; ++pos) {
            List<List<Integer>> buckets = splitIntoBuckets(numArray, divisor, radix);
            flattenBuckets(numArray, buckets);
            divisor *= radix;
        }
        List<List<Integer>> buckets = splitBySign(arr);
        flattenBuckets(numArray, buckets);
    }

    private static List<List<Integer>> splitIntoBuckets(int[] arr, int divisor, int radix) {
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < radix; ++i) {
            buckets.add(new LinkedList<>());   //Adding array list to buckets
        }
        for (int num : arr) {
            int indexOfBucket = Math.abs(num) / divisor % radix;
            buckets.get(indexOfBucket).add(num);
        }
        return buckets;
    }

    private static List<List<Integer>> splitBySign(int[] arr) {
        List<Integer> positiveInts = new LinkedList<>();
        List<Integer> negativeInts = new LinkedList<>();
        for (int num : arr) {
            if (num >= 0) {
                positiveInts.add(num);
            } else {
                negativeInts.add(0, num);
            }
        }
        return Arrays.asList(negativeInts, positiveInts);
    }

    private static void flattenBuckets(int[] arr, List<? extends List<Integer>> buckets) {
        int i = 0;
        for (List<Integer> bucket : buckets) {
            for (int num : bucket) {
                arr[i++] = num;
            }
        }
    }

    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
