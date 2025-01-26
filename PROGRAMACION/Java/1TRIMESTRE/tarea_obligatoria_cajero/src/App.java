/* ID Plugin: shd101wyy.markdown-preview-enhanced
 Copia el id del plugin y pegalo en el buscador de lugins, te deberia salir solo ese
 Para ver el documento junto con el codigo abre el codigo del documento y te 
 aparecerá en la esquina arriba a la derecha dos simbolos, 
 uno sin la lupa y otro con la lupa, con hacer clic en el de la lupa se te abre como documento 
 y ya puedes abrir el app.java en la pestaña de la izquierda */

 import java.util.Scanner;

public class App {

    // Debemos hacer un cajero automatico que tenga un menu que contenga la opción
    // 1. Consultar saldo 2. Ingresar dinero 3. Retirar dinero 4. Salir.

    public static void cajero() throws InterruptedException {
        int saldo = 0;
        int ingresos = 0;
        int retiradas = 0;
        int totaling = 0;
        int totalretir = 0;
        boolean continuar = true;
        Scanner teclado = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.println("╔═════════════════════════════════════════════════════════════╗");
        System.out.println("║  BIENVENIDO AL CAJERO AUTOMATICO, EN BREVES SERAS ATENDIDO  ║");
        System.out.println("╚═════════════════════════════════════════════════════════════╝");
        Thread.sleep(3000);
        do {
            System.out.print("\033[H\033[2J");
            System.out.println("╔═════════════════════════╗");
            System.out.println("║    CAJERO AUTOMÁTICO    ║");
            System.out.println("╠═════════════════════════╣");
            System.out.println("║  1.  CONSULTAR SALDO    ║");
            System.out.println("║  2.  DEPOSITAR DINERO   ║");
            System.out.println("║  3.  RETIRAR DINERO     ║");
            System.out.println("║  4.      SALIR          ║");
            System.out.println("╚═════════════════════════╝");
            System.out.print("\nElija una opción: ");
            int opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("\033[H\033[2J");
                    System.out.println("╔══════════════════════════╗");
                    System.out.println("║    CONSULTANDO SALDO     ║");
                    System.out.println("╚══════════════════════════╝");
                    Thread.sleep(2500);
                    System.out.print("\033[H\033[2J");
                    System.out.println("╔════════════════════════╗");
                    System.out.println("║    CONSULTAR SALDO     ║");
                    System.out.println("╚════════════════════════╝");
                    Thread.sleep(500);
                    System.out.println("Su saldo actual es de " + saldo + " Euros.");
                    Thread.sleep(3000);
                    break;
                case 2:
                    System.out.print("\033[H\033[2J");
                    System.out.println("╔═══════════════════════════════╗");
                    System.out.println("║    ACCEDIENDO A TU CUENTA     ║");
                    System.out.println("╚═══════════════════════════════╝");
                    Thread.sleep(2500);
                    System.out.print("\033[H\033[2J");
                    System.out.println("╔═════════════════════════╗");
                    System.out.println("║    DEPOSITAR DINERO     ║");
                    System.out.println("╚═════════════════════════╝");
                    Thread.sleep(500);
                    System.out.print("¿Cuánto dinero desea depositar?: ");
                    int ingresar = teclado.nextInt();
                    if (ingresar <= 0) {
                        System.out.print("\033[H\033[2J");
                        System.out.println("╔═════════════════════════════════════════════════════════════════╗");
                        System.out.println("║          !!ERROR!! NO PUEDES DEPOSITAR ESTA CANTIDAD            ║");
                        System.out.println("║     ESTE INGRESO NO SE SUMARA A LA CANTIDAD DE INGRESOS TOTAL   ║");
                        System.out.println("╚═════════════════════════════════════════════════════════════════╝");
                        Thread.sleep(2000);
                    } else {
                        System.out.print("\033[H\033[2J");
                        System.out.println("╔═════════════════════════════╗");
                        System.out.println("║    INGRESANDO EL DINERO     ║");
                        System.out.println("╚═════════════════════════════╝");
                        ingresos++;
                        saldo += ingresar;
                        totaling += ingresar;
                        Thread.sleep(2500);
                    }
                    break;
                case 3:
                    System.out.print("\033[H\033[2J");
                    System.out.println("╔═══════════════════════════════╗");
                    System.out.println("║    ACCEDIENDO A TU CUENTA     ║");
                    System.out.println("╚═══════════════════════════════╝");
                    Thread.sleep(2500);
                    System.out.print("\033[H\033[2J");
                    System.out.println("╔═════════════════════════╗");
                    System.out.println("║     RETIRAR DINERO      ║");
                    System.out.println("╚═════════════════════════╝");
                    Thread.sleep(500);
                    System.out.print("¿Cuánto dinero desea retirar?: ");
                    int retirar = teclado.nextInt();
                    if (retirar > saldo) {
                        System.out.print("\033[H\033[2J");
                        System.out.println("╔════════════════════════════════════════════════════════════════════╗");
                        System.out.println("║ !!ERROR!! NO PUEDES RETIRAR UNA CANTIDAD INFERIOR A TU SALDO TOTAL ║");
                        System.out.println("║     ESTA RETIRADA NO SE SUMARA A LA CANTIDAD DE RETIRADAS TOTAL    ║");
                        System.out.println("╚════════════════════════════════════════════════════════════════════╝");
                        Thread.sleep(2000);
                    } else {
                        System.out.print("\033[H\033[2J");
                        System.out.println("╔═════════════════════════════╗");
                        System.out.println("║     RETIRANDO EL DINERO     ║");
                        System.out.println("╚═════════════════════════════╝");
                        retiradas++;
                        saldo -= retirar;
                        totalretir += retirar;
                        Thread.sleep(2500);
                    }
                    break;
                case 4:
                    System.out.print("\033[H\033[2J");
                    continuar = false;
                    System.out.println("╔══════════════════╗");
                    System.out.println("║     SALIENDO     ║");
                    System.out.println("╚══════════════════╝");
                    Thread.sleep(2500);
                    break;
                default:
                    System.out.print("\033[H\033[2J");
                    System.out.println("╔═════════════════════════════════════════════════╗");
                    System.out.println("║    POR FAVOR INTRODUZCA UNA OPCIÓN CORRECTA     ║");
                    System.out.println("╚═════════════════════════════════════════════════╝");
                    Thread.sleep(1500);
                    break;
            }
        } while (continuar);
        teclado.close();
        System.out.print("\033[H\033[2J");
        System.out.println("╔══════════════════════════════════════════════════════════════╗");
        System.out.println("║     GRACIAS POR USAR EL CAJERO AUTOMATICO, ¡HASTA LUEGO!     ║");
        System.out.println("║ A CONTINUACIÓN SE MOSTRARAN TODOS LOS MOVIMIENTOS REALIZADOS ║");
        System.out.println("╚══════════════════════════════════════════════════════════════╝");
        Thread.sleep(1000);
        System.out.println("╔══════════════════════════════════════════════════════════════╗");
        System.out.println("        Número total de ingresos:      " + ingresos);
        System.out.println("║                                                              ║");
        System.out.println("        Importe total Ingresado:       " + totaling);
        System.out.println("║                                                              ║");
        System.out.println("        Número total de retiradas:     " + retiradas);
        System.out.println("║                                                              ║");
        System.out.println("        Importe total retirado:        " + totalretir);
        System.out.println("║                                                              ║");
        System.out.println("        Saldo final en cuenta:         " + saldo);
        System.out.println("╚══════════════════════════════════════════════════════════════╝");
    }

    public static void main(String[] args) throws Exception {
        cajero();
    }
}
