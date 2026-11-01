package Pertemuan5;

import java.util.Scanner;

public class AngkaGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyak angka : ");
        int n = input.nextInt();
        int total = 0, ganjil = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(ganjil + " ");
            total += ganjil;
            ganjil += 2;
        }

        System.out.println("\nTotal penjumlahan : " + total);
    }
}
