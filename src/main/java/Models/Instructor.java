package Models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Instructor {
    private static long count = 0;
    private Long id;
    private String nombre;
    private Long telefono;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String correo;
}
