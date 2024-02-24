package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GestionMonitores extends JFrame {

    public GestionMonitores() {
        super("Gestion Monitores");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        // Crear un panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1, 10, 10));

        // Crear botones
        JButton buscarPorIdButton = new JButton("Buscar por ID");
        JButton listarMonitoresButton = new JButton("Listar Monitores");
        JButton borrarMonitorButton = new JButton("Borrar Monitor");
        JButton modificarMonitorButton = new JButton("Modificar Monitor");
        JButton crearMonitorButton = new JButton("Crear Monitor");

        // Agregar ActionListener a cada botón
        buscarPorIdButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para buscar por ID
            }
        });

        listarMonitoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para listar monitores
            }
        });

        borrarMonitorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para borrar monitor
            }
        });

        modificarMonitorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para modificar monitor
            }
        });

        crearMonitorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para crear monitor
            }
        });

        // Agregar botones al panel
        panel.add(buscarPorIdButton);
        panel.add(listarMonitoresButton);
        panel.add(borrarMonitorButton);
        panel.add(modificarMonitorButton);
        panel.add(crearMonitorButton);

        // Agregar el panel al JFrame
        getContentPane().add(panel);

        setVisible(false);
    }
}

