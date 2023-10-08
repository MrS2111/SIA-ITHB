package model;

public class Mahasiswa extends User {
    private String nim;
    private String jurusan;

    public Mahasiswa(){

    }
    public Mahasiswa(String nama, String alamat, String ttl, String telepon, String nim, String jurusan){
        super(nama, alamat, ttl, telepon);
        this.jurusan = jurusan;
        this.nim = nim;
    }

    public String getNim(){
        return this.nim;
    }
    public String getJurusan(){
        return this.jurusan;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    @Override
    public String toString() {
        return super.toString() + " nim=" + nim + "\njurusan=" + jurusan + "\n";
    }
}
