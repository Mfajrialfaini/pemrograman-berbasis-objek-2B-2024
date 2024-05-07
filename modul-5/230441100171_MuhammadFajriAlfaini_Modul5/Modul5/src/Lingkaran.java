
class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    protected double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    protected void info() {
        System.out.println("=========================================================");
        System.out.println("Rumus Luas Lingkaran adalah PI x Jari-jari x Jari-jari ");
        System.out.println("Nilai panjang = " + jariJari );
        System.out.println("Ini adalah lingkaran dengan jari-jari " + jariJari);
        System.out.println("=========================================================");
    }
}