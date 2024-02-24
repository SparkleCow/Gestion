package Controllers;

import Views.Menu;

import javax.swing.*;

public class Controlador {
    public void start() {
        Menu menu = new Menu();
        menu.setContentPane(menu.getPanel());
        menu.setVisible(true);
        menu.setSize(400,400);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
