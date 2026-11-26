import java.util.Scanner;

public class HitungBalok08 {
    
    static int hitungLuas(int p, int l) {
        return p * l;
    }

    static int hitungVolume(int tinggi, int p, int l) {
        return hitungLuas(p, l) * tinggi;
    }

    static int hitungLuasPermukaanBalok(int p, int l, int t) {
        return 2 * (hitungLuas(p, l) + hitungLuas(p, t) + hitungLuas(l, t));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        int p = sc.nextInt();
        System.out.print("Masukkan lebar: ");
        int l = sc.nextInt();
        System.out.print("Masukkan tinggi: ");
        int t = sc.nextInt();

        int luas = hitungLuas(p, l);
        int volume = hitungVolume(t, p, l);
        int luasPermukaan = hitungLuasPermukaanBalok(p, l, t);

        System.out.println("Luas persegi panjang adalah " + luas);
        System.out.println("Volume balok adalah " + volume);
        System.out.println("Luas permukaan balok adalah " + luasPermukaan);
        sc.close();
    }

}
