public class Persona {
    private int legajo;
    private static int asignarLegajo = 0;

    public Persona() {
        this.legajo = asignarLegajo;
        asignarLegajo++;
    }
}
