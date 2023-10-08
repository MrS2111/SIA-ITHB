package model.staff;

import model.presensi.PresensiStaff;
import model.Staff;
import java.util.ArrayList;

public class Karyawan extends Staff{
    private double salary;
    private ArrayList<PresensiStaff> listPresensiHadir = new ArrayList<PresensiStaff>();

    public Karyawan(){

    }
    public Karyawan(String nama, String alamat, String tll, String telepon, String nik, double salary, ArrayList<PresensiStaff> listPresensiStaffs){
        super(nama, alamat, tll, telepon, nik);
        this.listPresensiHadir = listPresensiStaffs;
    }

    public double getSalary(){
        return this.salary;        
    }
    public ArrayList<PresensiStaff> getPresensiHadir(){
        return this.listPresensiHadir;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setPresensiHardir(ArrayList<PresensiStaff> listPresensiHadir){
        this.listPresensiHadir = listPresensiHadir;
    }
    @Override
    public String toString() {
        return super.toString() + "Karyawan \nsalary=" + salary + "\n listPresensiHadir=" + listPresensiHadir + "\n";
    }
}
