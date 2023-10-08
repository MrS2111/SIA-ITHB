package model.staff.dosen;

import model.staff.Dosen;
import model.matakuliah.MatkulAjar;
import java.util.ArrayList;

public class DosenTetap extends Dosen{
    private double salary;

    public DosenTetap(){

    }
    public DosenTetap(String nama, String alamat, String tll, String telepon, String nik, String departemen, double salary, ArrayList<MatkulAjar> listMatkul){
        super(nama, alamat, tll, telepon, nik, departemen, listMatkul);
        this.salary = salary;
    }
    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
     @Override
    public String toString() {
        return super.toString() + "DosenTetap\n salary=" + salary + "\n";
    }
}
