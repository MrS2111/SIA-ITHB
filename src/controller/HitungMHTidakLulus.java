package controller;


public class HitungMHTidakLulus {
    public int[] HitungMH(String kodeMK) {
        int countTidakLulus = 0;
        int total = 0;
        for (model.User mhs : main.Main.listUser) {
            if (mhs instanceof model.Mahasiswa) {
                model.Mahasiswa mhs1 = (model.Mahasiswa) mhs;
                if (mhs1 instanceof model.mahasiswa.Magister) {
                    model.mahasiswa.Magister mhs2 = (model.mahasiswa.Magister) mhs1;
                    for (model.matakuliah.MatkulAmbil mk : mhs2.getMataKuliahAmbil()) {
                        if (mk.getKode().equals(kodeMK)) {
                            total++;
                            HitungNA hitung = new controller.HitungNA();
                            if (hitung.hitungNA(mhs1.getNim(), kodeMK) < 56) {
                                countTidakLulus++;
                            }
                        }
                    }
                } else if (mhs1 instanceof model.mahasiswa.Sarjana) {
                    model.mahasiswa.Sarjana mhs2 = (model.mahasiswa.Sarjana) mhs1;
                    for (model.matakuliah.MatkulAmbil mk : mhs2.getMataKuliahAmbil()) {
                        if (mk.getKode().equals(kodeMK)) {
                            total++;
                            controller.HitungNA hitung = new controller.HitungNA();
                            if (hitung.hitungNA(mhs1.getNim(), kodeMK) < 56) {
                                countTidakLulus++;
                            }
                        }
                    }
                }
            }
        }
        return new int[] { countTidakLulus, total };
    }
}