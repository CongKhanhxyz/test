//package org.example.pepole;
//
//import java.util.*;
//
//public class Donthuc {
//    Map<Integer,Float> heSoList = new HashMap<>();
//    int soMu;
//
//
//    public Donthuc() {
//    }
//
//    void Nhap()
//    {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vào số mũ");
//        this.soMu = scanner.nextInt();
////        heSoList.
//        // ax + b : so mu bâng 1
//        for (int i = this.soMu; i >= 0; i--)
//        {
//            System.out.println("Nhập vào hệ số vs số mũ:" + i );
//            float heSo = scanner.nextFloat();
//            this.heSoList.put(i, heSo);
//        }
//        for (int i = this.soMu; i >= 0; i--)
//        {
//            if (this.soMu == 0)
//            {
//                System.out.print(this.heSoList.get(i));
//            }
////            else if (this.soMu == 1)
////            {
////                System.out.println(this.heSoList.get(i) + "*" + "x^" + i);
////            }
//            else if (i > 0){
//                System.out.print(this.heSoList.get(i) + "*x^" + i + " + ");
//            }
//            else if (i == 0)
//            {
//                System.out.print(heSoList.get(i));
//            }
//        }
//    }
//    // nhan 2 don thuc
//    //  ax + b * (cx + d)
//    //
////    static void Tong(Donthuc donthuc, Donthuc donthuc2, Donthuc donthuc3) {
////        for (Integer key : donthuc.heSoList.keySet()) {
//////            for (Integer key2 : donthuc2.heSoList.keySet()) {
////                if (key > key2)
////                {
////                    donthuc3.heSoList.put(key, donthuc.heSoList.get(key));
////                }
////                else if (key > key2)
////                {
////                    donthuc3.heSoList.put(key2, donthuc.heSoList.get(key2));
////                }
////                if (key == key2)
////                {
////                    donthuc3.heSoList.put(key2, (donthuc.heSoList.get(key) + donthuc2.heSoList.get(key2)));
////                }
//////            }
////        }
////    }
//    static void Tong()
//    {
//        for (Integer key : donthuc.heSoList.keySet()) {
//            for (Integer key2 : donthuc2.heSoList.keySet()) {
//    }
//    static void Nhan(Donthuc donthuc, Donthuc donthuc2, Donthuc donthuc3)
//    {
//        for (Integer key : donthuc.heSoList.keySet()) {
//            for (Integer key2 : donthuc2.heSoList.keySet())
//            {
//                donthuc3.soMu = key * key2;
//                float a;
//                if (key == 1 && key2 == 1)
//                {
//                    a = 2;
//                    a = donthuc.heSoList.get(key) * donthuc2.heSoList.get(key2);
//                    donthuc3.heSoList.put(2, a);
//                }
//                else {
//                    a = donthuc.heSoList.get(key) * donthuc2.heSoList.get(key2);
//                    donthuc3.heSoList.put((key * key2), a);
//                }
//                // (2x + 3) * 3x + 4
//                // 6x^2 + 8x + 9x + 12
//            }
//        }
//    }
//    static void Xuat(Donthuc donthuc)
//    {
//        for (int i = donthuc.soMu; i >= 0; i--) {
//            if (donthuc.soMu == 0) {
//                System.out.print(donthuc.heSoList.get(i));
//            }
////            else if (this.soMu == 1)
////            {
////                System.out.println(this.heSoList.get(i) + "*" + "x^" + i);
////            }
//            else if (i > 0) {
//                System.out.print(donthuc.heSoList.get(i) + "*x^" + i + " + ");
//            } else if (i == 0) {
//                System.out.print(donthuc.heSoList.get(i));
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Donthuc donthuc = new Donthuc();
//        Donthuc donthuc2 = new Donthuc();
//        Donthuc donthuc3 = new Donthuc();
//
//        donthuc.Nhap();
//        donthuc2.Nhap();
//        System.out.println();
////        Nhan(donthuc, donthuc2, donthuc3);
//        Tong(donthuc, donthuc2, donthuc3);
//
//        Xuat(donthuc3);
//    }
//}
