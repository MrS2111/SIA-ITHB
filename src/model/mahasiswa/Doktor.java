package model.mahasiswa;

import model.Mahasiswa;
import java.util.ArrayList;

public class Doktor extends Mahasiswa {
    private ArrayList<String> listJudulPenelitian = new ArrayList<String>();
    private float sidang1;
    private float sidang2;
    private float sidang3;

    public Doktor(){

    }
    public Doktor(String nama, String alamat, String ttl, String telepon, String nim, String jurusan, ArrayList<String> listJudulPenelitian, float sidang1, float sidang2, float sidang3){
        super(nama, alamat, ttl, telepon, nim, jurusan);
        this.listJudulPenelitian = listJudulPenelitian;
        this.sidang1 = sidang1;
        this.sidang2 = sidang2;
        this.sidang3 = sidang3;
    }

    public ArrayList<String> getJudulPenelitian() {
        return this.listJudulPenelitian;
    }

    public float getSidang1() {
        return sidang1;
    }
    public float getSidang2() {
        return sidang2;
    }
    public float getSidang3() {
        return sidang3;
    }

    public void setJudulPenelitian(ArrayList<String> listJudulPenelitian) {
        this.listJudulPenelitian = listJudulPenelitian;
    }

    public void setSidang1(float sidang1) {
        this.sidang1 = sidang1;
    }
    public void setSidang2(float sidang2) {
        this.sidang2 = sidang2;
    }
    public void setSidang3(float sidang3) {
        this.sidang3 = sidang3;
    }
    @Override
    public String toString() {
        return super.toString() + "Doktor \n listJudulPenelitian=" + listJudulPenelitian + "\n sidang1=" + sidang1 + "\n sidang2=" + sidang2
                + "\n sidang3=" + sidang3 + "\n";
    }
}
