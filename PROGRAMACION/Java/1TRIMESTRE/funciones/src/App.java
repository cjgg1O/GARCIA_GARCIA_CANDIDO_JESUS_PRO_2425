import java.util.Random;
import java.util.Scanner;

public class App {

    /*
     * Ejercicio 1: Realiza una función llamada suma que sume dos números enteros
     * y te devuelva el resultado, posteriormente llámala desde el main y
     * muestra su resultado
     */

    public int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    /*
     * Ejercicio 2: Realiza un método llamado holaMundo que al ser llamada
     * muestre por consola el mensaje “Hola Mundo!”.
     */

    public void holaMundo() {
        System.out.println("Hola Mundo!");
    }

    /*
     * Ejercicio 3: Realiza un método llamado eco con un parámetro de entrada n,
     * que al ser llamada muestre por consola el mensaje “ECO” un
     * número n de veces.
     */

    public void eco(int n) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuandos eco quieres?");
        for (int i = 0; i < n; i++) {
            System.out.print(" eco ");
        }
        teclado.close();
    }

    /*
     * Ejercicio 4: Escribe un método llamado mostrarIntermedios que tenga dos
     * parámetros de entrada a y b (números enteros) y muestre todos
     * los números pares entre ambos números (a y b inclusive).
     */

    public void mostrarIntermedios(int a, int b) {
        if (a < b) {
            for (int i = a; i >= a && i <= b; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = b; i >= b && i <= a; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }

    /*
     * Ejercicio 5: Realiza una función areaCirculo que reciba un parámetro r y te
     * devuelva el área de un círculo de radio r
     */

    Double areaCirculo(int r) {
        return Math.PI * Math.pow(r, 2);
    }

    /*
     * Ejercicio 6: Realiza una función que reciba dos números enteros y devuelva el
     * mayor de los dos, si son iguales devuelve cualquiera de los dos.
     */

    public int mayor(int a, int b) {
        Random random = new Random();
        int sacaruno = random.nextInt(2);
        if (a == b && sacaruno == 0) {
            return a;
        } else if (a == b && sacaruno == 1) {
            return b;
        } else {
            if (a > b) {
                return a;
            } else {
                return b;
            }
        }
    }

    /*
     * Ejercicio 7: Realiza un método llamado mostrar que te muestre un array
     * bidimensional por consola.
     */

    public void mostrar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }

    /*
     * Ejercicio 8: Realiza una función llamada busqueda que dado un array de
     * enteros y un elemento a buscar te devuelva el valor de la posición
     * donde se encuentra el elemento a buscar en el array (una
     * cualquiera de sus apariciones).
     */

    public int busqueda(int[] array, int numero) {
        for (int i = 0; i < array.length; i++) {
            if (posicion ) {

            }
        }
        int valor = array[numero];
        return valor;
    }

    /*
     * Ejercicio 9:
     */

    public static void main(String[] args) {
        App app = new App();
        // System.out.println(app.suma(5, 5));
        // app.holaMundo();
        // app.eco(5);
        // app.mostrarIntermedios(3, 11);
        // System.out.println(app.areaCirculo(5));
        // System.out.println(app.mayor(7, 7));

        /*
         * int[][] matriz = new int[8][5];
         * app.mostrar(matriz);
         */

        int[] array = new int[5];
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(51);
        }
        int posicion = teclado.nextInt();
        {

        }
        System.out.println("Introduce la posicion en la que quieres ver lo que hay");
        int numero = teclado.nextInt();
        System.out.println(app.busqueda(array, numero));

    }

}
