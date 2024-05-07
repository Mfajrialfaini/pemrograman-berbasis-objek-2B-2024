/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulll3;

/**
 *
 * @author asus
 */
// Kelas Anak (Child Class)
public class Buku extends Perpustakaan{

    // Konstruktor
    public Buku (String judul, String penulis, String penerbit, char kategori, int stok, int tahunTerbit) {
        super(judul, penulis, penerbit, kategori, stok, tahunTerbit);
    }

}
