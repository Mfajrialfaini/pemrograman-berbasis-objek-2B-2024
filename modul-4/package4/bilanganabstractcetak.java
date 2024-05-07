
package package4;



final class BilanganAbstractCetak{
    private static void run(OperasiAbstract[] OBA, double a, double b) {
        OBA[0] = new OperasiPenjumlahan();
        OBA[1] = new OperasiPengurangan();
        OBA[2] = new OperasiPerkalian();
        OBA[3] = new OperasiPembagian();

       
        System.out.println("x Nama : surya baihaqi ahmad x");
        System.out.println("x NIM : 230441100082 x");
//        System.out.println("x Kelas : x");
      
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("x Bilangan A\t: " + a + "\t x");
        System.out.println("x Bilangan B\t: " + b + "\t x");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        for (OperasiAbstract operation : OBA) {
            operation.set_A(a);
            operation.set_B(b);
            operation.set_C();
            operation.tampil();
        }
    }

    public static void main(String[] args) {
        OperasiAbstract[] OBA = new OperasiAbstract[4];
        run(OBA, 9.25, 1.25);
    }
}
