package org.example;

import java.util.Scanner;

import static java.lang.Math.exp;
import static java.lang.Math.sqrt;

public class Ngay {
    private int day;
    private int month;
    private int year;

    void NhapNgay()
    {
        System.out.println("Nhập vào năm");
        Scanner scanner = new Scanner(System.in);
        this.year = scanner.nextInt();
        do {
            System.out.println("Nhập vào tháng");
            this.month = scanner.nextInt();
            if (this.month < 0 || this.month > 12) {
                System.out.println("Tháng phải như nào");
            }
        } while (this.month < 0 || this.month > 12);
        switch (this.month)
        {
            case 1, 3, 5 , 7, 9:
                do {
                    System.out.println("Nhập vào ngày");
                    this.day = scanner.nextInt();
                } while (this.day < 0 || this.day > 30);
                break;
            case  4, 6, 8, 10, 12:
                do {
                    System.out.println("Nhập vào ngày");
                    this.day = scanner.nextInt();
                } while (this.day < 0 || this.day > 31);
                break;
            case 2:
                do {
                    System.out.println("Nhập vào ngày");
                    this.day = scanner.nextInt();
                } while (this.day < 0 || this.day > 28);
                break;
            default:
                break;
        }
    }
    void XuatNgay()
    {
        System.out.println(this.day + "/" + this.month + "/" + this.year);
    }
    int timsothutu()
    {
        int stt = 0;
        for (int i = 1; i < this.month; i++)
        {
            switch (i)
            {
                case 1, 3, 5, 7, 9, 11:
                    stt += 30;
                    break;
                case 4, 6, 8, 10, 12 :
                    stt += 31;
                    break;
                case 2:
                    stt += 28;
                    break;

            }
        }
        stt += this.day;
        System.out.println("số tt" + stt);
        return stt;
    }
    void timNgayBietSt(int n)
    {
        int a[] =  {30, 28, 31, 30, 29, 30, 31, 30, 30, 31, 29, 30};
        int x = 0;
        for (int i = 0; i < 12; i++)
        {
            if (a[i] < n)
            {
                n -= a[i];
            }
            else {
                x = i + 1;
                break;
            }
        }
        System.out.println(n + "/" + x);
    }
    int bai730(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        return n + bai730(n - 1);
    }
    static float bai732(float n)
    {
        if (n == 1)
        {
            return 1;
        }
        return 1 / n + bai732(n - 1);
    }
    static double bai732D(double n, double x)
    {
        if (n == 1)
        {
            return x;
        }
        return bai732D(n - 1, x + 1.0 /  n);
    }
//    Bài 735: Tính S(n) = 1/1×2 + 1/2×3 +…+ 1/n x (n + 1)
    static double bai735D(double n, double x)
    {
        if (n == 1)
        {
            return x ;
        }
        return bai735D(n - 1, x + 1 / (n * ( n + 1)));
    }
    static float bai735(float n, float x)
    {
        if (n == 1)
        {
            return x / 1 * 2;
        }
        return bai735(n - 1, x + 1 / (n * ( n + 1)));
    }
//    Bài 746: Tính S(n) = 1 + x^2/2! + x^4/4! +…+ x^2n/(2n)!
    static double bai748(int n)
    {
        double s = sqrt(2);
        for (int i = 2; i <= n; i++)
        {
            s = sqrt(2 + s);
        }
        return s;
    }
    static double bai748d(int n)
    {
        if (n == 1)
        {
            return sqrt(2);
        }
        return sqrt(2 + bai748d(n - 1));
    }
    static double bai748d(float n, double x)
    {
        if (n == 1)
        {
            return x;
        }
        return bai748d(n - 1, sqrt(2 + x));
    }
//    Tìm ngày kế đó k ngày
    public static void main(String[] args) {
        Ngay ngay = new Ngay();
//        ngay.NhapNgay();
//        ngay.XuatNgay();
//        ngay.timsothutu();
//        ngay.timNgayBietSt(14);
//        System.out.println("ngay.bai730(5) = " + ngay.bai730(5));
//        System.out.println("bai732(5) = " + bai732(5));
//        System.out.println("bai732D(5) = " + bai732D(5, 1));
//        System.out.println("bai735D(2, 1) = " + bai735D(2, 0.5));
//        Double d = null;
//        System.out.println(d);
        System.out.println("bai748(2) = " + bai748(2));
        System.out.println("bai748(2) = " + bai748d(2));
        System.out.println("bai748(2) = " + bai748d(2, sqrt(2)));


    }
}
