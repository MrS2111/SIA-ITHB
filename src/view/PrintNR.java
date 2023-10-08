package view;

import javax.swing.JOptionPane;
import controller.HitungNR;

public class PrintNR {
    public PrintNR() {
        String kode = JOptionPane.showInputDialog(null, "Masukkan Kode Mata Kuliah : ", "Print User Data", JOptionPane.QUESTION_MESSAGE);
        HitungNR hitung = new HitungNR();
        JOptionPane.showMessageDialog(null, "Rata-rata nilai akhir seluruh mahasiswa : "+hitung.hitungNR(kode), "Data : ", JOptionPane.INFORMATION_MESSAGE);
    }
}
