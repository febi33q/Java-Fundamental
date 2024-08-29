import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input dari pengguna
        System.out.print("Masukkan string A: ");
        String A = scanner.nextLine();
        System.out.print("Masukkan string B: ");
        String B = scanner.nextLine();

        // 1. Menjumlahkan panjang dari string A dan B
        int lengthA = A.length();
        int lengthB = B.length();
        int totalLength = lengthA + lengthB;
        System.out.println(totalLength);

        // 2. Menentukan apakah A lebih besar dari B secara lexicographical
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3. Kapitalisasi huruf pertama dari A dan B, lalu mencetaknya
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);

        scanner.close(); // Menutup scanner
    }
}
