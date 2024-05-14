public class Menu {
    private String nama;
    private double harga;

    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public double hitungTotalHarga(int jumlahBulan) {
        return harga * jumlahBulan;
    }

    public double hitungTotalHarga(int jumlahBulan, double diskon) {
        return harga * jumlahBulan * (1 - diskon);
    }
}