import java.util.ArrayList;
import java.sql.Date;

public class Materia {
    private String nombre;
    private Profesor titular;
    private ArrayList<Alumno> coleccionAlumnos = new ArrayList<Alumno>();
    private ArrayList<Asistencia> coleccionAsistencias = new ArrayList<Asistencia>();

    public Materia(String nombre, Profesor titular) {
        this.nombre = nombre;
        this.titular = titular;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarAlumno(Alumno alumno) {
        coleccionAlumnos.add(alumno);
    }

    public void eliminarAlumno(Alumno alumno) {
        for (Alumno alumno2 : coleccionAlumnos) {
            if (alumno.equals(alumno2)) {
                coleccionAlumnos.remove(alumno2);
            } else {
                System.out.println("No se ha encontrado al alumno seleccionado");
            }
        }
    }

    public void agregarAsistencia(Asistencia asistencia) {
        coleccionAsistencias.add(asistencia);
    }

    public void eliminarAsistencia(Asistencia asistencia) {
        for (Asistencia asistencia2 : coleccionAsistencias) {
            if (asistencia.equals(asistencia2)) {
                coleccionAsistencias.remove(asistencia2);
            }
        }
    }

    public int calcularInscriptos() {
        return coleccionAlumnos.size();
    }

    public double calcularAsistencia(Date fecha) {
        for (Asistencia asistencia : coleccionAsistencias) {
            if (asistencia.getFecha().equals(fecha)) {
                return asistencia.contarAlumnos();
            }
        }
        return 0;
    }
}
