package model.staff.dosen;

import model.staff.Dosen;
import model.matakuliah.MatkulAjar;
import java.util.ArrayList;

public class Honorer extends Dosen {
    private double honorPerSKS;
    public Honorer(){

    }
    public Honorer(String nama, String alamat, String tll, String telepon, String nik, String departermen, double honorPerSKS, ArrayList<MatkulAjar> listMatkul){
        super(nama, alamat, tll, telepon, nik, departermen, listMatkul);
        this.honorPerSKS = honorPerSKS;
    }
    public double getHonorPerSKS(){
        return this.honorPerSKS;
    }
    public void setHonorPerSKS(double honorPerSKS){
        this.honorPerSKS = honorPerSKS;
    }
    @Override
    public String toString() {
        return super.toString() + "Honorer \nhonorPerSKS=" + honorPerSKS + "\n";
    }
}