import Controllers.Controlador;
import Models.Instructor;
import Services.FileManagement.FileInstructorManagement;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Controlador controller = new Controlador();
        controller.start();

        Instructor instructor = new Instructor();
        instructor.setId(1L);
        instructor.setNombre("Jose");
        instructor.setTelefono(231233123L);
        instructor.setFechaNacimiento(LocalDate.of(2014, 11, 1));
        instructor.setDireccion("Calle falsa 123");
        instructor.setCorreo("XXXXXXXXXXXXXX");

        FileInstructorManagement fm = new FileInstructorManagement();
        fm.saveInstructor(instructor);
    }
}
