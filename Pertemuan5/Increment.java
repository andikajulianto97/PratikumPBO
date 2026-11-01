package Pertemuan5;

public class Increment {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Pakai i++:");
        while (i++ < 3) {
            System.out.println("Nilai i: " + i);
        }

        int j = 0;
        System.out.println("\nPakai ++j:");
        while (++j < 3) {
            System.out.println("Nilai j: " + j);
        }
    }
}