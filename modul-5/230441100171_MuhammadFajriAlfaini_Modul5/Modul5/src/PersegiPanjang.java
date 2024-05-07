
class PersegiPanjang extends BangunDatar {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    protected double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    protected void info() {
        System.out.println("=========================================================");
        System.out.println("Rumus Luas Persegi panjang adalah Panjang x Lebar");
        System.out.println("Nilai panjang = " + panjang );
        System.out.println("Nilai Lebar = " + lebar );
        System.out.println("Ini adalah persegi panjang dengan panjang " + panjang + " dan lebar " + lebar);
        System.out.println("=========================================================");
    }
}