package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner baca = new Scanner(System.in);
        int j;
        int jumlah = 0;


        System.out.print("Masukkan Deret Fibonacci : ");
        j = baca.nextInt();

        for (int i = 1; i <= j; i++) {
            int x = cari(i);
            jumlah +=j;
        }
        System.out.println("Hasil Deret : " +jumlah);

    }

    public static int cari(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return cari(n - 1) + cari(n - 2);
        }
    }
}

