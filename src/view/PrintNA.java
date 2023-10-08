package view;

import controller.HitungNA;
import javax.swing.JOptionPane;

public class PrintNA {
    public PrintNA() {
        String nim = JOptionPane.showInputDialog(null, "Masukkan NIM : ", "Print User Data", JOptionPane.QUESTION_MESSAGE);
        String kodeMK = JOptionPane.showInputDialog(null, "Masukkan Kode Mata Kuliah : ", "Print User Data", JOptionPane.QUESTION_MESSAGE);
        HitungNA hitung = new HitungNA();
        JOptionPane.showMessageDialog(null, "Nilai Akhir : "+hitung.hitungNA(nim, kodeMK), "Data : ", JOptionPane.INFORMATION_MESSAGE);
    }
}
