/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul3;

/**
 *
 * @author HP
 */
public class Modul3 {
    private int jumlah = 10;
    /**
     * @param args the command line arguments
     */
    
    public void prin(){
        System.out.println(jumlah);
    }
    public void main(String[] args) {
        // TODO code application logic here
        pohon_mangga mangga = new pohon_mangga();
        
        mangga.daun();
        mangga.jenis_buah();
        mangga.tempat_hidup();
        
        System.out.println(jumlah);
        
       
        teratai teratai1 = new teratai();
        
        teratai1.daun();
        teratai1.tempat_hidup();
        teratai1.jenis_buah();
    }
    
}
