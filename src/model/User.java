package model;

public class User{
    private String nama;
    private String alamat;
    private String ttl;
    private String telepon;
    
    public User(){

    }
    public User(String nama, String alamat, String ttl, String telepon){
        this.nama = nama;
        this.alamat = alamat;
        this.ttl = ttl;
        this.telepon = telepon;
    }

    public String getUserName(){
        return this.nama;
    }
    public String getUserAlamat(){
        return this.alamat;
    }
    public String getUserTTL(){
        return this.ttl;
    }
    public String getUserTelepon(){
        return this.telepon;
    }
    public void setUserNama(String nama){
        this.nama = nama;
    }
    public void setUserAlamat(String alamat){
        this.alamat = alamat;
    }
    public void setUserTTL(String ttl){
        this.ttl = ttl;
    }
    public void setUserTelepon(String telepon){
        this.telepon = telepon;
    }
    public String toString() {
        return "nama = " + nama + "\nalamat = " + alamat + "\nttl=" + ttl + "\n telepon=" + telepon + "\n";
    }
}