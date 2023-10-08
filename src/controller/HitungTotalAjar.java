package controller;

import model.staff.Dosen;
import model.matakuliah.MatkulAjar;
import model.presensi.PresensiStaff;
import main.Main;
import model.User;

public class HitungTotalAjar {
    public int totalAjar(String nik) {
        int total = 0;
        for (User dsn : Main.listUser) {
            if(dsn instanceof Dosen ){
                Dosen dsn2 = (Dosen) dsn;
                if(dsn2.getNik().equals(nik)){
                    for(MatkulAjar ma : dsn2.getMatkulAjar()){
                        for(PresensiStaff ps : ma.getPresensi()){
                            if(ps.getStatus() == 1){
                                total += ps.getJam();
                            }
                        }
                    }
                }
            }
        }
        return total;
    }
}
