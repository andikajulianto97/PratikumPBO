package pertemuan3;

import java.util.Scanner;

public class TahunKabinet {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Tahun: ");
        int tahun = input.nextInt();

        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
            System.out.println(tahun + " Tahun Kabisat.");
        } else {
            System.out.println(tahun + " BUKAN Tahun Kabisat.");
        }

        input.close();
    }
}