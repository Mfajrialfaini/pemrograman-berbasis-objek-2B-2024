//Kata kunci final digunakan di sini untuk mencegah kelas ini diwarisi oleh kelas lain.
final class OperasiBilanganAbsCetak {
    private static void run(OperasiBilanganAbs[]OBA, double a,double b){
        OBA[0] = new Penjumlahan();
        OBA[1] = new Pengurangan();
        OBA[2] = new Perkalian();
        OBA[3] = new Pembagian();
        
     
        System.out.println("===========================================");
        System.out.println("       Nilai Bilangan A Adalah       " + a);
        System.out.println("       Nilai Bilangan B Adalah       " + b);
        System.out.println("===========================================");
        System.out.println("     HASIL OPERATOR DARI SETIAP BILANGAN   ");


        
        for (int i = 0; i < OBA.length; i++) {
            OBA[i].set_A(a);
            OBA[i].set_B(b);
            OBA[i].set_C();
            OBA[i].tampil();
        }
    }
    public static void main(String[]args){
        OperasiBilanganAbs[] OBA = new OperasiBilanganAbs[4];
        run(OBA, 6.5, 0.5);
    }
}
