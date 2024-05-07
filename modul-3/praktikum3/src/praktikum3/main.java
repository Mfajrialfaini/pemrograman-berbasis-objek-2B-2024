/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;
import praktikum3.informasibuku;
import java.util.Scanner;
/**
 *
 * @author H
 */
public class main {
    public static void main(String[] args) {
        informasibuku info = new informasibuku();
        Scanner input = new Scanner(System.in);
        String pilihan = "1";

        while (pilihan.equals("1")) {
            info.tampil();

            System.out.print("\nMengulang lagi? [y/t]: ");
            pilihan = input.nextLine();
            if (pilihan.startsWith("y")) {
                pilihan = "1";
                System.out.println("\n\n\n");
            } else {
                System.out.println("\n==============================");
                System.out.println("Terimakasih Telah Menggunjunggi LIBRARY Kami");
                System.out.println("==============================");
            }
        }
    }
}
