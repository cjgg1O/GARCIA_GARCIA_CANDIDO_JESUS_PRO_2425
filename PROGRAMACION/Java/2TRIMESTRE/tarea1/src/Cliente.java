public class Cliente {
    private String nombre, apellido, dni;
    private Raza raza;

    public Cliente(String nombre, String apellido, String dni, Raza raza) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

}
