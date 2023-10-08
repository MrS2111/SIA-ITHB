package view;

import javax.swing.JOptionPane;

import controller.HitungTotalAjar;

public class PrintTotalAjar {
    public PrintTotalAjar() {
        String nik = JOptionPane.showInputDialog(null, "Masukkan NIK : ", "Print User Data",
                JOptionPane.QUESTION_MESSAGE);
        HitungTotalAjar hitung = new HitungTotalAjar();
        JOptionPane.showMessageDialog(null, "Total Ajar : " + hitung.totalAjar(nik), "Data : ",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
