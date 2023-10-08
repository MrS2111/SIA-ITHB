package model.mahasiswa;

import model.Mahasiswa;
import model.matakuliah.MatkulAmbil;

import java.util.ArrayList;

public class Sarjana extends Mahasiswa {
    private ArrayList<MatkulAmbil> listMataKuliahAmbil = new ArrayList<MatkulAmbil>();
    public Sarjana(){

    }
    public Sarjana(String nama, String alamat, String ttl, String telepon, String nim, String jurusan, ArrayList<MatkulAmbil> listMatkul){
        super(nama, alamat, ttl, telepon, nim, jurusan);
        this.listMataKuliahAmbil = listMatkul;
    }
    public void setMataKuliahAmbil(ArrayList<MatkulAmbil> listMataKuliahAmbil) {
        this.listMataKuliahAmbil = listMataKuliahAmbil;
    }
    public ArrayList<MatkulAmbil> getMataKuliahAmbil() {
        return this.listMataKuliahAmbil;
    }
    @Override
    public String toString() {
        return super.toString() + "Sarjana\n listMataKuliahAmbil=" + listMataKuliahAmbil + "\n";
    }
}
