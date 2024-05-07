package Modul3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama perpustakaan:");
        String namaPerpustakaan = scanner.nextLine();

        Perpustakaan perpustakaan = new Perpustakaan(namaPerpustakaan);

        // Menambahkan beberapa buku dari input pengguna
        System.out.print("Masukkan jumlah buku yang ingin dimasukkan:");
        int jumlahBuku = scanner.nextInt();
        scanner.nextLine(); // Membuang karakter newline dari buffer

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.print("Buku ke-" + (i + 1));
            perpustakaan.tambahBukuDariInput();
        }

        // Menampilkan daftar buku
        perpustakaan.displayInfo();

        scanner.close();
    }
}
