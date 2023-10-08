package model.staff;

import model.Staff;
import model.matakuliah.MatkulAjar;
import java.util.ArrayList;

public class Dosen extends Staff {
    private String departemen;
    private ArrayList<MatkulAjar> listMatkulAjar = new ArrayList<MatkulAjar>();

    public Dosen(){

    }
    public Dosen(String nama, String alamat, String tll, String telepon, String nik, String departermen, ArrayList<MatkulAjar> matkulAjar){
        super(nama, alamat, tll, telepon, nik);
        this.departemen = departermen;
        this.listMatkulAjar = matkulAjar;
    }
    public String getDepartermen() {
        return this.departemen;
    }

    public ArrayList<MatkulAjar> getMatkulAjar() {
        return this.listMatkulAjar;
    }

    public void setDepartermen(String departemen) {
        this.departemen = departemen;
    }

    public void setMatkulAjar(ArrayList<MatkulAjar> matkulAjar) {
        this.listMatkulAjar = matkulAjar;
    }

    @Override
    public String toString() {
        return super.toString() + "departemen=" + departemen + "\n matkulAjar=" + listMatkulAjar + "\n";
    }
}
