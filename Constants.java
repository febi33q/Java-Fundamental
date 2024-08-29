public class Constants {
        public static void main(String[] args) {
            final double CM_PER_INCH = 2.54; // Konstanta untuk mengonversi inci ke sentimeter.

            double paperWidth = 8.5; // Variabel untuk menyimpan lebar kertas dalam inci.
            double paperHeight = 11;  // Variabel untuk menyimpan tinggi kertas dalam inci.

            // Mencetak ukuran kertas dalam sentimeter dengan mengonversi lebar dan tinggi dari inci.
            System.out.println("Paper size in centimeters: " +
                    paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
        }
    }

