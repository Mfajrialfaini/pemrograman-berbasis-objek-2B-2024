import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Buat Variabel bangun dari class bangundatar
        BangunDatar bangun = null;
        //Membuat variabel untuk menyimpan parameter dari bangundatar
        double param1, param2;
        int pilihan;
        
        do {
            
            System.out.println("=======================================================");
            System.out.println(" SELAMAT DATANG DI PROGRAM MENGHITUNG BANGUN DATAR KAMI");
            System.out.println("=======================================================");
            System.out.println("=  MASUKKAN JENIS BANGUN DATAR YANG INGIN ANDA HITUNG =");
            System.out.println("1. Persegi Panjang");
            System.out.println("2. Segitiga");
            System.out.println("3. Persegi");
            System.out.println("4. Lingkaran");
            System.out.println("5. Keluar");
            System.out.print(" Masukkan pilihan anda di sini (1/2/3/4/5): ");
            pilihan = scanner.nextInt();
        
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang persegi panjang: ");
                    //objek scanner untuk membaca input pengguna sebagai nilai double,
                    //yang akan disimpan dalam variabel param1
                    param1 = scanner.nextDouble();
                    System.out.print("Masukkan lebar persegi panjang: ");
                    param2 = scanner.nextDouble();
                    bangun = new PersegiPanjang(param1, param2);
                    if (bangun != null) {
                        bangun.info();
                        System.out.println("Luas: " + bangun.hitungLuas());
                    }
                    break;
                case 2:
                    System.out.print("Masukkan alas segitiga: ");
                    param1 = scanner.nextDouble();
                    System.out.print("Masukkan tinggi segitiga: ");
                    param2 = scanner.nextDouble();
                    bangun = new Segitiga(param1, param2);
                    if (bangun != null) {
                        bangun.info();
                        System.out.println("Luas: " + bangun.hitungLuas());
                    }
                    break;
                case 3:
                    System.out.print("Masukkan sisi persegi: ");
                    param1 = scanner.nextDouble();
                    bangun = new Persegi(param1);
                    if (bangun != null) {
                        bangun.info();
                        System.out.println("Luas: " + bangun.hitungLuas());
                    }
                    break;
                case 4:
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    param1 = scanner.nextDouble();
                    bangun = new Lingkaran(param1);
                    if (bangun != null) {
                        bangun.info();
                        System.out.println("Luas: " + bangun.hitungLuas());
                    }
                    break;
                case 5:
                    System.out.println("Anda sudah Keluar dari program.");
                    System.out.println("Terima Kasih sudah Mencoba");
                    System.out.println("=======================================================");
                    System.exit(0); // Keluar dari program
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 5);
        
        scanner.close();
    }
}