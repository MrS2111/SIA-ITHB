package view;

import controller.HitungGaji;
import javax.swing.JOptionPane;

public class PrintGajiStaff {
    public PrintGajiStaff(){
        String nik = JOptionPane.showInputDialog(null, "Masukkan NIK : ", "Print User Data", JOptionPane.QUESTION_MESSAGE);
        HitungGaji hitung = new HitungGaji();
        JOptionPane.showMessageDialog(null, "Gaji : " + hitung.hitungGaji(nik), "Data : ", JOptionPane.INFORMATION_MESSAGE);
    }
}
