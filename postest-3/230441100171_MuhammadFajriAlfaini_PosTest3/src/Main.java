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
            System.out.println("===============================================");
            System.out.println("=    SELAMAT DATANG DI TEMPAT KOST IBU SITI   =");
            System.out.println("===============================================");
            int pilihan = -1;
            while (pilihan < 1 || pilihan > 4) {
                System.out.print("Pilih kost yang Anda mau (masukkan nomornya saja): ");
                pilihan = scanner.nextInt();
                if (pilihan < 1 || pilihan > 4) {
                    System.out.println("Pilihan tidak valid. Silakan masukkan nomor yang sesuai (1-4).");
                }
            }
            System.out.print("Jumlah bulan yang akan disewa (masukkan angkanya saja): ");
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

        System.out.print("Apakah Anda memiliki kode diskon? (Ya/Tidak): ");
        boolean adaDiskon = scanner.next().equalsIgnoreCase("Ya");
        double diskon = 0;
        if (adaDiskon) {
            System.out.print("Masukkan diskon (misalnya 0.10 untuk diskon 10%): ");
            diskon = scanner.nextDouble();
        }

        double totalHarga = 0;
        for (int i = 0; i < pesanan.size(); i++) {
            double hargaKost;
            if (adaDiskon) {
                hargaKost = pesanan.get(i).hitungTotalHarga(jumlahPesanan.get(i), diskon);
            } else {
                hargaKost = pesanan.get(i).hitungTotalHarga(jumlahPesanan.get(i));
            }
            System.out.println(jumlahPesanan.get(i) + " bulan " + pesanan.get(i).getNama() + " dengan harga Rp " + hargaKost);
            totalHarga += hargaKost;
        }

        System.out.println("Total harga yang harus dibayar adalah Rp " + totalHarga);

        System.out.print("Masukkan uang Anda: ");
        double uang = scanner.nextDouble();

        while (uang < totalHarga) {
            System.out.println("Uang yang Anda masukkan kurang. Masukkan uang lagi.");
            System.out.print("Masukkan uang Anda: ");
            uang = scanner.nextDouble();
        }

        double kembalian = uang - totalHarga;

        System.out.println("=======================================");
        System.out.println("Terima kasih sudah memesan di sini");
        for (int i = 0; i < pesanan.size(); i++) {
            double hargaKost = pesanan.get(i).hitungTotalHarga(jumlahPesanan.get(i));
            System.out.println(jumlahPesanan.get(i) + " bulan " + pesanan.get(i).getNama() + " dengan harga Rp " + hargaKost);
        }
        System.out.println("Total harga: Rp " + totalHarga);
        System.out.println("Uang yang dimasukkan: Rp " + uang);
        System.out.println("Kembalian: Rp " + kembalian);
        System.out.println("=======================================");
        scanner.close();
    }
}