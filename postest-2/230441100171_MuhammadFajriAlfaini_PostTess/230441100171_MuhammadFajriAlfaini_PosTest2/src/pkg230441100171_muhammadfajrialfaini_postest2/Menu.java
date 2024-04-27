package pkg230441100171_muhammadfajrialfaini_postest2;

// Subclass untuk merepresentasikan menu sewa kost
public class Menu extends Product {
    public Menu(String nama, double harga) {
        super(nama, harga);
    }

    // Implementasi dari metode abstrak hitungTotalHarga
    @Override
    public double hitungTotalHarga(int jumlah) {
        return harga * jumlah;
    }

    public double getHarga() {
        return harga;
    }

    public String getNama() { 
        return nama;
    }
}
