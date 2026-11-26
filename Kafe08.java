public class Kafe08 {

    public static int hitungTotalHarga08(int pilihanMenu, int banyakItem) {

        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItem[pilihanMenu - 1] * banyakItem;

        return hargaTotal;
    }

    public static void main(String[] args) {

        int totalBayar = hitungTotalHarga08(1, 2);

        System.out.println("Total harga: Rp " + totalBayar);
    }
}