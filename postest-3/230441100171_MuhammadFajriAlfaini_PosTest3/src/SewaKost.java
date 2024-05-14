import java.util.ArrayList;

public class SewaKost {
    private static ArrayList<Menu> menu = new ArrayList<>();
    static {
        menu.add(new Menu("Kost 2 kasur + kipas angin + kamar mandi dalam", 700));
        menu.add(new Menu("Kost 1 kasur + kipas angin + kamar mandi dalam", 650));
        menu.add(new Menu("Kost 2 kasur + kamar mandi dalam", 600));
        menu.add(new Menu("Kost 1 kasur + kamar mandi dalam", 550));
    }

    // Metode untuk menampilkan menu
    public static void tampilkanMenu() {
        System.out.println("Daftar Kost:");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ". " + menu.get(i).getNama() + " - Rp" + menu.get(i).getHarga() + " per bulan");
        }
    }

    // Metode untuk mendapatkan menu berdasarkan nomor urut
    public static Menu getMenuByNomor(int nomor) {
        return menu.get(nomor - 1);
    }
}