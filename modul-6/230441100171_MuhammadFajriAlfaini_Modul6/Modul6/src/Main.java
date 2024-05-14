import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        BangunRuang[] bangunRuangs = new BangunRuang[4];
        int pilihan;

        System.out.println("=======================================================");
        System.out.println(" SELAMAT DATANG DI PROGRAM MENGHITUNG BANGUN RUANG KAMI");
        System.out.println("=======================================================");
        System.out.println("=  MASUKKAN JENIS BANGUN RUANG YANG INGIN ANDA HITUNG  =");

        do {
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Tabung");
            System.out.println("4. Kerucut");
            System.out.println("5. Keluar");
            System.out.print(" Masukkan pilihan anda di sini (1/2/3/4/5): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang sisi kubus: ");
                    double sisiKubus = scanner.nextDouble();
                    bangunRuangs[0] = new Kubus(sisiKubus);
                    bangunRuangs[0].info();
                    System.out.println("Volume: " + bangunRuangs[0].hitungVolume());
                    break;
                case 2:
                    System.out.print("Masukkan panjang balok: ");
                    double panjangBalok = scanner.nextDouble();
                    System.out.print("Masukkan lebar balok: ");
                    double lebarBalok = scanner.nextDouble();
                    System.out.print("Masukkan tinggi balok: ");
                    double tinggiBalok = scanner.nextDouble();
                    bangunRuangs[1] = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                    bangunRuangs[1].info();
                    System.out.println("Volume: " + bangunRuangs[1].hitungVolume());
                    break;
                case 3:
                    System.out.print("Masukkan jari-jari tabung: ");
                    double jariJariTabung = scanner.nextDouble();
                    System.out.print("Masukkan tinggi tabung: ");
                    double tinggiTabung = scanner.nextDouble();
                    bangunRuangs[2] = new Tabung(jariJariTabung, tinggiTabung);
                    bangunRuangs[2].info();
                    System.out.println("Volume: " + bangunRuangs[2].hitungVolume());
                    break;
                case 4:
                    System.out.print("Masukkan jari-jari kerucut: ");
                    double jariJariKerucut = scanner.nextDouble();
                    System.out.print("Masukkan tinggi kerucut: ");
                    double tinggiKerucut = scanner.nextDouble();
                    bangunRuangs[3] = new Kerucut(jariJariKerucut, tinggiKerucut);
                    bangunRuangs[3].info();
                    System.out.println("Volume: " + bangunRuangs[3].hitungVolume());
                    break;
                case 5:
                    System.out.println("Anda telah keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
