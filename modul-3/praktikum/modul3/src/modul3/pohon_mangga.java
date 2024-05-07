/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

/**
 *
 * @author HP
 */
public class pohon_mangga extends tumbuhan {
    private int jumlah_buah = 10;
    
    public pohon_mangga(){
        System.out.println("Jumlah buahnya ada " + jumlah_buah);
    }
    
    public void jenis_buah(){
        System.out.println("buah mangga");
        System.out.println(jumlah_buah);
    }
}
