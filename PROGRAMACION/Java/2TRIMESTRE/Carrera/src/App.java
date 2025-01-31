import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws Exception {
        ArrayList<Alumno> coleccionAlumnos = new ArrayList<Alumno>();
        ArrayList<Materia> coleccionMaterias = new ArrayList<Materia>();
        Alumno candi = new Alumno("Cándido Jesús");
        Alumno carlos = new Alumno("Carlos Casablanca");
        Profesor pablo = new Profesor("Pablo", 1200, 20);
        Materia naturales = new Materia("Naturales", pablo, coleccionAlumnos);
        Carrera ciencia = new Carrera("Ciencias", "Ciencias", coleccionMaterias);

        ciencia.agregarMateria(naturales);
        naturales.agregarAlumno(candi);
        naturales.agregarAlumno(carlos);

        System.out.println(ciencia.infoCarrera());
        System.out.println(naturales.infoMateria());
    }
}
