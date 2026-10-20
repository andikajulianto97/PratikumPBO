package pertemuan3;

import java.util.Scanner;

public class Perusahaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Total Penjualan Hari Ini Rp : ");
        double penjualan = input.nextDouble();

        double uangJasa = 0;
        double komisi = 0;

        if (penjualan <= 2000000) {
            uangJasa = 100000;
            komisi = 0.10 * penjualan;
        } else if (penjualan <= 5000000) { 
            uangJasa = 200000;
            komisi = 0.15 * penjualan;
        } else {
            uangJasa = 300000;
            komisi = 0.20 * penjualan;
        }

        double totalPendapatan = uangJasa + komisi;

        System.out.println("Uang Jasa : Rp" + uangJasa);
        System.out.println("Komisi : Rp" + komisi);
        System.out.println("Total Hasil : Rp" + totalPendapatan);

        input.close();
    }
}
