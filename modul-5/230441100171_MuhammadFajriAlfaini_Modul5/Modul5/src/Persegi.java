
class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    protected double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    protected void info() {
        System.out.println("=========================================================");
        System.out.println("Rumus Luas Persegi adalah Sisi x Sisi ");
        System.out.println("Nilai sisi = " + sisi );
        System.out.println("Ini adalah persegi dengan sisi " + sisi);
        System.out.println("=========================================================");
    }
}