import java.util.ArrayList;

public class Banco {
    private String nombre;
    private double interes;
    private ArrayList<CuentaCorriente> listadoCuentasCorrientes = new ArrayList<CuentaCorriente>();
    private int numeroTrabajadores;

    public Banco(String nombre, double interes, ArrayList<CuentaCorriente> listadoCuentaCorrientes,
            int nunmeroTrabajadores) {
        this.nombre = nombre;
        this.interes = interes;
        this.listadoCuentasCorrientes = listadoCuentaCorrientes;
        this.numeroTrabajadores = nunmeroTrabajadores;
    }

    public String getNombre() {
        return nombre;
    }

    public double getInteres() {
        return interes;
    }

    public ArrayList<CuentaCorriente> getListadoCuentasCorrientes() {
        return this.listadoCuentasCorrientes;
    }

    public int getNumeroTrabajadores() {
        return numeroTrabajadores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public void setNumeroTrabajadores(int numeroTrabajadores) {
        this.numeroTrabajadores = numeroTrabajadores;
    }

    public void agregarCuenta(Cliente cliente) {
        CuentaCorriente cc = new CuentaCorriente(cliente);
        listadoCuentasCorrientes.add(cc);
    }

    public String infoCuenta(Cliente cliente) {
        for (CuentaCorriente cc : listadoCuentasCorrientes) {
            if (cc.getTitular() == cliente) {
                return "Nombre completo: " + cc.getTitular().getNombre() + " " + cc.getTitular().getApellido() + "\n"
                        + "Iban " + cc.getIban() + "\n" + "Saldo "
                        + cc.getSaldo();
            }
        }
        return "No se ha encontrado ninguna cuenta con ese IBAN";
    }

    public String eliminarCuenta(long iban) {
        for (CuentaCorriente cc : listadoCuentasCorrientes) {
            if (cc.getIban() == iban) {
                listadoCuentasCorrientes.remove(cc);
                return "Cuenta borrada: " + true;
            }
        }
        return "Cuenta borrada" + false;
    }

    public void traspasarCuenta(long iban, Cliente destinatario) {
        for (CuentaCorriente cuentaCorriente : listadoCuentasCorrientes) {
            if (cuentaCorriente.getIban() == iban) {
                cuentaCorriente.setTitular(destinatario);
            }
        }
    }

    // public static Banco fusionarBancos(Banco banco1, Banco banco2) {
    //     String nuevoNombre = banco1.getNombre() + " y " + banco2.getNombre();
    //     ArrayList<CuentaCorriente> nuevoListadoCuentasCorrientes = new ArrayList<CuentaCorriente>();
    //     nuevoListadoCuentasCorrientes = banco1.getListadoCuentasCorrientes() + banco2.getListadoCuentasCorrientes();
    // }
}
