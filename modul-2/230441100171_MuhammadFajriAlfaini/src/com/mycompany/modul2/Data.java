package com.mycompany.modul2;

public class Data {
    // Sebuah data yg bersifat private tidak bisa di akses class lain
    private String Universitas;
    private String NIM; 
    private String Nama;
    private String Alamat;

    // Membuat Constructor
    public Data(String nama, String alamat, String universitas, String nim) {
        this.Nama = nama;
        this.Alamat = alamat; 
        this.NIM = nim;
        this.Universitas = universitas;
                
    }

    // Metode get
    public String getUniversitas() {
        return Universitas;
    }

    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    // Metode set
    public void setUniversitas(String universitas) {
        this.Universitas = universitas;
    }

    public void setNIM(String nim) {
        this.NIM = nim;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
}
    