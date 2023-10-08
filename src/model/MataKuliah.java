package model;

public class MataKuliah {
    private String kode;
    private int sks;
    private String nama;
    public MataKuliah(){

    }
    public MataKuliah(String nama, String kode, int sks){
        this.nama = nama;
        this.kode = kode;
        this.sks = sks;
    }

    public String getKode(){
        return this.kode;
    }
    public void setKode(String kode){
        this.kode = kode;
    }
    public int getSKS(){
        return this.sks;
    }
    public void setSKS(int sks){
        this.sks = sks;
    }
    public String getNama(){
        return this.nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    @Override
    public String toString() {
        return "MataKuliah [kode=" + kode + ", sks=" + sks + ", nama=" + nama + "]";
    }
}
