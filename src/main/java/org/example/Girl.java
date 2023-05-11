package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Girl {
    public static Scanner scanner = new Scanner(System.in);

    /**
     * main
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        // khởi tạo arr
        int [] arr = new int [n];

        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.print("Nhập phần tử k = ");
        int k = scanner.nextInt();
        // sắp xếp dãy số theo thứ tự tăng dần
        sortASC(arr);
        System.out.print("Sắp xếp mảng tăng dần: ");
        show(arr);
        System.out.printf("\nChèn phần tử %d vào mảng.", k);
        arr = insert(arr, k);
        System.out.print("\nMảng sau khi chèn: ");
        show(arr);
    }

    /**
     * sắp xếp mảng số nguyên theo thứ tự tăng dần
     *
     * @param arr: mảng các số nguyên
     */
    public static void sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }


    /**
     * chèn phần tử vào mảng số nguyên tăng dần
     * sau khi chèn mảng vẫn duy trì thứ tự tăng dần
     *
     * @param arr: mảng số nguyên tăng dần
     * @param k: phần tử chèn vào mảng arr
     */
    public static int [] insert(int [] arr, int k) {
        int arrIndex = arr.length - 1;
        // arrIndex là phân tu cuoi cung
        int tempIndex = arr.length; // tempIndex là độ dài
        int [] tempArr = new int [tempIndex + 1]; // tạo ra một địa chỉ mới
        boolean inserted = false;


        for (int i = tempIndex; i >= 0; i--) {
            if (arrIndex > -1 && arr[arrIndex] > k) {
                // nếu phần tử cuối lớn hơn -1; và phân tử cuối lớn hơn k
                tempArr[i] = arr[arrIndex--];
                // tempArr[i] = arr[]
            } else {
                if (!inserted) {
                    tempArr[i] = k;
                    inserted = true;
                } else {
                    tempArr[i] = arr[arrIndex--];
                }
            }
        }
        return tempArr;
    }
    public static void insertionSort(int a[], int n)
    {
        int size = n;

        for (int i = 1; i < size; i++) {
            int key = a[i]; // a[1]
            int j = i - 1; //a[0]

            // Compare key with each element on the left of it until an element smaller than
            // it is found.
            // For descending order, change key<array[j] to key>array[j].
            while (j >= 0 && key < a[j]) {
                a[j + 1] = a[j];
                --j;
            }

            // Place key at after the element just smaller than it.
            a[j + 1] = key;
        }

    }
    public static void insertionSort2(int a[])
    {
        int size = a.length;
        for (int i = 1; i < size; i++)
        {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] < key)
            {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }
    public static void bubbleSort(int a[], int n)
    {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (a[j] < a[j + 1]) {
                    int temp = a[j + 1];
                    a[j] = a[j  + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    /**
     * in các phần tử của mảng ra màn hình
     *
     * @param arr: mảng các số nguyên
     */
    public static void show(int [] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        int[] data = { -2, 45, 0, 11, -9 };

        // call method using class name
       bubbleSort(data, data.length);

        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }


}
