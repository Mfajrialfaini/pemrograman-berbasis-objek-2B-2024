/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;
import java.util.Scanner;
/**
 *
 * @author H
 */

public class informasibuku {
    Scanner masukan = new Scanner(System.in);
    Scanner masukan1 = new Scanner(System.in);

    void tampil() {
        System.out.println("==========================");
        System.out.println(" WELLCOME ");
        System.out.println(" TO ");
        System.out.println(" LIBRARY CENETR ");
        System.out.println("==========================");

        buku Informasi = new buku();
        System.out.print("Masukkan Judul BUKU : ");
        Informasi.judul = masukan.nextLine();

        System.out.print("Masukkan Nama Penulis buku tersebut : ");
        Informasi.penulis = masukan.nextLine();

        System.out.print("Masukkan Publiser buku : ");
        Informasi.publisher = masukan.nextLine();

        System.out.println("=========KATEGORI=========");
        System.out.println("1. Semua Umur ");
        System.out.println("2. Dewasa ");
        System.out.println("3. Remaja ");
        System.out.println("4. Anak-anak");
        System.out.println("5. ??");
        System.out.print("Masukkan pilihan [1-5] : ");
       

        String choose = "y";
        int pilihan;
        do {
            pilihan = masukan1.nextInt();
            switch (pilihan) {
                case 1 -> {
                    Informasi.kategori = "Semua Umur";
                    choose = "y";
                }
                case 2 -> {
                    Informasi.kategori = "Dewasa";
                    choose = "y";
                }
                case 3 -> {
                    Informasi.kategori = "Remaja";
                    choose = "y";
                }
                case 4 -> {
                    Informasi.kategori = "Anak-Anak";
                    choose = "y";
                }
                case 5 -> {
                    Informasi.kategori = "Tidak di ketahui";
                    choose = "y";
                }
                default -> {
                    System.out.println("Pilihan tidak ada, mohon masukan dengan benar !!! ");
                    System.out.print("Masukkan pilihan [1-5] : ");
                    choose = "t";
                }
            }
        } while (choose.equals("t"));

        System.out.print("Masukan jumlah Peminjaman buku : ");
        Informasi.stok = masukan1.nextInt();
        System.out.print("Masukkan tahun buku tersebut di terbitkan : ");
        Informasi.buku = masukan.nextLine();
        Informasi.Informasi();
    }
}

