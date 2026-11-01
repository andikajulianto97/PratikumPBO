package Pertemuan5;

public class BelahKetupat {
    public static void main(String[] args) {
        System.out.println("--- Half Triangle ---");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n--- Full Triangle ---");
        int n = 3;
        
        // Atas
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) System.out.print(" ");
            for (int k = 1; k <= (2 * i - 1); k++) System.out.print("*");
            System.out.println();
        }
        // Bawah
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) System.out.print(" ");
            for (int k = 1; k <= (2 * i - 1); k++) System.out.print("*");
            System.out.println();
        }
    }
}
