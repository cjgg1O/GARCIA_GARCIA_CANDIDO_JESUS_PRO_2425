import java.sql.Date;
import java.util.ArrayList;

public class Asistencia {
    Date fecha;
    ArrayList<Alumno> assistenciaAlumnos = new ArrayList<Alumno>();

    public Asistencia(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void agregarAlumno(Alumno alumno) {
        assistenciaAlumnos.add(alumno);
    }

    public void eliminarAlumno(Alumno alumno) {
        for (Alumno alumno2 : assistenciaAlumnos) {
            if (alumno.equals(alumno2)) {
                assistenciaAlumnos.remove(alumno2);
            }
        }
    }

    public int contarAlumnos() {
        return assistenciaAlumnos.size();
    }
}
