package controller;

import model.Staff;
import main.Main;
import model.User;
import model.matakuliah.MatkulAjar;
import model.presensi.PresensiStaff;
import model.staff.*;
import model.staff.dosen.DosenTetap;
import model.staff.dosen.Honorer;

public class HitungGaji {
    public double hitungGaji(String nik) {
        for (User staff : Main.listUser) {
            if (staff instanceof Staff) {
                Staff staff1 = (Staff) staff;
                if (staff1.getNik().equals(nik)) {
                    if (staff1 instanceof Dosen) {
                        Dosen staff2 = (Dosen) staff1;
                        if (staff2 instanceof DosenTetap) {
                            DosenTetap dsnT = (DosenTetap) staff2;
                            int total = 0;
                            for (MatkulAjar ma : dsnT.getMatkulAjar()) {
                                for (PresensiStaff ps : ma.getPresensi()) {
                                    if (ps.getStatus() == 1) {
                                        total++;
                                    }
                                }
                            }
                            return dsnT.getSalary() + ((new HitungTotalAjar().totalAjar(nik) / total) * 25000);
                        } else if (staff2 instanceof Honorer) {
                            Honorer hon = (Honorer) staff2;
                            int total = 0;
                            for (MatkulAjar ma : hon.getMatkulAjar()) {
                                for (PresensiStaff ps : ma.getPresensi()) {
                                    if (ps.getStatus() == 1) {
                                        total++;
                                    }
                                }
                            }
                            return (total * hon.getHonorPerSKS());
                        }
                    } else if (staff1 instanceof Karyawan) {
                        Karyawan kry = (Karyawan) staff1;
                        double total = 0;
                        for (PresensiStaff ps : kry.getPresensiHadir()) {
                            if (ps.getStatus() == 1) {
                                total++;
                            }
                        }
                        return total/22 * kry.getSalary();
                    }
                }
            }
        }
        return 0;
    }
}
