import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double num1, num2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce los numeros con los que quieres operar:");
        System.out.print("NÚMERO 1: ");
        num1 = teclado.nextDouble();
        System.out.print("NÚMERO 2: ");
        num2 = teclado.nextDouble();
        System.out.println(
                "Introduce que operación quieres realizar:\nOPCIONES:\nSUMA - S\tRESTA - R\tMULTIPLICACIÓN - M\tDIVISIÓN- D");
        String oper;
        Scanner operacion = new Scanner(System.in);
        oper = operacion.nextLine();

        switch (oper) {
            case "S", "s", "SUMA", "suma", "Suma":
                System.out.println("El resultado de la suma entre " + num1 + " y " + num2 + " es: " + (num1 + num2));
                break;
            case "R", "r", "RESTA", "resta", "Resta":
                System.out.println("El resultado de la resta entre " + num1 + " y " + num2 + " es: " + (num1 - num2));
                break;
            case "M", "m", "MULTIPLICACION", "Multiplicacion", "multiplicacion":
                System.out.println(
                        "El resultado de la multiplicación entre " + num1 + " y " + num2 + " es: " + (num1 * num2));
                break;
            case "D", "d", "DIVISION", "Division", "division":
                if (num2 == 0) {
                    System.out.println("!!ERROR!!\nNo puedes dividir un numero por 0.");
                } else {
                    System.out
                            .println("El resultado de la división entre " + num1 + " y " + num2 + " es: "
                                    + (num1 / num2));
                }
            break;
            default:
                System.out.print("No has introducido correctamente el valor, intenalo de nuevo: ");
                break;
        }
        teclado.close();
        operacion.close();
    }
}
