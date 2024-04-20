import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class Persona {
    String nombre;
    LocalDate FechaNac;
    private DateTimeFormatter format;

    public int edad() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(FechaNac, fechaActual);
        return periodo.getYears();
    }

    public Persona(String nombre, String fechaNac) {
        format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.nombre = nombre;
        this.FechaNac = LocalDate.parse(fechaNac, format);
    }
}