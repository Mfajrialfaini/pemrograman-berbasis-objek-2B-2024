public class Kerucut extends BangunRuang implements JariJariLebarTinggi {
    private double jariJari, tinggi;

    public Kerucut(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    protected double hitungVolume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    @Override
    protected void info() {
        System.out.println("Ini adalah kerucut dengan jari-jari " + jariJari + " dan tinggi " + tinggi);
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
