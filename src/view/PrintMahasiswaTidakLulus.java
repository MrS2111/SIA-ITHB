package view;

import controller.HitungMHTidakLulus;
import javax.swing.JOptionPane;

public class PrintMahasiswaTidakLulus {
    public PrintMahasiswaTidakLulus(){
        String kode = JOptionPane.showInputDialog(null, "Masukkan Kode Mata Kuliah : ", "Print User Data", JOptionPane.QUESTION_MESSAGE);
        HitungMHTidakLulus hitung = new HitungMHTidakLulus();
        int[] hasil = hitung.HitungMH(kode);
        JOptionPane.showMessageDialog(null, "Jumlah mahasiswa yang tidak lulus : "+hasil[0]+"\nJumlah mahasiswa yang mengambil mata kuliah : "+hasil[1], "Data : ", JOptionPane.INFORMATION_MESSAGE);
    }

}
