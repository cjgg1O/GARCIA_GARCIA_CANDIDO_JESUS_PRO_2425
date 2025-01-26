import java.util.Scanner;
public class App {
//Ejercicio 1: Haz un programa que te recoja tu nombre por teclado y te lo muestre por pantalla.

    public static void nombres() {
        String nombre;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Escribe aqui tu nombre: ");
        nombre = keyboard.nextLine();
        System.out.println("Hola " + nombre);
        keyboard.close();
    }
//Ejeercicio 2: Haz un programa que te recoja dos numeros por teclado y haga una suma de los 2, despues se debera mostrar el resultado de la suma por pantalla.

    public static void cuentas() {
        double num1, num2;
        Scanner numero1 = new Scanner(System.in);
        System.out.println("Escribe aquí el primer número a ser sumado: ");
        num1 = numero1.nextDouble();
        Scanner numero2 = new Scanner(System.in);
        System.out.println("Escribe aquí el segundo número. ");
        num2 = numero2.nextDouble();
        System.out.println("El resultado de la suma de " + num1 + " y " + num2 +" es: " + (num1 + num2));
        numero1.close();
        numero2.close();
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Selecciona una de las opciones que se muestran:");
        System.out.println("Opcion 1: Ejecutara nombres");
        System.out.println("Opcion 2: Ejecutara cuentas");
        System.out.print("Elije entre 1 y 2: ");

        int opcion;
        Scanner seleccion = new Scanner(System.in);
        opcion = seleccion.nextInt();

        switch (opcion) {
            case 1: // Si opcion es igual a 1 se ejecuta nombres
                nombres(); // Llama al metodo nombres
                break; // termina la ejecucion del bloque
            case 2:
                cuentas();
                break;
            default: // Si opcion no es ni 1 ni 2
                System.out.println("Opción no válida. Por favor, elija entre 1 o 2: ");
                break;
        }
        seleccion.close();
    }
}
