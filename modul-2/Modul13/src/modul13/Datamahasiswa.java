package modul13;

import java.util.Scanner;

public class Datamahasiswa extends DataUniversitas {
    static String Alamat;
    static String Jurusan;

    // Konstruktor default
    public Datamahasiswa() {
        // Isi konstruktor default, jika diperlukan
    }

    // Konstruktor dengan parameter
    public Datamahasiswa(String alamat, String jurusan) {
        Alamat = alamat;
        Jurusan = jurusan;
    }

    public static String getAlamat(){
        return Alamat;
    }

    public static void setAlamat(String Alamat){
        Datamahasiswa.Alamat = Alamat;
    }

    public static String getJurusan(){ 
        Scanner input = new Scanner(System.in);
        switch (Jurusan){
            case "61":
                System.out.println("|==========================|");
                System.out.println("| DATA MAHASISWA |");

                System.out.println("|==========================|\n");
                System.out.println("UNIVERSITAS : " + getUniversitas());
                System.out.println("NIM : " + DataUniversitas.getNim());
                System.out.println("NAMA : " + DataUniversitas.getNama());
                System.out.println("ALAMAT : " + getAlamat());
                System.out.println("JURUSAN : MATEMATIKA");
                break;
            // ... cases for other departments
        }
        return Jurusan;
    }

    public static void setJurusan(String Jurusan){
        Datamahasiswa.Jurusan = Jurusan;
    }
}

