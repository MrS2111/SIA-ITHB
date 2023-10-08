package controller;

import main.*;
import model.Mahasiswa;
import model.Presensi;
import model.mahasiswa.Magister;
import model.mahasiswa.Sarjana;
import model.User;

public class HitungMatkulAmbil {
    public String hitungMKA(String nim) {
        for (User mhs : Main.listUser) {
            if (mhs instanceof Mahasiswa) {
                Mahasiswa mhs1 = (Mahasiswa) mhs;
                if (mhs1.getNim().equals(nim)) {
                    if (mhs1 instanceof model.mahasiswa.Magister) {
                        Magister mhs2 = (Magister) mhs1;
                        String result = "";
                        for (model.matakuliah.MatkulAmbil mk : mhs2.getMataKuliahAmbil()) {
                            int presensiHadir = 0;
                            result += "Kode : " + mk.getKode() + "\n Nama :  " + mk.getNama() + "\n SKS :  "
                                    + mk.getSKS() + "\n Nilai 1 : " + mk.getN1() + "\n Nilai 2 : "
                                    + mk.getN2() + "\n Nilai 3 : " + mk.getN3() + "\n ";
                            for (Presensi presensi : mk.getPresensi()) {
                                if (presensi.getStatus() == 1) {
                                    presensiHadir++;
                                }
                            }
                            result += "Total Presensi : " + presensiHadir + "\n==================\n";
                        }
                        return result;
                    }
                    if (mhs1 instanceof Sarjana) {
                        Sarjana mhs2 = (Sarjana) mhs1;
                        String result = "";
                        for (model.matakuliah.MatkulAmbil mk : mhs2.getMataKuliahAmbil()) {
                            int presensiHadir = 0;
                            result += "Kode : " + mk.getKode() + "\n Nama :  " + mk.getNama() + "\n SKS :  "
                                    + mk.getSKS() + "\n Nilai 1 : " + mk.getN1() + "\n Nilai 2 : "
                                    + mk.getN2() + "\n Nilai 3 : " + mk.getN3() + "\n ";
                            for (Presensi presensi : mk.getPresensi()) {
                                if (presensi.getStatus() == 1) {
                                    presensiHadir++;
                                }
                            }
                            result += "Total Presensi : " + presensiHadir + "\n==================\n";
                        }
                        return result;
                    }
                }
            }
        }
        return "Mahasiswa tidak ditemukan";
    }
}
