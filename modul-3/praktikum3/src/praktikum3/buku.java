/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum3;

/**
 *
 * @author H
 */
public class buku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    String judul, buku, penulis, publisher, kategori;
    int stok;

    void Informasi() {
        System.out.println("\n===============================");
        System.out.println(" ==buku yang sedang di pinjam ==");
       
        System.out.println("Judul buku : " + this.judul);
        System.out.println("diterbitkan pada : " + this.buku);
        System.out.println("nama penulis : " + this.penulis);
        System.out.println("Publisher buku : " + this.publisher);
        System.out.println("Kategori buku : " + this.kategori);
        System.out.println("jumlah buku yang di pinjam: " + this.stok);
       
        System.out.println("===============================");
    }
}
