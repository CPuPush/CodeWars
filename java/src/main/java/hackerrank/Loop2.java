package hackerrank;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        //looping based on t value
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++){
                /*
                System.out.println(a+(int)(Math.pow(2,j)*b));
                ini adalah kode pertama saya yang salah dimana a tidak ada perubahan nilai

                jika dilihat pada contoh soal
                ! RUMUS a + (2^n-1 x b)
                input
                5 3 5
                s0 = 5 + 1.3 = 8
                s1 = 5 + 1.3 + 2.3 = 14
                s2 = 5 + 1.3 + 2.3 + 4.3 = 26
                s3 = 5 + 1.3 + 2.3 + 4.3 + 8.3 = 50
                s4 = 5 + 1.3 + 2.3 + 4.3 + 8.3 + 16.3 = 98



                tetapi pada kode saya
                ? a+(int)(Math.pow(2,j)*b)
                loop 1
                5 + 2^0 . 3 = 8
                masih benar

                loop 2
                5 + 2^1 . 3 = 11
                Salah
                * langsung salah karena kita butuh 2^0.3 (ternyata sangat sulit mendapatkan looping lagi untuh nilai sebelumnya) sebelumnya karena rumusnya seperti itu
                problem di kode ini adalah
                contoh jika n 100 maka
                dari 2^0 x3 sampai 2^99 harus kita buat

                SOLUSI
                ? a = a+(int)(Math.pow(2,j)*b);
                loop 1
                a = 5 + 2 ^ 0 . 3 = 8

                loop 2
                8 = 8 + 2 ^ 1 . 3 = 14
                ! nah hasilnya benar.

                loop 3
                14 = 14 + 2 ^ 2 .3 = 26


                * jika mengacu ke pattern ini
                s0 = 5 + 1.3 = 8
                s1 = 5 + 1.3 + 2.3 = 14
                s2 = 5 + 1.3 + 2.3 + 4.3 = 26
                s3 = 5 + 1.3 + 2.3 + 4.3 + 8.3 = 50
                s4 = 5 + 1.3 + 2.3 + 4.3 + 8.3 + 16.3 = 98

                kita hanya perlu mengganti menjadi
                s0 = 5 + 1.3 = 8
                s1 = 8 + 2.3 = 14
                s2 = 14 + 4.3 = 26
                s3 = 26 + 8.3 = 50
                s4 = 50 + 16.3 = 98
                * */

                a = a+(int)(Math.pow(2,j)*b);
                System.out.print(a+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
/*
1
5 3 5
* */