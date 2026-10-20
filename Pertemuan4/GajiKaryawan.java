package pertemuan3;

import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("NIK: ");
        String nik = input.nextLine();

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Kode Golongan 1-4: ");
        int gol = input.nextInt();

        System.out.print("Status 1: Menikah, 0: Belum/Cerai : ");
        int status = input.nextInt();

        System.out.print("Jumlah Anak: ");
        int anak = input.nextInt();

        double gajiPokok = 0;
        if (gol == 1) {
            gajiPokok = 1200000;
        } else if (gol == 2) {
            gajiPokok = 1500000;
        } else if (gol == 3) {
            gajiPokok = 1750000;
        } else if (gol == 4) {
            gajiPokok = 2000000;
        }

        double tunjPasangan = 0;
        if (status == 1) {
            tunjPasangan = 0.10 * gajiPokok;
        }

        double tunjAnak = 0.05 * gajiPokok * anak;

        double totalTunjangan = tunjPasangan + tunjAnak;
        double gajiBersih = gajiPokok + totalTunjangan;

        System.out.println("\n GAJI KARYAWAN ");
        System.out.println("NIK / Nama    : " + nik + " / " + nama);
        System.out.println("Gaji Pokok    : Rp" + gajiPokok);
        System.out.println("Tunjangan     : Rp" + totalTunjangan);
        System.out.println("Gaji Bersih   : Rp" + gajiBersih);

        input.close();
    }
}
