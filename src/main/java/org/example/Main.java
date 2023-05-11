package org.example;

import java.util.*;

import static java.lang.Math.cbrt;
import static java.lang.Math.pow;

public class Main {
//    static int quickSort()
//    {
//
//    }
    static int binarySort(int a[], int left, int right, int ptu)
    {
        if (left <= right)
        {
            // mid < left
            int mid = (right + left) / 2;
            if (a[mid] == ptu)
            {
                return mid;
            }
            else if (a[mid] > ptu)
            {
               return binarySort(a, left, mid, ptu);
            }
            return binarySort(a, mid + 1, right, ptu);
        }
        return -1;
    }
    static int binarySearch(int a[], int left, int right, int ptu)
    {
        int x = 0;
        while (left <= right)
        {
            int mid = (right + left) / 2;
            if (a[mid] > ptu)
            {
                right = mid - 1;
            }
            else if (a[mid] < ptu)
            {
                left = mid + 1;
            }
            else if (a[mid] == ptu)
            {
                return mid;
            }
        }
        return -1;
    }
    static void selectionSort(int a[])
    {
        int lenght = a.length;
        for (int i = 0; i < lenght - 1; i++)
        {
            int min = i;
            for (int j = i + 1; j  < lenght; j++)
            {
                if (a[j] < a[min])
                {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }
    static void swap(int a, int b)
    {
        // 3 , 6
        // 3 + 6 = 9
        // a = 9 - a
        int tong = a + b;
        a = tong - a;
        b = tong - a;
        //
        //
    }
    static int returnPviot(int a[], int low, int high)
    {
        int piviot = high;
        int i = low - 1;
        for (int j = low; j < high; j++)
        {
            if (a[j] <= a[piviot])
            {
                i++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[piviot];
        a[piviot] = temp;
        return i + 1; // ptchot
    }
    static void quickSort(int a[], int low, int high)
    {
        if (low < high)
        {
            int piviot = returnPviot(a, 0, high);
            quickSort(a, 0, piviot - 1);
            quickSort(a, piviot + 1, high);
        }
    }
    // 7 8 3 4 1;
    //tren 9 vao index 1

    static void insertArrary(int a[], int vtchen, int ptchen, int length)
    {
        length = length + 1;

        for (int i = length - 1; i >= vtchen; i--)
        {
            a[i + 1]  = a[i];
        }
        a[vtchen] = ptchen;
        for (int i = 0; i < length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
    static void deleteArray(int a[], int vtxoa)
    {
        for (int i = vtxoa; i < a.length; i++)
        {
            a[i] = a[i + 1];
        }
        for (int i = 0; i < a.length - 1; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
    int tinhSo(int x, int y)
    {
       int soN = (y - x) + 1;
       return  (y + x) * 99 / 2;
    }
    //
    //
//    void selectionSort()
//    {
//        int i =
//    }
    // 1, 3, 6, 8, 9. 12
    // 2 và 2
    // tim kiem nhi phan
    public static int binarySearch2(int a[], int left, int right, int ptu)
    {
        if (left < right)
        {
            int mid = (right + left) / 2;
            if (a[mid] == ptu)
            {
                return mid;
            }
            else if (a[mid] > ptu)
            {
                return binarySearch2(a, left, mid, ptu);
            }
            else {
                return binarySearch2(a, mid + 1, right, ptu);
            }
        }
        return 0;
    }
    public static int bianrySearchKoDq(int a[], int left, int right, int ptu)
    {
        while (left < right)
        {
            int mid = (right + left) / 2;
            if (a[mid] == ptu)
            {
                return mid;
            }
            else if (a[mid] > ptu)
            {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return 0;
    }
    // 1 2 3 // a[0][0]
    // 4 9 6 // a[1][1]
    // 7 8 5 // a[2][2]
    static boolean checkHH(int a[][], int n, int m, int vtdong, int vtcot)
    {
        // chech hàng
        int x = a[vtdong][vtcot];
        for (int i = 0; i < n; i++) {
            if (x < a[i][vtcot])
            {
                return false;
            }
        }
        for (int i = 0; i < m; i++) {
            if (x < a[vtdong][i])
            {
                return false;
            }
        }
        // check 1 9 5
        int vtdong1 = vtdong  + 1;
        int vtcot1 = vtcot  + 1;
        while (vtdong1 < vtdong && vtcot1 < vtcot)
        {
            if (x < a[vtdong1][vtcot1])
            {
                return false;
            }
            vtdong1++;
            vtcot1++;
        }
        vtdong1 = vtdong  - 1;
        vtcot1 = vtcot  - 1;
        while (vtdong1 >= 0 && vtcot1 >= 0)
        {
            if (x < a[vtdong1][vtcot1])
            {
                return false;
            }
            vtdong1--;
            vtcot1--;
        }
        vtdong1 = vtdong  + 1;
        vtcot1 = vtcot  - 1;
        while (vtdong1 < vtdong && vtcot1 >= 0)
        {
            if (x < a[vtdong1][vtcot1])
            {
                return false;
            }
            vtdong1++;
            vtcot1--;
        }
        vtdong1 = vtdong  - 1;
        vtcot1 = vtcot  + 1;
        while (vtdong1 >= 0 && vtcot1 < vtcot)
        {
            if (x < a[vtdong1][vtcot1])
            {
                return false;
            }
            vtdong1--;
            vtcot1++;
        }
        return true;
    }
    // check yen ngua
    //
//    Bài 704: Cho mảng 1 chiều các số nguyên. Viết hàm tính
//    tổng các số chẵn trong mảng bằng phương pháp đệ quy

    static public int tongChan(int a[], int n) {
        if (n == 0) {
            return 0;
        }
        int tong = tongChan(a, n - 1);

        if (a[n - 1] % 2 == 0)
        {
            return tong + a[n - 1];
        }
        return tong;
    }
    public static int fibonacy(int n)
    {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibonacy(n - 1) + fibonacy(n - 2);
    }
//    Bài 710: Viết hàm đệ quy tính tổng của biểu thức sau đây:
//    S(x, n) = x + x^2/2! + x^3/3! + … + x^n/n!
    public static int giaiThua(int n)
    {
        if (n == 1)
        {
            return 1;
        }
        return giaiThua(n - 1) * n;
    }
    public static float tinhtong(float x, int n)
    {
        if (n == 1)
        {
            return x;
        }
        float tong = tinhtong(x, n - 1);
        tong += pow(x, n) / giaiThua(n);
        return tong;
    }
    static float Tinh(float x, int n)
    {
        if(n == 0)
            return 0;
        if(n == 1)
            return x;
        return (1 + x/n) * Tinh(x, n - 1) - (x/n) * Tinh(x, n - 2);
    }
    static float tinhX(int n)
    {
        if (n == 0)
            return 1;
        return tinhX(n - 1) + tinhY(n - 1);
    }
    static float tinhY(int n)
    {
        if (n == 0)
            return 0;
        return 3 * tinhX(n - 1) + 2 * tinhY(n - 1);
    }
    static void bai718(int a[], int n)
    {
        int i = -1;
        if (n == 0)
        {
            return;
        }
        bai718(a, n - 1);
        System.out.println(a[n - 1]);
    }
    static void xuat(int a[], int n)
    {
        if(n == 0)
            return;
        xuat(a, n - 1);
        System.out.println(a[n - 1]);
    }
    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5};
//        bai718(a, a.length - 1);
        xuat(a, a.length );
//        System.out.println("tongChan(a, a.length) = " + tongChan(a, a.length - 1));
//        System.out.println("tinhtong(2) = " + Tinh(2, 11));
//        System.out.println("tinhtong(2) = " + tinhtong(2, 11));

//        Scanner scanner = new Scanner(System.in);
//        String filename = "alo.txt";
//        if (filename.isEmpty()) {
//
//        }
//        System.out.println("Nhập vào hàng");
//        int n = scanner.nextInt();
//        System.out.println("Nhập vào cột ");
//        int m = scanner.nextInt();
//        int a[][] = new int[n][m];
//        int n = 3;
//        int m = 3;
////        int b[] = new int[] {1};
//        int a[][] = new int[n][m];
////
//        a[0][0] = 1;
//        a[0][1] = 2;
//        a[0][2] = 3;
//        a[1][0] = 4;
//        a[1][1] = 5;
//        a[1][2] = 6;
//        a[2][0] = 7;
//        a[2][1] = 8;
//        a[2][2] = 9;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//        Bài 415 Sắp xếp ptử tăng dần theo hàng và cột:
//        Dùng 2 phương pháp: sử dụng mảng phụ và ko dùng mảng phụ
        // ko
//        int tich = n * m;
        // a[0][0], a[0][1],
//        for (int i = 0; i < tich - 1; i++)
//        {
//            for (int j = i + 1; j < tich; j++)
//            {
//                if (a[i / m][i % m] < a[j / m][j % m])
//                {
//                    int temp = a[i / m][i % m];
//                    a[i / m][i % m] = a[j / m][j % m];
//                    a[j / m][j % m] = temp;
//                }
//            }
//            System.out.println();
//        }
//        Bài 327: Tính tổng các giá trị nằm trên biên của ma trận
        // 1 2 3
        // 4 5 6
        // 7 8 9
//        int tong = 0;
//        for (int j = 0; j < m; j++) {
//            tong += a[0][j];
//            tong += a[n - 1][j];
//        }
//        for (int i = 1; i < n - 1; i++)
//        {
//            tong += a[i][0];
//            tong += a[i][m - 1];
//        }
//        System.out.println(tong);
//        for (int i = 0; i < n; i++)
//        {
//            for (int j = 0; j < m; j++)
//            {
//                if (checkHH(a, n, m, i, j))
//                {
//                    System.out.println(a[i][j]);
//                }
//            }
//        }
        // 1 user có 1 doan chat
        // 1 doan chay có list tin nhắn
//        int a[] =  {1, 2, 3, 4, 5, 6};
////        System.out.println("binarySearch(a, 0, a.length - 1, 5) = " + binarySearch(a, 0, a.length - 1, 5));
//        System.out.println("bianrySearchKoDq(a,0, a.length - 1, 5 ) = " + bianrySearchKoDq(a, 0, a.length - 1, 5));

//        for (int i = 0; i < n; i++)
//        {
//            for (int j = 0; j < m; j++)
//            {
//                System.out.println("Nhập vào a[" +i + "][" + j + "]"  + a[i][j]);
//                a[i][j] = scanner.nextInt();
//            }
//        }

        // 1 2 3
        // 4 5 6
        //  4 5 6
        // 1 2 3
        // hoan vi 2 dog
//        for (int i = 0; i < n - 2; i++)
//        {
//            for (int j = 0; j < m; j++)
//            {
//                int temp = a[i][j];
//                a[i][j] = a[i + 1][j];
//                a[i + 1][j] = temp;
//            }
//        }
//        for (int i = 1; i < n; i++)
//        {
//        int x = 1;
//            for (int j = 0; j < m; j++)
//            {
//                int temp = a[x][j];
//                a[x][j] = a[x + 1][j];
//                a[x + 1][j] = temp;
//            }
//        }
//        n--;
//
//        System.out.println("one time");
//
//        for (int i = 0; i < n; i++)
//        {
//            for (int j = 0; j < m; j++)
//            {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
        // xóa 1 dòng trong ma trận


//        String[] arr = new String[10];
//        String studentName = "khanh";
//        arr[0] = studentName;
//        String st
//        studentName = null;
        // 103665 ;
//        try {
//            List<String> x =  Collections.singletonList("K");
//            System.out.println(x);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        List<String> data = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
//        data.stream().anyMatch(
//                s -> s.equalsIgnoreCase("Java")
//        );
//        boolean result = data.stream().anyMatch((s) -> s.equalsIgnoreCase("Java"));
//        System.out.println(result); // true
//        System.out.println("Hello world!");
//        int a[] = {1, 3, 6, 8, 9};
//        System.out.println("binarySearch(a, 0, 5, 8) = " + binarySearch(a, 0, 5, 8));
//        System.out.println("binarySort(a, 0,5, 8) = " + binarySort(a, 0, 5, 9));
//        for (int i = 0; i < a.length; i++)
//        {
//            System.out.println(i);
//        }
//        int a[] = {3, 2, 5, 0, 1, 8, 7, 6, 9, 4};
//        returnPviot(a, 0, a.length - 1);
//        selectionSort(a);
//        quickSort(a, 0, a.length - 1);
//        for (int i = 1; i < a.length; i++)
//        {
//            a[i] = a[i + 1];
//        }
//        for (int i = 0; i < a.length - 1; i++)
//        {
//            System.out.print(a[i] + " ");
//        }
        // chen mang trong java
        // 7 8 3 4 1;
        //tren 9 vao index 1

        // heapSort
        // 9 8 5rr

//        int x = 8;
//        int b = 10;
//        int tong = x + b;
//        x = tong - x;
//        b = tong - x;
////        swap(x, b);
//        System.out.println(x+ "" + b);
//        int i = 0;
//        int j = 10;
//        do
//        {
//            ++i;
////            System.out.println(i + " " + j);
//            if (i > j)
//            {
//                break;
//            }
//            System.out.println(i + " " + j);
//        }while(--j > 5);
//        System.out.println(i + " " + j);

//        System.out.println(--j);
//        int i = 0;
//        System.out.println(i);
////        ++i;
////        i++;
//        System.out.println(i++);
//        System.out.println(++i);

    }
    /*
    *
    * static trong c++ là dữ liệu, static trong c++
    * tồn tại như 1 biến toàn cục
    * hay nói cách khác nó chỉ tồn tại duy nhất
    * Đối với class, static sử dụng
    * để khai báo thành viên dữ liệu dùng chung
    *  cho mọi thể hiện của lớp:
    * */
}