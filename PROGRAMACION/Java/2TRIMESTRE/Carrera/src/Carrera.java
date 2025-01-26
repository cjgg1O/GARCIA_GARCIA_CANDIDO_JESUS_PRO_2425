import java.util.ArrayList;

public class Carrera {
    private String nombre, facultad;
    private ArrayList<Carrera> coleccionCarreras = new ArrayList<Carrera>();

    public Carrera(String nombre,String facultad, ArrayList<Carrera> coleccionCarreras) {
        this.nombre = nombre;
        this.facultad = facultad;
        this.coleccionCarreras = coleccionCarreras;
    }

    public void agregarMateria(Materia materia) {
        materia = new Materia();
        listaMaterias.add(materia);
    }

    public void eliminarMateria(Materia materia) {
        listaMaterias.remove(materia);
    }

    public int contarMaterias() {
        return listaMaterias.size();
    }

    public int encontrarMateria(Materia materia) {
        int posicion = 0;
        for (Materia encontrar : listaMaterias) {
            if (encontrar.equals(materia)) {
                return posicion;
            }
            posicion++;
        }
        return -1;
    }
}