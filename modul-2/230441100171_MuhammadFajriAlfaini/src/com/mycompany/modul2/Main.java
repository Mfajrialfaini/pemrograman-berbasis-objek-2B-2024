package com.mycompany.modul2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String ulang = "Y";
        Scanner input = new Scanner(System.in);
        
        while (ulang.equalsIgnoreCase("Y")) {
            System.out.println("|==========================|");
            System.out.println("|      DATA MAHASISWA      |");
            System.out.println("|==========================|");

            System.out.print("Masukan nama universitas disini : ");
            String universitas = input.nextLine();
            System.out.print("Masukkan NIM disini : ");
            String nim = input.nextLine();
            System.out.print("Masukkan Nama disini : ");
            String nama = input.nextLine();
            System.out.print("Masukkan Alamat disini : ");
            String alamat = input.nextLine();

            System.out.println("=====DAFTAR KODE JURUSAN=====");
            System.out.println("=  Teknik Informatika  [41] =");
            System.out.println("=  Teknik Industri     [42] =");
            System.out.println("=  Teknik Elektro      [43] =");
            System.out.println("=  Sistem Informasi    [44] =");
            System.out.println("=  Teknik Mesin        [48] =");
            System.out.println("=  Teknik Mekatronika  [49] =");
            System.out.println("=============================");
            System.out.print("Masukkan Kode Jurusan Di sini (kodenya saja): ");
            String jurusan = input.nextLine();

            // Membuat objek Data_mhs dengan menggunakan constructor
            Data_mhs dataMahasiswa = new Data_mhs(nim, universitas, nama, alamat, jurusan);

            // Menampilkan data mahasiswa dan jurusan
            System.out.println("|----------------------------|");
            System.out.println("|        DATA MAHASISWA      |");
            System.out.println("Universitas : " + dataMahasiswa.getUniversitas());
            System.out.println("NIM         : " + dataMahasiswa.getNIM());
            System.out.println("Nama        : " + dataMahasiswa.getNama());
            System.out.println("Alamat      : " + dataMahasiswa.getAlamat());
            System.out.println("Jurusan     : " + Data_mhs.getJurusan());
            System.out.println("|----------------------------|");

            System.out.println("Apakah anda ingin memasukkan data lagi? ");
            System.out.println("Ketik Y jika iya, Ketik T jika tidak ");
            System.out.print("Pilihan: ");

            ulang = input.nextLine();
            if (!ulang.startsWith("y")) {
                System.out.println("PROGRAM SELESAI");
            }
        }
    }
}
