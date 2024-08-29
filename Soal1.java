import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta jumlah test case dari pengguna
        System.out.print("Masukkan jumlah test case: ");
        int T = scanner.nextInt(); // membaca jumlah test case

        // Mengingatkan pengguna untuk memasukkan angka
        System.out.println("Masukkan " + T + " angka:");

        for (int i = 0; i < T; i++) {
            try {
                long n = scanner.nextLong(); // membaca input sebagai long untuk menampung angka yang sangat besar
                System.out.println(n + " can be fitted in:");

                // Memeriksa apakah n bisa disimpan dalam tipe data byte
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                // Memeriksa apakah n bisa disimpan dalam tipe data short
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                // Memeriksa apakah n bisa disimpan dalam tipe data int
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                // Memeriksa apakah n bisa disimpan dalam tipe data long
                System.out.println("* long");

            } catch (Exception e) {
                // Jika angka terlalu besar untuk ditampung dalam long
                System.out.println(scanner.next() + " can't be fitted anywhere.");
                scanner.nextLine(); // membersihkan input untuk mencegah pengulangan error
            }
        }

        scanner.close(); // Menutup scanner
    }
}
