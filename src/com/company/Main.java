package com.company;
//testing
public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] arrayList = {4, 2, 5, 6, 8};
        insertionSort(arrayList);
        printArray(arrayList);

    }
    public static int[] insertionSort(int[] A) {
        for (int j = 1; j < A.length; j++) {
            int key = A[j];
            int i = j - 1;
            while (i >= 0 && A[i] > key) {
                A[i + 1] = A[i];
                i--;
            }
            A[i + 1] = key;
        }
        return A;
    }
    public static void printArray(int [] A){
        for (int i = 0; i < A.length; i++){
            System.out.print(" " + A[i]);

        }
    }
}
