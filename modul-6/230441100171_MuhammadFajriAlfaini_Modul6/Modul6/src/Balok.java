public class Balok extends BangunRuang implements JariJariLebarTinggi {
    private double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    protected double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    @Override
    protected void info() {
        System.out.println("Ini adalah balok dengan panjang " + panjang + ", lebar " + lebar + ", dan tinggi " + tinggi);
    }

    @Override
    public double getJariJari() {
        return 0;
    }

    @Override
    public double getLebar() {
        return lebar;
    }

    @Override
    public double getTinggi() {
        return tinggi;
    }
}
