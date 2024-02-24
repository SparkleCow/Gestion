package Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Monitor {
    private Long id;
    private String nombre;
    private Long telefono;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String correo;
}
