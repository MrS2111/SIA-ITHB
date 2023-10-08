package controller;

import model.Mahasiswa;
import model.User;
import model.mahasiswa.Magister;
import model.mahasiswa.Sarjana;
import model.matakuliah.MatkulAmbil;

public class HitungNR {
    public float hitungNR(String kode){
        float total = 0;
        
        int count = 0;
        for(User mhs : main.Main.listUser){
            float nr = 0;
            if(mhs instanceof Mahasiswa){
                Mahasiswa mhs1 = (Mahasiswa) mhs;
                if(mhs1 instanceof Magister){
                    count++;
                    Magister mhs2 = (Magister) mhs1;
                    for(MatkulAmbil mk : mhs2.getMataKuliahAmbil()){
                        if(mk.getKode().equals(kode)){
                            nr += mk.getN1();
                            nr += mk.getN2();
                            nr += mk.getN3();
                            total += nr/3;
                        }
                    }
                }else if(mhs1 instanceof Sarjana){
                    count++;
                    Sarjana mhs2 = (Sarjana) mhs1;
                    for(MatkulAmbil mk : mhs2.getMataKuliahAmbil()){
                        if(mk.getKode().equals(kode)){
                            nr += mk.getN1();
                            nr += mk.getN2();
                            nr += mk.getN3();
                            total += nr/3;
                        }
                    }
                }
            }
        }
        return total/count;
    }
}
