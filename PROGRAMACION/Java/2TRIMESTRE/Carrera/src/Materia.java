import java.util.ArrayList;

public class Materia {
    String nombre;
    Profesor titular;
    ArrayList<Materia> listaMaterias = new ArrayList<Materia>();

    public Materia(String nombre, Profesor titular, ArrayList<Materia> listaMaterias) {
        this.nombre = nombre;
        this.titular = titular;
        this.listaMaterias = listaMaterias;
    }
}
