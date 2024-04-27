package pkg230441100171_muhammadfajrialfaini_postest2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SewaKost.tampilkanMenu();

        ArrayList<Menu> pesanan = new ArrayList<>();
        ArrayList<Integer> jumlahPesanan = new ArrayList<>();

        boolean selesai = false;

        while (!selesai) {
            System.out.print("Pilih kost (masukkan nomor): ");
            int pilihan = scanner.nextInt();
            System.out.print("Masukkan jumlah bulan yang akan disewa: ");
            int jumlahBulan = scanner.nextInt();

            Menu menu = SewaKost.getMenuByNomor(pilihan);
            pesanan.add(menu);
            jumlahPesanan.add(jumlahBulan);

            System.out.print("Lanjutkan memesan? (Ya/Tidak): ");
            String lanjut = scanner.next();
            if (lanjut.equalsIgnoreCase("Tidak")) {
                selesai = true;
            }
        }

        double totalHarga = 0;
        for (int i = 0; i < pesanan.size(); i++) {
            double hargaKost = pesanan.get(i).getHarga();
            int jumlahBulan = jumlahPesanan.get(i);
            double hargaProduk = hargaKost * jumlahBulan;
            System.out.println(jumlahBulan + " bulan " + pesanan.get(i).getNama() + " - Rp" + hargaProduk);
            totalHarga += hargaProduk;
        }

        System.out.println("Total harga yang harus dibayar: Rp" + totalHarga);

        System.out.print("Masukkan uang Anda: ");
        double uang = scanner.nextDouble();

        while (uang < totalHarga) {
            System.out.println("Uang yang Anda masukkan kurang. Masukkan uang lagi.");
            System.out.print("Masukkan uang Anda: ");
            uang = scanner.nextDouble();
        }

        double kembalian = uang - totalHarga;
        
        System.out.println("=======================================");
        System.out.println("Terima kasih Sudah memesan di sini");
        for (int i = 0; i < pesanan.size(); i++) {
            double hargaKost = pesanan.get(i).getHarga();
            int jumlahBulan = jumlahPesanan.get(i);
            double hargaProduk = hargaKost * jumlahBulan;
            System.out.println(jumlahBulan + " bulan " + pesanan.get(i).getNama() + " - Rp" + hargaProduk);
        }
        System.out.println("Total harga: Rp" + totalHarga);
        System.out.println("Uang yang dimasukkan: Rp" + uang);
        System.out.println("Kembalian: Rp" + kembalian);
        System.out.println("=======================================");

        scanner.close();
    }
}
