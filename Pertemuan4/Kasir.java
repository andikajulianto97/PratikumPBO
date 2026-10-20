package pertemuan3;

import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Apakah memiliki kartu member? 1.Y 2.T: ");
        int member = input.nextInt();

        System.out.print("Total Belanja: Rp");
        double totalBelanja = input.nextDouble();

        double diskon = 0;

        if (member == 1) { 
            if (totalBelanja > 500000) {
                diskon = 50000;
            } else if (totalBelanja > 100000) {
                diskon = 15000;
            }
        } else { 
            if (totalBelanja > 100000) {
                diskon = 10000;
            }
        }

        double totalHarusDibayar = totalBelanja - diskon;

        System.out.println("Diskon yang didapat : Rp" + diskon);
        System.out.println("Total Harus Dibayar : Rp" + totalHarusDibayar);

        System.out.print("\n Masukkan Uang Pembeli: Rp");
        double uangDiberikan = input.nextDouble();

        double kembalian = uangDiberikan - totalHarusDibayar;

        System.out.println("Uang Kembalian : Rp" + kembalian);

        input.close();
    }
}
