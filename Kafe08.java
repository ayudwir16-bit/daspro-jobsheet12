import java.util.Scanner;

public class Kafe08 {

   static String[] namaMenu = {"Kopi Hitam", "Cappuccino", "Latte",
                                "Teh Tarik", "Roti Bakar", "Mie Goreng"};
    static int[] hargaMenu = {15000, 20000, 22000, 12000, 10000, 18000};

    public static void Menu() {
        System.out.println("===== MENU RESTO KAFE =====");
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.println((i + 1) + ". " + namaMenu[i] + " - Rp " + hargaMenu[i]);
        }
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        if (pilihanMenu < 1 || pilihanMenu > 6 || banyakItem <= 0) {
            return 0;
        }
        return hargaMenu[pilihanMenu - 1] * banyakItem;
    }

    public static int hitungDiskon(int total, String kodePromo, boolean isMember) {
        double persen = 0;
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            persen = 0.50;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            persen = 0.30;
        } else if (!kodePromo.equalsIgnoreCase("TIDAK")) {
            System.out.println("Kode promo invalid");
        }

        if (isMember) {
            persen += 0.10;
        }
        return (int) (total * persen);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalBayar = 0;
        String lanjut;

        Menu();
        do {
            System.out.print("Masukkan nomor menu (1-6): ");
            int pilihan = sc.nextInt();
            System.out.print("Masukkan jumlah porsi: ");
            int jumlah = sc.nextInt();

            if (pilihan < 1 || pilihan > 6) {
                System.out.println("Menu tidak tersedia");
            } else if (jumlah <= 0) {
                System.out.println("Jumlah pesanan harus lebih dari 0");
            } else {
                totalBayar += hitungTotalHarga(pilihan, jumlah);
            }

            System.out.print("Tambah pesanan? (y/n): ");
            lanjut = sc.next();
        } while (lanjut.equalsIgnoreCase("y"));

        System.out.print("Apakah pelanggan member? (y/n): ");
        boolean member = sc.next().equalsIgnoreCase("y");
        System.out.print("Masukkan kode promo (DISKON50/DISKON30/TIDAK): ");
        String promo = sc.next();

        int diskon = hitungDiskon(totalBayar, promo, member);
        System.out.println("Total harga: Rp " + totalBayar);
        System.out.println("Besar diskon: Rp " + diskon);
        System.out.println("Total yang harus dibayar: Rp " + (totalBayar - diskon));
        sc.close();
    }

}