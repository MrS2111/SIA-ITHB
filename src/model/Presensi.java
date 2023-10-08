package model;

public class Presensi {
    private String tanggal;
    private int status;    
    public Presensi(){

    }
    public Presensi(String tanggal, int status){
        this.tanggal = tanggal;
        this.status = status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    public int getStatus() {
        return this.status;
    }
    public String getTanggal() {
        return this.tanggal;
    }
    @Override
    public String toString() {
        return "Presensi \ntanggal=" + tanggal + "\n status=" + status + "\n";
    }
}