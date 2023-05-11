package org.example;

import java.util.*;

import static java.lang.Math.*;

class Dictionary<K, V>  {

        private K key;
        private V value;

        public Dictionary(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
        static void getX()
        {
            System.out.println("khjamn");
        }
        void s()
        {
            System.out.println("s");
        }
        static class Y {
            void alo()
            {
                System.out.println("alo");
            }

            public Y() {
            }
        }

        public void heapSort(int a[], int n)
        {
            for (int i = 0; i < n / 2; i++)
            {
                heapify(a, i, n);
            }
        }
        public void heapify(int a[], int i, int n)
        {
            int lagrest = i;
            int left = 2 * i - 1;
            int right = 2 * i + 1;
            if (left < n && a[left] > a[lagrest])
            {
                lagrest = left;
            }
            if (right < n && a[right] > a[lagrest])
            {
                lagrest = right;
            }
            if (lagrest != i)
            {
                int temp = a[i]; // gốc
                a[i] = a[lagrest]; // lá
                a[lagrest] = temp; // gán las = goc
                heapify(a, lagrest, i);
            }
        }

        // 1
    // 3 2 1
    // 1 + 1*2 + 1* 2* 3
    // n
        public int bai11_c1(int n)
        {
//            int tong = 1;
//            for (int i = 1; i <= n; i++)
//            {
//               tong += tinh11(i);
//            }
//            return tong;
            int p = 1;
            int s = 0;
//            for (int i = 1; i <= n; i++)
//            {
//                p = p * i;
//                s = s + p;
//            }
            int i;
            int S, P;
            S = 0;
            P = 1;
            i = 1;
            while(i <= n)
            {
                P = P * i;
                S = S + P;
                i++;
            }
            return S;
        }
        int tinh11(int n)
        {
            int tich = 1;
            for (int i = 1; i <= n; i++)
            {
                tich = tich * i;
            }
            return tich;
        }
        public int bai11Lastkq(int n)
        {
            if (n == 1)
            {
                return 1;
            }
            return bai11Lastkq(bai11(n - 1));
        }
        public  int bai11(int n)
        {
            if (n == 1)
            {
                return 1;
            }
            else {
                return n * bai11(n - 1);
            }
        }
        // 1 / 1 + 2 +3
//        public int bai15(int n)
//        {
//            if (n == 1)
//            {
//                return 1;
//            }
//            return bai15()
//        }
        public float bai15(int n)
        {
            float s = 0;
            int mau = 0;
            for (int i = 1; i <= n; i++) {
                mau += i;
                s += 1.0 / mau;
            }
            return s;
        }
        public int bai11__(int n) {
            int s = 0; // sum
            int p = 1; //
            int i = 1;
            while (i <= n)
            {
                p =  p * i;
                s += p;
                i++;
            }
            return s;
        }
        public float bai_19(int n)
        {
            float s = 1;
            float mau = 0;
            for (int i = 1; i <= n; i++) {
                mau += 2 * i + 1 / (2  * i + 1);
                s += 1.0 / mau;
            }
            return s;
        }
        // liệt kê các ước số của số nguyên n
        // n
        public void LKuoc(int n)
        {
            int i = 1;
            while (i <= n)
            {
                if (n % i == 0)
                {
                    System.out.println(i);
                }
                i++;
            }
        }
        // sqrt(sqrt(2));
        double checkCp(int n)
        {
            double x = 1;
            double s = sqrt((double) 2);
            for (int i = 2; i <= n; i++) {
                s = sqrt( 2 + s);
            }
            return s;
        }
        // check chu doi xung
        // 121
    // 12
        void checkDx(int y)
        {
            int i = 0;
            int somoi = 0;
            int a = y;
            while (a != 0)
            {
                i = a % 10;
                somoi =  somoi * 10 + i * 10;
                a = a / 10;
            }
            //
            somoi = somoi / 10;
            System.out.println(somoi);
            if (somoi == y)
            {
                System.out.println("Đúng");
            }
        }
        void checkCp2(int x)
        {
            // mot so goi la chinh phuongg
            //
            if (x % sqrt(x) == 0)
            {
                System.out.println("là số chính phương");
            }
            else
            {
                System.out.println("Không là số chính phương");
            }
        }
        //

        /*
        *    *
        *  * * *
        * */
        void intamGiacCan(int n)
        {
            for (int i = 1; i <= n; i++)
            {
                System.out.print(" ");
//                for (int j = 1; j <= n; j = j + 2)
//                {
//                }
            }
            for (int i = 1; i <= n; i++)
            {
                System.out.print("*");
            }
        }
        int checksole(int x)
        {
            x = x % 10;
            if (x % 2 == 1)
            {
                return 1;
            }
            return 0;
                // 15
        }
        int checkMang(int a[])
        {
            for (int i = 0; i < a.length; i++)
            {
                if (checksole(a[i]) == 1)
                {
                    return a[i];
                }
            }
            return 0;
        }
    int checkCucTri(int a[])
    {
        int dem = 0;
        for (int i = 1; i < a.length - 1; i++)
        {
            if (a[i] > a[i - 1] && a[i] < a[i + 1])
            {
                dem++;
            }
        }
        return dem;
    }
    // check duong tang dan am giam dan
    // vi tri tuong doi khong thay doi
    //
    void tangDuongAmGiam(int a[])
    {
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] < a[i + 1] && a[i] >  0 && a[i + 1] > 0)
            {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }

        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] < a[i + 1] && a[i] < 0 && a[i + 1] < 0) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
        }
    }
    void sapXep(int a[])
    {
        for (int i = 0; i < a.length - 1; i++)
        {
            for (int j = 0; j < a.length - i - 1; j++)
            {
                if (a[j] > a[j + 1] )
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
//        for (int i = 0; i < a.length - 1; i++)
//        {
//            for (int j = 1; j < a.length - i - 1; j++)
//            {
//                if (a[i] < a[j] && a[i] < 0 && a[j] < 0 )
//                {
//                    int temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
    }
    void duongTang(int a[])
    {
            for (int i = 0; i < a.length - 1; i++) {
                for (int j = 0; j < a.length - i - 1; j++) {
                    if (a[j] > a[j + 1] && a[j] > 0 && a[j + 1] > 0) {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }

                }
            }
    }
    void sapXepSoDuongTangDan(int a[])
    {
//        for (int i = 0; i < a.length - 1; i++)
//        {
//            if (a[i] > 0) {
//                for (int j = i + 1; j < a.length; j++)
//                {
//                    if (a[i] > 0 && a[i] > a[j])
//                    {
//                        int temp = a[i];
//                        a[i] = a[j];
//                        a[j] = temp;
//                    }
//                }
//            }
//        }
        for(int i = 0; i < a.length - 1; i++)
        {
            if(a[i] > 0)
            {
                for(int j = i + 1; j < a.length; j++)
                {
                    if(a[j] > 0 && a[i] > a[j])
                    {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
        }
    }
    //
    void tangTang(int a[], int b[])
    {
        int lenga = a.length;
        int lengb = b.length;
        int c[] = new int[lenga + lengb];
        int i = 0;
        int j = 0;
        int k = 0;
        while ( i < lenga  && j < lengb )
        {
            if (a[i] <= b[j])
            {
                c[k] = a[i];
                i++;
                k++;
                // 1 2
            }
//            if (a[i] > b[j])
            else
            {
                c[k] = b[j];
                j++;
                k++;
            }
//            if (i == lenga - 1 || j == lengb - 1)
//            {
//                break;
//            }

        }
        while (i < lenga)
        {

            c[k] = a[i];
            i++;
            k++;
        }
        while (j < lengb )
        {
            c[k] = a[j];
            j++;
            k++;
        }
        System.out.println(c.length);
        for (int x = 0; x < c.length; x++)
        {
            System.out.print(c[x] + " ");
        }
    }
    // tim so it xuat hien nhat trong mang

    void soItXhNhat(int a[])
    {
//        int k = 0;
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < a.length; i++)
//        {
//                    map.put(a[i], map.get(a[i]) != null ? map.get(a[i]) + 1 : 1);
//        }
//        map.entrySet().forEach(
//                x -> System.out.println(x.getKey() + ":" + x.getValue())
//        );
        // 7 6 4 7 3 8
        int b[] = new int[0];
         for (int i = 0; i < 10; i++)
        {
            b[a[i]]++;
            System.out.println("chữ số" + a[i] + "xuat hien " + b[i]);;
        }
    }
    //
    void DemChuSo(int a[], int n, int b[])
    {
        // Duyệt mảng a
        for (int i = 0; i < n; i++)
        {
            int themang = abs(a[i]); //
            while (themang != 0)
            {
                int ChuSo = themang % 10;
                themang /= 10;
                b[ChuSo]++;
            }
        }
    }
    int TimChuSoXuatItNhat(int a[], int n, int b[])
    {
        int ChuSoMin = abs(a[0] % 10);
        for (int i = 0; i < 10 ; i++)
        {
            if (b[i] != 0)
            {
                ChuSoMin = (b[ChuSoMin] < b[i]) ? ChuSoMin : i;
            }
        }
        return ChuSoMin;
    }
    int checkSoNT(int x)
    {
        //
        for (int i = 2; i < x / 2; i++)
        {
            if (x % i == 0)
            {
                return 0;
            }
        }
        return 1;
    }
//    Bài 170: Cho mảng 1 chiều các số nguyên.
//    Hãy viết hàm tìm số nguyên tố nhỏ nhất lớn hơn mọi giá trị có trong mảng
    int bai170(int a[])
    {
        int sLn = 0;
        for (int i = 0; i < a.length; i++)
        {
//            if (checkCp(a[i]) == 0)
//            {
                sLn = a[i] > sLn ? a[i] : sLn;
//            }
        }
        // 1 2 3 6 7 5 8 9 11 12
       int sont  = sLn;
        for (sont = sLn + 1;;sont++)
        {
            if (checkSoNT(sont) == 1)
            {
                System.out.println( sont);
                break;
            }
        }
        return 0;
    }
    int bai215(int a[], int n)
    {
//        int c[] = new int[100];
        List d = new ArrayList();
        int k = 0;
        for (int i = 1; i < a.length; i++)
        {
//               c[k++] = a[j] - a[i];
               d.add(a[i] - a[i - 1]);
        }
        d.forEach(System.out::println);
//        for (int z = 0; z < c.length; z++)
//        {
//            System.out.println(c[z]);
//        }
        return 0;
    }
    // stack ngan xep
    // mot ngan xep
    //

    // tich tich hai don thuc
    // (ax + b) * (cx + d)
    // acx^2
    // a * x * pow(x,2) + a * d x + b * c
    //
//    void tich2DonThuc()
//    {
//
//    }
//    void bai392(int a[][], int n)
//    {
//
//    }
    class Donthuc
    {
         float heSo;
         int soMu;
         void NhapDonThuc()
         {
             Donthuc donthuc = new Donthuc();
             System.out.println("Nhập vào số mũ");
             System.out.println("Nhập vào hệ số");
         }
         void XuatDonThuc()
         {
             for (int i = soMu; i > 0; i--)
             {
                 System.out.println();
             }
         }
    }

    public static void main(String[] args) {
        Dictionary<String, String> dictionary = new Dictionary<String, String>("alo","kjha");
//        System.out.println(dictionary.checksole(4));
//        System.out.println(dictionary.checkSoNT(70));
        int a[] = {11, 12, 13, 15, 91, 81, 71};
        int b[] = new int[10];
        System.out.println(dictionary.bai215(a, a.length));
//        int a[] = {3, 4, 9, 10, 3, 91, 1};
//        int b[] = new int[10];
//        dictionary.DemChuSo(a, a.length, b);
//        System.out.println("dictionary.TimChuSoXuatItNhat(a, a.length, b) = " + dictionary.TimChuSoXuatItNhat(a, a.length, b));
//        dictionary.soItXhNhat(a);
//        Arrays.stream(b).forEach(System.out::println);
//        int b[] = {1, 2, 7, 8};
//        dictionary.tangTang(a, b);
//        dictionary.sapXepSoDuongTangDan(a);

//        Arrays.stream(a).forEach(
//                x -> System.out.print(x + " ")
//        );
//        System.out.println();
        // check cuc tri
//        System.out.println(dictionary.checkCucTri(a));
//        System.out.println("dictionary.bai11_c1(3) = " + dictionary.bai11__(4));
//        System.out.println("dictionary.bai15(3) = " + dictionary.bai15(3));
//        dictionary.intamGiacCan(3);
//        dictionary.checkCp2(25);
//        System.out.println("dictionary.checkCp(3) = " + dictionary.checkCp(4));
//        dictionary.LKuoc(12);
//        dictionary.getX();
//        Y y = new Y();
//        y.alo();if
//        int i = 1;
//        int j = 10;
//        do {
//            j--;
//            if (i > j)
//            {
//                break;
//            }
//            System.out.println(i  + "-" + j);
//        }while (++i <= 5);
//        String a[] = new String[10];
//        String x = "me";
//        String studentName  = "Khanh";
//        x = studentName;
//        a[0] = studentName;
//        studentName = null;
//        System.out.println(a[0]);
//        System.out.println(x);
//        String a = new String("khanh");
//        String b = new String("khanh");
//        String x = "kh";
//        String y = "kh";
//        System.out.println(a == b);
//        System.out.println(x == y);
//        int x = 12;
//        String y = "1";
//        List<Integer> list = new ArrayList<>();
//        int i = 2;
//        while (x > 1)
//        {
//            if (x % i == 0) {
//                x = x / i;
//                list.add(i);
//            }
//            else {
//                i++;
//            }
//        }
//        for(Integer a : list)
//        {
//            System.out.print(a);
//        }

//        y = y + "*" + x;
//        System.out.println(y);
    }

    /*
    *   7     4
    * 8  6   7  9
    * i 2i - 1;
    * i 2i + 1
    * */
}
