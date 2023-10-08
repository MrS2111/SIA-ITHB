package view;

import controller.FindNama;
import javax.swing.JOptionPane;


public class PrintUserDataScreen {
    public void print(){
        String nama = JOptionPane.showInputDialog(null, "Masukkan nama : ", "Print User Data", JOptionPane.QUESTION_MESSAGE);
        FindNama find = new FindNama();
        JOptionPane.showMessageDialog(null, find.find(nama), "Data : ", JOptionPane.INFORMATION_MESSAGE);
    }    
}
