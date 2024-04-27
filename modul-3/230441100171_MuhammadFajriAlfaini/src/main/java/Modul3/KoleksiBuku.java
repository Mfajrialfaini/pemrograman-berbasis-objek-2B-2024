package Modul3;

import java.util.ArrayList;
import java.util.List;

public class KoleksiBuku {
    private List<Buku> daftarBuku;

    public KoleksiBuku() {
        daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanDaftarBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Tidak ada buku dalam koleksi.");
        } else {
            System.out.println("Daftar Buku:");
            int nomor = 1;
            for (Buku buku : daftarBuku) {
                System.out.println("Nomor: " + nomor);
                buku.displayInfo();
                System.out.println();
                nomor++;
            }
        }
    }
}
