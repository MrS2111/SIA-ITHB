package view;

import controller.HitungMatkulAmbil;
import javax.swing.JOptionPane;

public class PrintMatkulAmbilMHS {
    public PrintMatkulAmbilMHS() {
        String nim = JOptionPane.showInputDialog(null, "Masukkan NIM : ", "Print User Data",
                JOptionPane.QUESTION_MESSAGE);
        HitungMatkulAmbil hitung = new HitungMatkulAmbil();
        String hasil = hitung.hitungMKA(nim);
        JOptionPane.showMessageDialog(null, "Mata Kuliah yang diambil mahasiswa : " + hasil, "Data : ",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
