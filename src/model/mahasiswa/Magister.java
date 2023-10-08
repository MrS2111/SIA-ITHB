package model.mahasiswa;

import model.Mahasiswa;
import model.matakuliah.MatkulAmbil;

import java.util.ArrayList;

public class Magister extends Mahasiswa {
    private ArrayList<MatkulAmbil> listMataKuliahAmbil = new ArrayList<MatkulAmbil>();
    private String tesis;

    public Magister(){

    }
    public Magister(String nama, String alamat, String ttl, String telepon, String nim, String jurusan, String tesis, ArrayList<MatkulAmbil> listMataKuliahAmbil){
        super(nama, alamat, ttl, telepon, nim, jurusan);
        this.tesis =tesis;
        this.listMataKuliahAmbil = listMataKuliahAmbil;
    }
    public ArrayList<MatkulAmbil> getMataKuliahAmbil() {
        return this.listMataKuliahAmbil;
    }

    public String getTesis() {
        return this.tesis;
    }

    public void setMatakuliahAmbil(ArrayList<MatkulAmbil> listMataKuliahAmbil) {
        this.listMataKuliahAmbil = listMataKuliahAmbil;
    }

    public void setTesis(String tesis) {
        this.tesis = tesis;
    }

    @Override
    public String toString() {
        return super.toString() + "Magister \nlistMataKuliahAmbil=" + listMataKuliahAmbil + "\n tesis=" + tesis + "\n";
    }
}