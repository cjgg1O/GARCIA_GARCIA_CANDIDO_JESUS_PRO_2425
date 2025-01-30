import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws Exception {
        ArrayList<Alumno> coleccionAlumnos = new ArrayList<Alumno>();
        ArrayList<Materia> coleccionMaterias = new ArrayList<Materia>();
        Alumno candi = new Alumno("Cándido Jesús");
        Alumno carlos = new Alumno("Carlos Casablanca");
        Profesor pablo = new Profesor("Pablo", 1200, 20);
        Materia naturales = new Materia("Ciencias", pablo, coleccionAlumnos);
        Carrera ciencia = new Carrera("Ciencias", "Ciencias", coleccionMaterias);

        ciencia.agregarMateria(naturales);
        naturales.agregarAlumno(candi);

        System.out.println(ciencia.infoMateria(naturales));
    }
}
