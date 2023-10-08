package controller;

import main.Main;
import model.Mahasiswa;
import model.mahasiswa.*;


public class HitungNA {
    public float hitungNA(String nim, String kodeMK) {
        for (int i = 0; i < Main.listUser.size(); i++) {
            Mahasiswa mahasiswa = (Mahasiswa) Main.listUser.get(i);
            if (mahasiswa.getNim().equals(nim) && Main.listUser.get(i) instanceof Mahasiswa) {
                if (mahasiswa instanceof Doktor) {
                    Doktor doktor = (Doktor) Main.listUser.get(i);
                    float nilai = doktor.getSidang1();
                    nilai += doktor.getSidang2();
                    nilai += doktor.getSidang3();
                    nilai = nilai / 3;
                    return nilai;
                } else if (mahasiswa instanceof Magister) {
                    Magister magister = (Magister) Main.listUser.get(i);
                    for (int j = 0; j < magister.getMataKuliahAmbil().size(); j++) {
                        if (magister.getMataKuliahAmbil().get(j).getKode().equals(kodeMK)) {
                            float nilai = magister.getMataKuliahAmbil().get(j).getN1();
                            nilai += magister.getMataKuliahAmbil().get(j).getN2();
                            nilai += magister.getMataKuliahAmbil().get(j).getN3();
                            nilai = nilai / 3;
                            return nilai; 
                        }
                    }
                }else if(mahasiswa instanceof Sarjana){
                    Sarjana sarjana = (Sarjana) Main.listUser.get(i);
                    for (int j = 0; j < sarjana.getMataKuliahAmbil().size(); j++) {
                        if (sarjana.getMataKuliahAmbil().get(j).getKode().equals(kodeMK)) {
                            float nilai = sarjana.getMataKuliahAmbil().get(j).getN1();
                            nilai += sarjana.getMataKuliahAmbil().get(j).getN2();
                            nilai += sarjana.getMataKuliahAmbil().get(j).getN3();
                            nilai = nilai / 3;
                            return nilai; 
                        }
                    }
                }
            }
        }
        return 0;
    }
}
