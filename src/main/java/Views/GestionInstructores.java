package Views;

import Models.Instructor;
import Services.Persistance.CrudService;
import Services.Persistance.InstructorServiceImp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionInstructores extends JFrame {

    private final CrudService<Instructor> instructorService = new InstructorServiceImp();

    public GestionInstructores(){
        super("Gestion Instructores");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        // Creación de un panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1, 10, 10));

        // Crear botones
        JButton buscarPorIdButton = new JButton("Buscar por ID");
        JButton listarInstructoresButton = new JButton("Listar Instructores");
        JButton borrarInstructorButton = new JButton("Borrar Instructor");
        JButton modificarInstructorButton = new JButton("Modificar Instructor");
        JButton crearInstructorButton = new JButton("Crear Instructor");

        // Agregar ActionListener a cada botón
        buscarPorIdButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = JOptionPane.showInputDialog("Por favor, ingresa un ID:");
                Instructor instructor = instructorService.findById(id);
                JOptionPane.showMessageDialog(null, "Instructor encontrado: " + instructor.toString());
            }
        });

        listarInstructoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para listar instructores
            }
        });

        borrarInstructorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para borrar instructor
            }
        });

        modificarInstructorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para modificar instructor
            }
        });

        crearInstructorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para crear instructor
            }
        });

        // Agregar botones al panel
        panel.add(buscarPorIdButton);
        panel.add(listarInstructoresButton);
        panel.add(borrarInstructorButton);
        panel.add(modificarInstructorButton);
        panel.add(crearInstructorButton);

        // Agregar el panel al JFrame
        getContentPane().add(panel);

        setVisible(false);
    }

}
