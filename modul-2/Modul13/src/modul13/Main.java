// File: Main.java
package modul13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String ulang ="Y";
        while (ulang.equals("Y")){
            Scanner input = new Scanner(System.in);

            System.out.println("|==========================|");
            System.out.println("| MASUKKAN DATA |");
            System.out.println("|==========================|\n");

            System.out.print("UNIVERSITAS : "); 
            Datamahasiswa.Universitas = input.nextLine();
            System.out.print("NIM : "); Datamahasiswa.NIM = input.nextLine();
            System.out.print("NAMA : "); Datamahasiswa.Nama = input.nextLine();
            System.out.print("ALAMAT : "); Datamahasiswa.Alamat = input.nextLine();

            System.out.println("====DAFTAR KODE JURUSAN====");
            System.out.println("MATEMATIKA [61]");
            System.out.println("BIOLOGI [62]");
            System.out.println("KIMIA [63]");
            System.out.println("FISIKA [64]");
            System.out.println("TEKNIK INFORMATIKA [65]");
            System.out.println("SISTEM INFORMASI [66]");
            System.out.println("===========================");
            System.out.print("MASUKAN KODE JURUSAN ANDA : "); 
            Datamahasiswa.Jurusan = input.nextLine();

            Datamahasiswa.getJurusan();

            System.out.println("INGIN MEMASUKKAN DATA LAGI ??");
            System.out.println("1. Ya [Y] \n2. Tidak [T]");
            System.out.print("PILIH YANG MANA ??");
            ulang = input.nextLine();
            if (ulang.startsWith("y")){
                ulang="Y";
            } else {
                System.out.println("|==========================|");
                System.out.println("| TERIMAKASIH |");
                System.out.println("|==========================|"); 
            }
        } 
    }
}
