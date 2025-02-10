public class Profesor extends Persona {
    private String nombre;
    private double basico;
    private int antiguedad;

    public Profesor(String nombre, double basico, int antiguedad) {
        super();
        this.nombre = nombre;
        this.basico = basico;
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getBasico() {
        return basico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public double calcularSueldo() {
        double sueldo = basico;
        for (int i = 0; i < antiguedad; i += 5) {
            sueldo += (sueldo * 0.1);
        }
        return sueldo;
    }
}
