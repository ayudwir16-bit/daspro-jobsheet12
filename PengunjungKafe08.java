public class PengunjungKafe08 {
    
    static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

    static int hitungTotalBelanja(int... harga) {
        int total = 0;
        for (int nilai : harga) {
            total += nilai;
        }
        return total;
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
        daftarPengunjung();

        String[] tamu = {"Ali", "Budi", "Citra"};
        daftarPengunjung(tamu);

        System.out.println("Total 1 harga: " + hitungTotalBelanja(10000));
        System.out.println("Total 3 harga: " + hitungTotalBelanja(10000, 15000, 20000));
        System.out.println("Total 5 harga: " + hitungTotalBelanja(5000, 10000, 15000, 20000, 25000));
    }

}
