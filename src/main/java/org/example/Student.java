package org.example;

import org.example.pepole.People;

import java.io.Serializable;
import java.util.Arrays;

public class Student extends People {

    private String age;

    public static void bubbleSort(int a[], int n)
    {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j  + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] data = { -2, 45, 0, 11, -9 };

        // call method using class name
        bubbleSort(data, data.length);

        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }
}