/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

// Buat kelas Novel sebagai subclass dari buku
public class buku1 extends buku {
    // Tambahkan atribut tambahan jika diperlukan

    // Lakukan override pada metode Informasi()
    @Override
    void Informasi() {
        // Memanggil metode Informasi() dari superclass (buku)
        super.Informasi();
        // Menambahkan informasi tambahan khusus untuk Novel
        System.out.println("informasi khusus untuk buku1.");
    }
}
