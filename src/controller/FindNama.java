package controller;

import model.User;
import main.Main;

public class FindNama {
    public String find(String nama){
        for (User user : Main.listUser) {
            if (user.getUserName().equals(nama)) {
                System.out.println(user.toString());
                return user.toString();
            }
        }
        return "User tidak ditemukan";
    }
}
