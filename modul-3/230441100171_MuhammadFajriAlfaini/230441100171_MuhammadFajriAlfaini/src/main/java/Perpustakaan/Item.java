package Perpustakaan;

public class Item {
    String Judul, Penulis, Kategori;
    int Stok, TahunTerbit;


    //KOnstruktor
    public Item(String Judul, String Penulis, String Kategori, int Stok, int TahunTerbit) {
        this.Judul = Judul;
        this.Penulis = Penulis;
        this.Kategori = Kategori;
        this.Stok = Stok;
        this.TahunTerbit = TahunTerbit;
    }

    // Metode untuk menampilkan detail item
    public void display() {
        System.out.printf("%-20s%-20s%-20s%-15s%-15s\n", Judul, Penulis , Kategori, Stok, TahunTerbit);
    }
}
