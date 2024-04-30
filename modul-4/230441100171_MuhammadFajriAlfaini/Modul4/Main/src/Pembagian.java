public class Pembagian extends OperasiBilanganAbs{
      @Override
    protected void set_A(double a) {
        this.a = a;
    }

    @Override
    protected void set_B(double b) { 
        this.b = b;
    }
       @Override
    protected void set_C() {
        this.c = a / b;
    }

    @Override
    protected double get_A() {
        return a;
    }

    @Override
    protected double get_B() {
        return b;
    }

    @Override
    protected double get_C() {
        return c;
    }

    @Override
    protected void tampil() {
        System.out.println("===========================================");
        System.out.println("HASIL PEMBAGIAN DARI  " + get_A() + " / " + get_B() + " ADALAH " + get_C());
        System.out.println("===========================================");
        System.out.println("           PROGRAM TELAH SELESAI!!         ");
        System.out.println("===========================================");
    } 
}
