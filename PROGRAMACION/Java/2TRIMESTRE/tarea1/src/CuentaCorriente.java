public class CuentaCorriente {
    private Cliente titular;
    private long iban, saldo;
    private static long asignarIBAN = 0;

    public CuentaCorriente(Cliente titular) {
        this.titular = titular;
        iban = asignarIBAN;
        saldo = 0;
        asignarIBAN++;
    }

    public long getIban() {
        return iban;
    }

    public long getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void sacarDinero(long cantidad) {
        if (cantidad > saldo || cantidad < 0) {
            if (cantidad > saldo) {
                System.out.println("No se puede sacar más dinero del que hay en la cuenta");
            } else if (cantidad < 0) {
                System.out.println("No se puede ingresar una cantidad negativa");
            }
        } else {
            saldo -= cantidad;
        }
    }

    public void ingresarDinero(long cantidad) {
        if (cantidad < 0) {
            System.out.println("No se puede ingresar una cantidad negativa");
        } else {
            saldo += cantidad;
        }
    }

    public void cambiarTitular(Cliente nuevoTitular) {
        titular = nuevoTitular;
    }

    public static void transferirDinero(CuentaCorriente cuentaSalida, CuentaCorriente cuentaDestino, long saldo) {
        if (cuentaSalida.getSaldo() < saldo) {
            System.out.println("No se puede transferir la cantidad de " + saldo
                    + " euros ya que no se dispone de dicha cantidad.");
        } else if (saldo < 0) {
            System.out.println("No tienes suficiente dinero en la cuenta para realizar la transferencia de " + saldo
                    + " euros. ya que es una cifra negativa");
        } else {
            cuentaSalida.sacarDinero(saldo);
            cuentaDestino.ingresarDinero(saldo);
        }
    }
}
