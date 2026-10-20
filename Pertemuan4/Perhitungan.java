package pertemuan3;

import java.util.Scanner;

public class Perhitungan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("MENU HITUNGAN");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Luas Trapesium");
        System.out.println("5. Luas Layang-layang");
        System.out.print("Pilih menu 1-5: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi: ");
                double sisi = input.nextDouble();
                double luasPersegi = sisi * sisi;
                System.out.println("Luas Persegi: " + luasPersegi);
                break;

            case 2:
                System.out.print("Masukkan alas: ");
                double alas = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggiSegitiga = input.nextDouble();
                double luasSegitiga = 0.5 * alas * tinggiSegitiga;
                System.out.println("Luas Segitiga: " + luasSegitiga);
                break;

            case 3:
                System.out.print("Masukkan jari-jari (r): ");
                double r = input.nextDouble();
                double luasLingkaran = 3.14 * r * r;
                System.out.println("Luas Lingkaran: " + luasLingkaran);
                break;

            case 4:
                System.out.print("Masukkan sisi sejajar A: ");
                double a = input.nextDouble();
                System.out.print("Masukkan sisi sejajar B: ");
                double b = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggiTrapesium = input.nextDouble();
                double luasTrapesium = 0.5 * (a + b) * tinggiTrapesium;
                System.out.println("Luas Trapesium: " + luasTrapesium);
                break;

            case 5:
                System.out.print("Masukkan Diagonal 1: ");
                double d1 = input.nextDouble();
                System.out.print("Masukkan Diagonal 2: ");
                double d2 = input.nextDouble();
                double luasLayang = 0.5 * d1 * d2;
                System.out.println("Luas Layang-layang: " + luasLayang);
                break;

            default:
                System.out.println("tidak valid");
                break;
        }

        input.close();
    }
}