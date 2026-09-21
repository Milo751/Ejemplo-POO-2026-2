package Ordenamiento;

import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        // Bubble Sort
        int[] numeros = {9, 3, 7, 1, 5, 2};
        System.out.println("Bubble Sort - O(n²):");
        System.out.println(Arrays.toString(numeros));

        Algoritmos.bubbleSort(numeros);
        System.out.println(Arrays.toString(numeros));

        System.out.println("\n");

        // Selection Sort
        int[] numeros1 = {19, 3, 17, 1, 25, 22};
        System.out.println("Selection Sort - O(n²):");
        System.out.println(Arrays.toString(numeros1));

        Algoritmos.selectionSort(numeros1);
        System.out.println(Arrays.toString(numeros1));

        System.out.println("\n");

        // Insertion Sort
        int[] numeros2 = {91, 32, 73, 1, 52, 21};
        System.out.println("Insertion Sort  - O(n²):");
        System.out.println(Arrays.toString(numeros2));

        Algoritmos.insertionSort(numeros2);
        System.out.println(Arrays.toString(numeros2));

        System.out.println("\n");

        // Merge Sort
        int[] numeros3 = {91, 32, 73, 1, 52, 21};
        System.out.println("Merge Sort - O(n log n):");
        System.out.println(Arrays.toString(numeros3));

        Algoritmos.mergeSort(numeros3, 0, numeros3.length - 1);
        System.out.println(Arrays.toString(numeros3));

        System.out.println("\n");

        // Quick Sort
        int[] numeros4 = {91, 32, 73, 1, 52, 21};
        System.out.println("Quick Sort - O(n log n):");
        System.out.println(Arrays.toString(numeros4));

        Algoritmos.quickSort(numeros4, 0, numeros4.length - 1);
        System.out.println(Arrays.toString(numeros4));
    }
}
