package view;

import javax.swing.JOptionPane;


public class MainMenu {
    public MainMenu(){
        JOptionPane.showMessageDialog(null, "Selamat datang di SIA");
        int menu = 0;
        while(menu != 8){
        menu = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Print User Data \n 2. Print Nilai Akhir \n 3. Print Rata-Rata Nilai Akhir (NR) seluruh mahasiswa \n 4. Print Mahasiswa yang tidak lulus \n 5. Print Matkul Ambil Mahasiswa tertentu \n 6. Print total jam mengajar suatu Dosen \n 7. Print gaji Seorang staff \n 8. Exit", "Menu", JOptionPane.QUESTION_MESSAGE));

        switch (menu){
            case 1:
            PrintUserDataScreen print = new PrintUserDataScreen();
            print.print();
            break;
            case 2:
            new PrintNA();
            break;
            case 3:
            new PrintNR();
            break;
            case 4:
            new PrintMahasiswaTidakLulus();
            break;
            case 5:
            new PrintMatkulAmbilMHS();
            break;
            case 6:
            new PrintTotalAjar();
            break;
            case 7:
            new PrintGajiStaff();
            break;
            case 8:
            System.exit(0);
            break;
            default:
            JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
            break;
        }
    }
}
}
