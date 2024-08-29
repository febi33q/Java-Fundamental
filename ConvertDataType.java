class ConvertDataType
{
    //Metode statis 'methodOne' yang menerima parameter tipe long dan mengembalikan nilai tipe short.
    static short methodOne(long l) {
        int i = (int) l; // Mengonversi nilai 'l' dari tipe long ke tipe int.
        return (short) i; // Mengonversi nilai 'i' dari tipe int ke tipe short, lalu mengembalikannya.
    }

    public static void main(String[] args) { // Metode main, di mana eksekusi program dimulai.
        double d = 10.25; // Variabel 'd' bertipe double untuk menyimpan nilai desimal 10.25.
        float f = (float) d; // Mengonversi nilai 'd' dari tipe double ke tipe float.
        byte b = (byte) methodOne((long) f); // Memanggil 'methodOne' dengan mengonversi 'f' ke long,
        // lalu mengonversi hasilnya ke tipe byte.
        System.out.println(b); // Mencetak nilai variabel 'b' ke konsol.
    }
}