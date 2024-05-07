/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduul3;

/**
 *
 * @author asus
 */
public class Perpustakaan {
    // Atribut
    protected String judul;
    protected String penulis;
    protected String penerbit;
    protected char kategori;
    protected int stok;
    protected int tahunTerbit;

    // Konstruktor
    public Perpustakaan (String judul, String penulis, String penerbit, char kategori, int stok, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.kategori = kategori;
        this.stok = stok;
        this.tahunTerbit = tahunTerbit;
    }

    // Metode untuk menampilkan informasi buku
    public void displayInfo() {
        System.out.println("===============================================");
        System.out.println("|             Daftar Buku                     |");
        System.out.println("===============================================");
        System.out.println("Judul Buku: " + judul);
        System.out.println("Nama Penulis: " + penulis);
        System.out.println("Nama Penerbit: " + penerbit);
        System.out.println("Kategori: " + getKategoriString());
        System.out.println("Stok: " + stok);
        System.out.println("Tahun terbit: " + tahunTerbit);
        System.out.println("===============================================");
    }

    // Metode untuk mendapatkan kategori dalam bentuk string
    public String getKategoriString() {
        return switch (kategori) {
            case 'S' -> "Semua Umur";
            case 'D' -> "Dewasa";
            case 'R' -> "Remaja";
            case 'A' -> "Anak-anak";
            default -> "Tidak diketahui";
        };
    }
}
