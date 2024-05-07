package Modul3;
import java.util.Scanner;

public class Perpustakaan extends KoleksiBuku {
    private String nama;

    public Perpustakaan(String nama) {
        super();
        this.nama = nama;
    }

    public void tambahBukuDariInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan judul buku:");
        String judul = scanner.nextLine();

        System.out.println("Masukkan nama pengarang:");
        String pengarang = scanner.nextLine();

        System.out.println("Masukkan tahun terbit:");
        int tahunTerbit = scanner.nextInt();
        scanner.nextLine(); // Membuang karakter newline dari buffer

        Buku buku = new Buku(judul, pengarang, tahunTerbit);
        tambahBuku(buku);
    }

    public void displayInfo() {
        System.out.println("Nama Perpustakaan: " + nama);
        tampilkanDaftarBuku();
    }
}
