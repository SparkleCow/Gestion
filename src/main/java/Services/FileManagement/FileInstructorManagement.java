package Services.FileManagement;

import Models.Instructor;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FileInstructorManagement {
    private File file;

    public FileInstructorManagement(){
        crearArchivo();
    }

    public void crearArchivo(){
        file = new File("datosInstructores.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e);
        }
    }

    public void saveInstructor(Instructor instructor){
        String idInstructor = String.valueOf(instructor.getId());
        String nombreInstructor=instructor.getNombre();
        String correoInstructor=instructor.getCorreo();
        String telefonoInstructor=String.valueOf(instructor.getTelefono());
        String direccionInstructor=instructor.getDireccion();
        String fechaNacimientoInstructor=String.valueOf(instructor.getFechaNacimiento());

        try {
            FileWriter escritor = new FileWriter(file, true);
            escritor.write(idInstructor+"%"+nombreInstructor+"%"+telefonoInstructor+"%"+fechaNacimientoInstructor
                    +"%"+direccionInstructor+"%"+correoInstructor+"\r\n");
            escritor.close();
        } catch (IOException ex) {
            System.out.println("No se pudo guardar al instructor "+ex);
        }
    }

    public Instructor findInstructorById(String id) {
        try (BufferedReader lector = new BufferedReader(new FileReader(file))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split("%");
                String idInstructor = partes[0];
                if (idInstructor.equalsIgnoreCase(id)) {
                    String nombre = partes[1];
                    String telefono = partes[2];
                    String fechaNacimiento = partes[3];
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
                    LocalDate fechaLocalDate = LocalDate.parse(fechaNacimiento, formatter);
                    String direccion = partes[4];
                    String correo = partes[5];
                    return new Instructor(Long.valueOf(id),
                            nombre,
                            Long.valueOf(telefono),
                            fechaLocalDate,
                            direccion,
                            correo);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al buscar instructor por ID: " + e);
        }
        return null;
    }
}
