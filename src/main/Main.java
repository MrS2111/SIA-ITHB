package main;

import java.util.ArrayList;
import model.*;
import model.mahasiswa.Doktor;
import model.mahasiswa.Magister;
import model.mahasiswa.Sarjana;
import model.matakuliah.*;
import model.presensi.*;
import model.staff.*;
import model.staff.dosen.*;

public class Main {
   public static ArrayList<MataKuliah> matkul = new ArrayList<MataKuliah>(){
        {
            add(new MataKuliah("Web Desain", "IF-102", 2));
            add(new MataKuliah("Algoritma dan Pemrograman", "IF-104", 4));
            add(new MataKuliah("Sistem Berkas", "IF-303", 2));
            add(new MataKuliah("Struktur Data", "IF-201", 4));
            add(new MataKuliah("Sistem Informasi", "SI-308", 2));
            add(new MataKuliah("Pemrograman Web", "IF-2P4", 2));
            add(new MatkulPilihan("Kalkulus 1", "KU-102", 3, 20));
            add(new MataKuliah("Probabilitas dan Statistika", "TI-794", 2));
            add(new MatkulPilihan("Agama", "KU-101", 3, 50));
        }
    };
   public static ArrayList<MataKuliah> matkulAmbil = new ArrayList<MataKuliah>(){
        {
            add(new MataKuliah("Web Desain", "IF-102", 2));
            add(new MataKuliah("Algoritma dan Pemrograman", "IF-104", 4));
            add(new MataKuliah("Sistem Berkas", "IF-303", 2));
            add(new MataKuliah("Struktur Data", "IF-201", 4));
            add(new MataKuliah("Sistem Informasi", "SI-308", 2));
            add(new MataKuliah("Pemrograman Web", "IF-2P4", 2));
            add(new MatkulPilihan("Kalkulus 1", "KU-102", 3, 20));
            add(new MataKuliah("Probabilitas dan Statistika", "TI-794", 2));
            add(new MatkulPilihan("Agama", "KU-101", 3, 50));
        }
    };
   public static ArrayList<String> tesis = new ArrayList<String>(){
        {
            add("Perancangan Algoritma");
            add("Perancangan Database");
        }
    };
   public static ArrayList<MatkulAjar> matkulAjar = new ArrayList<MatkulAjar>(){
        {
            add(new MatkulAjar("Web Desain", "IF-102", 2, listPresensiStaff));
            add(new MatkulAjar("Algoritma dan Pemrograman", "IF-104", 4, listPresensiStaff));
            add(new MatkulAjar("Sistem Berkas", "IF-303", 2, listPresensiStaff));
            add(new MatkulAjar("Struktur Data", "IF-201", 4, listPresensiStaff));
        }
    };
   public static ArrayList<Presensi> listPresensi = new ArrayList<Presensi>(){
        {
            add(new Presensi("20-09-2023", Status.ALPHA));
            add(new Presensi("21-09-2023", Status.HADIR));
            add(new Presensi("22-09-2023", Status.ALPHA));
        }
    };
   public static ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<PresensiStaff>(){
        {
            add(new PresensiStaff("20-09-2023", Status.ALPHA, 3));
            add(new PresensiStaff("21-09-2023", Status.HADIR, 2));
            add(new PresensiStaff("22-09-2023", Status.ALPHA, 4));
        }
    };
   public static ArrayList<Karyawan> listKaryawan = new ArrayList<Karyawan>(){
        {
            add(new Karyawan("Andy", "Jl. Dipatiukur 20", "Bandung, 20 Oktober 1990", "08721573471", "018374658383", 100000, new ArrayList<PresensiStaff>(listPresensiStaff.subList(0, 1))));
            add(new Karyawan("Alek", "Jl. Nawawi 20", "Bandung, 10 Oktober 1998", "08721573471", "018374658383", 150000, new ArrayList<PresensiStaff>(listPresensiStaff.subList(1, 2))));
            add(new Karyawan("Rex", "Jl. Dipatiukur 11", "Bandung, 20 Desember 1980", "08721573471", "018374658383", 200000, new ArrayList<PresensiStaff>(listPresensiStaff.subList(2, 3))));
        }
    };
   public static ArrayList<Dosen> listDosen = new ArrayList<Dosen>(){
        {
            add(new DosenTetap("Adi", "Ciganitri 20", "Arab, 11-09-1998", "8942738479823", "3705720384728034", "UNIKOM", 4000000.0, matkulAjar));
            add(new DosenTetap("Ahmad", "Cikutra 11", "Belanda, 11-03-1998", "894273847452123", "370572123241567865", "ITHB", 2000000.0, matkulAjar));
        }
    };
   public static ArrayList<MatkulAmbil> listMatkulAmbil = new ArrayList<MatkulAmbil>(){
        {
            add(new MatkulAmbil("Struktur Data", "IF-201", 4, 80, 70, 90, listPresensi));
            add(new MatkulAmbil("Kalkulus 1", "KU-102", 3,60,50,70, listPresensi));
            add(new MatkulAmbil("Sistem Informasi", "SI-308", 2, 95, 100, 90, listPresensi));
        }
    };
   public static ArrayList<Sarjana> listSarjana = new ArrayList<Sarjana>(){
        {
            add(new Sarjana("Deden", "Cikutra 10", "Bandung, 30-01-1995", "088218373632", "123415123", "MIT", listMatkulAmbil));
        }
    };
   public static ArrayList<Magister> listMagister = new ArrayList<Magister>(){
        {
            add(new Magister("Hadinoto", "Bulak laut 30", "Bali, 23-01-2000", "0864931257", "4523012587", "Menegement", tesis.get(0), listMatkulAmbil));
        }
    };
   public static ArrayList<String> listPenelitian = new ArrayList<String>(){
        {
            add("Perancangan UU");
            add("Undang-undang bisnis melawan korupsi di dalam perusahaan");
        }
    };
    public static ArrayList<Doktor> listDoktor = new ArrayList<Doktor>(){
        {
            add(new Doktor("Hitler", "Batununggal 11", "Jerman 20-04-1950", "0846521321", "9562563002", "Hukum", listPenelitian, 80.31f, 70.7f, 95.1f));
        }
    };
    public static ArrayList<User> listUser = new ArrayList<User>(){
        {
            for(Sarjana sarjana : listSarjana){
                add(sarjana);
            }
            for(Magister magister : listMagister){
                add(magister);
            }
            for(Doktor doktor : listDoktor){
                add(doktor);
            }
            for(Karyawan karyawan : listKaryawan){
                add(karyawan);
            }
            for(Dosen dosen : listDosen){
                add(dosen);
            }
        }
    };
    public static void main(String[] args) {
        new view.MainMenu();
    }
}
