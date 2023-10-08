package model.matakuliah;

import model.MataKuliah;
import model.Presensi;
import java.util.ArrayList;

public class MatkulAmbil extends MataKuliah {
    private ArrayList<Presensi> listPresensi = new ArrayList<Presensi>();
    private float n1;
    private float n2;
    private float n3;

    public MatkulAmbil() {

    }

    public MatkulAmbil(String nama, String kode, int sks, float n1, float n2, float n3, ArrayList<Presensi> listPresensi) {
        super(nama, kode, sks);
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.listPresensi = listPresensi;
    }

    public float getN1() {
        return this.n1;
    }

    public float getN2() {
        return this.n2;
    }

    public float getN3() {
        return this.n3;
    }

    public ArrayList<Presensi> getPresensi() {
        return this.listPresensi;
    }

    public void setPresensi(ArrayList<Presensi> listPresensi) {
        this.listPresensi = listPresensi;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public void setN3(float n3) {
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return "MatkulAmbil \n listPresensi=" + listPresensi + "\n n1=" + n1 + "\n n2=" + n2 + "\n n3=" + n3 + "\n";
    }
}
