package pkg230441100171_muhammadfajrialfaini_postest2;

// Kelas abstrak untuk merepresentasikan produk
public abstract class Product {
    protected String nama;
    protected double harga;

    public Product(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Metode abstrak untuk menghitung total harga
    public abstract double hitungTotalHarga(int jumlah);
}
