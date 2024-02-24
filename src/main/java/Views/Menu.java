package Views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame{
    private JButton btnMonitores;
    private JButton btnInstructores;
    private JLabel labelTitle;
    private JPanel panel;

    public Menu(){

        btnInstructores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GestionInstructores gestionInstructores = new GestionInstructores();
                gestionInstructores.setVisible(true);
            }
        });
        btnMonitores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GestionMonitores gestionMonitores = new GestionMonitores();
                gestionMonitores.setVisible(true);
            }
        });
    }

    public JPanel getPanel() {
        return this.panel;
    }
}
