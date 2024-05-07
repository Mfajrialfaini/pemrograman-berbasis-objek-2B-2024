package Perpustakaan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();
        int jumlahItem;

        System.out.print("Masukkan jumlah Buku anda : ");
        jumlahItem = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahItem; i++) {
  
            System.out.println("Masukan buku yang ke-" + (i + 1));
            
            System.out.print("Masukkan Judul buku : ");
            String Judul = input.nextLine();
            System.out.print("Masukkan nama Penulis dari buku ini: ");
            String Penulis = input.nextLine();
            System.out.print("Pilih Kategori(Su/D/R/A) untuk buku ini: ");
            String Kategori = input.nextLine();
            
            System.out.print("Masukan Jumlah stok buku : ");
            int Stok = input.nextInt();
            System.out.print("Masukan Tahun Terbit buku : ");
            int TahunTerbit = input.nextInt();

            Buku buku = new Buku(Judul, Penulis, Kategori, Stok, TahunTerbit);
            perpustakaan.tambahItem(buku);
        }
        perpustakaan.tampilSemuaItem();
    }
}

