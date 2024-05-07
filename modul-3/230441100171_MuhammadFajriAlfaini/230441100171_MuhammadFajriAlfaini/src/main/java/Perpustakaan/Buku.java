package Perpustakaan;

//Class buku turunan dari class item
//pewaris superclass penerima subclass
public class Buku extends Item {
    //bisa ngambil data di file item
    // Konstruktor untuk menginisialisasi atribut khusus untuk buku
    public Buku(String Judul, String Penulis, String Kategori, int Stok, int TahunTerbit) {
        //Untuk memanggil konstruktor dari kelas induknya, yaitu kelas "Item"
        super(Judul, Penulis, Kategori, Stok, TahunTerbit);
    }

    // Metode untuk mengganti tampilan buku / Menimpa
    @Override
    public void display() {
        System.out.println("\nDaftar Buku");
        System.out.printf("%-20s%-20s%-20s%-15s%-15s\n", "Judul", "Penulis", "Kategori", "Stok", "TahunTerbit");
        super.display();
    }
}

