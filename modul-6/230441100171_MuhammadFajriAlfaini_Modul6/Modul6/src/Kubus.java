public class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    protected double hitungVolume() {
        return Math.pow(sisi, 3);
    }

    @Override
    protected void info() {
        System.out.println("Ini adalah kubus dengan sisi " + sisi);
    }
}
