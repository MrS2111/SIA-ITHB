package model;

public class Staff extends User {
    String nik;    
    public Staff(){

    }
    public Staff(String nama, String alamat, String tll, String telepon, String nik){
        super(nama, alamat, tll, telepon);
        this.nik = nik;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }
    public String getNik() {
        return this.nik;
    }
    @Override
    public String toString() {
        return super.toString() + " nik=" + nik +  "\n";
    }
}
