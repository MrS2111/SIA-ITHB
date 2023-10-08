package model.presensi;
import model.Presensi;

public class PresensiStaff extends Presensi {
    int jam;
    public PresensiStaff(){

    }
    public PresensiStaff(String tanggal, int status, int jam){
        super(tanggal, status);
        this.jam = jam;
    }
    public void setJam(int jam) {
        this.jam = jam;
    }
    public int getJam() {
        return this.jam;
    }
    @Override
    public String toString() {
        return super.toString() + "PresensiStaff\n jam=" + jam + "\n";
    }
}
