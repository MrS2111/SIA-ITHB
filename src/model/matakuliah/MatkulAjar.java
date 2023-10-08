package model.matakuliah;

import model.MataKuliah;
import model.presensi.PresensiStaff;
import java.util.ArrayList;

public class MatkulAjar extends MataKuliah{
    private ArrayList<PresensiStaff> listPresensi = new ArrayList<PresensiStaff>();
    
    public MatkulAjar(){

    }
    public MatkulAjar(String nama, String kode, int sks, ArrayList<PresensiStaff> listPresensi){
        super(nama, kode, sks);
        this.listPresensi = listPresensi;
    }
    public ArrayList<PresensiStaff> getPresensi(){
        return this.listPresensi;
    }
    public void setPresensi(ArrayList<PresensiStaff> listPresensi){
        this.listPresensi = listPresensi;
    }
    @Override
    public String toString() {
        return "MatkulAjar \n listPresensi=" + listPresensi + "\n";
    }
}
