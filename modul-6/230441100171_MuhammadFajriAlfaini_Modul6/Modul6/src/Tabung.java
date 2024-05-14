public class Tabung extends BangunRuang implements JariJariLebarTinggi {
    private double jariJari, tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    protected double hitungVolume() {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    @Override
    protected void info() {
        System.out.println("Ini adalah tabung dengan jari-jari " + jariJari + " dan tinggi " + tinggi);
    }

    @Override
    public double getJariJari() {
        return jariJari;
    }

    @Override
    public double getLebar() {
        return 0;
    }

    @Override
    public double getTinggi() {
        return tinggi;
    }
}
