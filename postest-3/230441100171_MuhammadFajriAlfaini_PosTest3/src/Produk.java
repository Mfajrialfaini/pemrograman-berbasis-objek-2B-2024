public abstract class Produk implements PenetapanHarga {
    protected String nama;
    protected double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    @Override
    public abstract double hitungTotalHarga(int jumlah);

    @Override
    public abstract double hitungTotalHarga(int jumlah, double diskon);

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }
}