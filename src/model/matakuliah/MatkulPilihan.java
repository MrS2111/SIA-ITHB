package model.matakuliah;

import model.MataKuliah;

public class MatkulPilihan extends MataKuliah{
    private int jumlahMinimum;
    public MatkulPilihan(){

    }
    public MatkulPilihan(String nama, String kode, int sks, int jumlahMinimum){
        super(nama, kode, sks);
        this.jumlahMinimum = jumlahMinimum;
    }
    public int getJumlahMinimum() {
        return this.jumlahMinimum;
    }
    public void setJumlahMinimum(int jumlahMinimum) {
        this.jumlahMinimum = jumlahMinimum;
    }
    @Override
    public String toString() {
        return "MatkulPilihan \n jumlahMinimum=" + jumlahMinimum + "\n";
    }
}
