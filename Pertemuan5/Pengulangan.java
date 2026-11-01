package Pertemuan5;

import java.util.Scanner;

public class Pengulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka ke-1: ");
        int angka = input.nextInt();
        int max = angka, min = angka;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            angka = input.nextInt();
            if (angka > max) max = angka;
            if (angka < min) min = angka;
        }

        System.out.println("Terbesar: " + max);
        System.out.println("Terkecil: " + min);
    }
    
}
