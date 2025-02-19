import java.util.ArrayList;

public class Carrera {
    private String nombre, facultad;
    private ArrayList<Carrera> coleccionCarreras = new ArrayList<Carrera>();
    private ArrayList<Materia> coleccionMaterias = new ArrayList<Materia>();

    public Carrera(String nombre, String facultad, ArrayList<Materia> coleccionMaterias) {
        this.nombre = nombre;
        this.facultad = facultad;
        this.coleccionMaterias = coleccionMaterias;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void agregarMateria(Materia materia) {
        coleccionMaterias.add(materia);
    }

    public void eliminarMateria(Materia materia) {
        for (Materia materia2 : coleccionMaterias) {
            if (materia.equals(materia2)) {
                coleccionMaterias.remove(materia2);
            } else {
                System.out.println("No se ha encotnrado la materia seleccionada");
            }
        }
    }

    public int contarMaterias() {
        return coleccionMaterias.size();
    }

    public Materia encontrarMateria(String nombreMateria) {
        for (Materia materia : coleccionMaterias) {
            if (materia.getNombre().equals(nombreMateria)) {
                return materia;
            } else {
                System.out.println("No se ha encontrado la materia seleccionada");
            }
        }
        return null;
    }

    public void crearColeccion() {
        this.coleccionCarreras = new ArrayList<Carrera>();
    }

    public void agregarCarrera(Carrera carrera) {
        coleccionCarreras.add(carrera);
    }

    public void eliminarCarrera(Carrera carrera) {
        for (Carrera carrera2 : coleccionCarreras) {
            if (carrera.equals(carrera2)) {
                coleccionCarreras.remove(carrera2);
            } else {
                System.out.println("No se ha encontrado la carrera seleccionada");
            }
        }
    }

    // public String infoCarrera() {
    //     for (int i = 0; i < coleccionCarreras.size(); i++) {
    //         return coleccionCarreras.get(i).getNombre();
    //     }
    //     return null;
    // }
}
