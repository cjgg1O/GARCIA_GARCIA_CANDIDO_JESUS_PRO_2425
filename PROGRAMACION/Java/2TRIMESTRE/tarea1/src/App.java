import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<CuentaCorriente> listadoCuentaCorrientes = new ArrayList<CuentaCorriente>();
        Banco bbva = new Banco("BBVA", 0.25, listadoCuentaCorrientes, 50);
        Cliente candi = new Cliente("Cándido Jesús", "García García", "80232138L", Raza.mongolica);
        Cliente carlos = new Cliente("Carlos Casablanca", "Osorio", "80232138s", Raza.caucasica);
        bbva.agregarCuenta(candi);
        System.out.println(bbva.infoCuenta(candi));
        System.out.println(bbva.infoCuenta(carlos));
        bbva.traspasarCuenta(0, carlos);
        System.out.println(bbva.infoCuenta(candi));
        System.out.println(bbva.infoCuenta(carlos));
    }
}
