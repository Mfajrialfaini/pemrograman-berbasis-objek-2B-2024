package com.mycompany.modul2;

public class Data_mhs extends Data {
    static String Jurusan;

    // Konstruktor untuk kelas Data_mhs
    public Data_mhs(String universitas, String nim, String nama, String alamat, String jurusan) {
    
    //super untuk memanggil konstruktor dari kelas induk data 
        super(nama, alamat, nim, universitas);
        Jurusan = jurusan;
    }

    // Getter untuk mendapatkan jurusan
    // 
    public static String getJurusan() {
        String jurusanText;
        jurusanText = switch (Jurusan) {
            case "41" -> "Teknik Informatika";
            case "42" -> "Teknik Industri";
            case "43" -> "Teknik Elektro";
            case "44" -> "Sistem Informasi";
            case "48" -> "Teknik Mesin";
            case "49" -> "Teknik Mekatronika";
            default -> "KODE JURUSAN YANG ANDA MASUKAN TIDAK ADA";
        };
        return jurusanText;
    }

    // Setter untuk mengatur jurusan
    public static void setJurusan(String jurusan) {
        Data_mhs.Jurusan = jurusan;
    }
}
