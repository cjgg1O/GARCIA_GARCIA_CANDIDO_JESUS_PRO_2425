import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    /*
     * Ejercicio 1: Realiza un programa que pida al usuario un número natural n,
     * a partir de ese número le pediremos n veces que nos introduzca otros números
     * que almacenaremos en un array a y mostraremos por pantalla.
     */

    public static void ejercicio1() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Cuántos número quieres meter en el Array?: ");
        int numnumeros = teclado.nextInt();
        int cantidadnum = 1;
        int a[] = new int[numnumeros];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Introduce el número " + cantidadnum + ": ");
            a[i] = teclado.nextInt();
            cantidadnum++;
        }
        teclado.close();
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        cantidadnum = 1;
    }

    /*
     * Ejercicio 2: Realiza un programa que teniendo un array lleno con valores a
     * de tamaño 5 (no es necesario que los valores los introduzca el usuario)
     * realice una copia del mismo en otra variable array b y lo muestre por
     * pantalla.
     */

    public static void ejercicio2() {
        int a[] = { 1, 2, 3, 4, 5 };
        int b[];
        b = Arrays.copyOf(a, a.length);
        a[2] = 8;
        System.out.println(Arrays.toString(b));
    }

    /*
     * Ejercicio 3: Realiza un programa que pida numeros enteros positivos al
     * usuario
     * y los vaya almacenando en un array a, cuando el usuario introduzca -1 se
     * dejará de pedir números y se mostrara el array a de los números que ha
     * introducido (exceptuando el -1).
     */

    public static void ejercicio3() {
        Scanner teclado = new Scanner(System.in);
        int a[] = new int[10];
        int valor = 0;
        boolean seguir = true;
        for (int i = 0; i < a.length && seguir; i++) {
            valor++;
            System.out.print("Introduce el valor " + valor + ": ");
            int numarray = teclado.nextInt();
            if (numarray == -1) {
                seguir = false;
            } else {
                if (numarray > 0) {
                    a[i] = numarray;
                } else {
                    i--;
                    valor--;
                }
            }
        }
        teclado.close();
        System.out.println(Arrays.toString(a));
    }

    /*
     * Ejercicio 4: Realiza un programa que pida al usuario un array a de 10
     * elementos y muestre por pantalla un array b que contenga los elementos al
     * reves, finalmente muestra por pantalla el array b.
     */

    public static void ejercicio4() {
        Scanner teclado = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            a[i] = teclado.nextInt();
            b[a.length - 1 - i] = a[i];
        }
        teclado.close();
        System.out.println(Arrays.toString(b));
    }

    /*
     * Ejercicio 5: Realiza un programa que pida al usuario un conjunto de números
     * para un array a de 8 elementos y muestre por pantalla un array b que solo
     * contenga los elementos impares.
     */

    public static void ejercicio5() {
        Scanner teclado = new Scanner(System.in);
        int a[] = new int[8];
        int impares = 0;
        int posicion = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.print("Introduce el valor " + (i + 1) + ": ");
            a[i] = teclado.nextInt();
            if (a[i] % 2 != 0) {
                impares++;
            }
        }
        int b[] = new int[impares];
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                b[posicion] = a[i];
                posicion++;
            }
        }
        System.out.println(Arrays.toString(b));
        teclado.close();
    }

    /*
     * Ejercicio 6: Realiza un programa que pida al usuario 9 números naturales
     * y los almacene en un array a, tras ello, introducir todos los
     * números que sean pares en un array b y los que sean
     * impares en un array c, tanto el array b como el array c se
     * tendrán que mostrar por pantalla.
     */

    public static void ejercicio6() {
        Scanner teclado = new Scanner(System.in);
        int a[] = new int[9];
        int b[] = new int[0];
        int c[] = new int[0];
        int posicion = 0;
        int numero = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.print("Introduce el valor de la posición " + i + " del Array: ");
            numero = teclado.nextInt();
            a[i] = numero;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                b = Arrays.copyOf(b, b.length + 1);
                b[posicion] = a[i];
                posicion++;
            }
        }
        posicion = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                c = Arrays.copyOf(c, c.length + 1);
                c[posicion] = a[i];
                posicion++;
            }
        }
        teclado.close();
        System.out.println("Array a " + Arrays.toString(a));
        System.out.println("Array pares " + Arrays.toString(b));
        System.out.println("Array impares " + Arrays.toString(c));
    }

    /*
     * Ejercicio 7: Escribe un programa que pida 10 números por teclado, los
     * almacene en un array y que luego muestre el máximo valor, el
     * mínimo y las posiciones que ocupan en el array.
     */

    public static void ejercicio7() {
        Scanner teclado = new Scanner(System.in);
        int a[] = new int[10];
        int numero = 0, maximo = 0, minimo = 0, posMin = 0, posMax = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.print("Introduce la el numero que se almacena en la posición " + i + ": ");
            numero = teclado.nextInt();
            a[i] = numero;
            if (i == 0) {
                maximo = numero;
                minimo = numero;
            } else {
                if (numero > maximo) {
                    maximo = numero;
                    posMax = i;
                }
                if (numero < minimo) {
                    minimo = numero;
                    posMin = i;
                }
            }
        }
        teclado.close();
        System.out.println(Arrays.toString(a));
        System.out.println("El número mínimo del Array es " + minimo + " y esta en la posicion numero " + posMin + ".");
        System.out.println("El número máximo del Array es " + maximo + " y esta en la posicion numero " + posMax + ".");
    }

    /*
     * Ejercicio 8: Escribe un programa que genere 20 números enteros
     * aleatorios entre 0 y 99 y los almacene en un array. El programa
     * debe crear un nuevo array con los números pares que haya
     * entre esos 20 números. Luego debe mostrar los dos arrays.
     */

    public static void ejercicio8() {
        int a[] = new int[20];
        int b[] = new int[0];
        int numrandom;
        Random numeroaleatorio = new Random();
        for (int i = 0; i < a.length; i++) {
            numrandom = numeroaleatorio.nextInt(100);
            a[i] = numrandom;
            if (a[i] % 2 == 0) {
                b = Arrays.copyOf(b, b.length + 1);
                b[b.length - 1] = a[i];
            }
        }
        System.out.println("Array completo " + Arrays.toString(a));
        System.out.println("Array pares " + Arrays.toString(b));
    }

    /*
     * Ejercicio 9: Realiza un programa que dado un array desordenado lo
     * ordene y lo muestre por consola siguiendo el algoritmo que
     * desees
     */

    public static void ejercicio9() {
        int a[] = { 1, 8, 2, 4, 5, 4, 0 };
        int cambio;
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = a.length - 1; j >= 0; j--) {
                if (a[i] > a[j]) {
                    cambio = a[i];
                    a[i] = a[j];
                    a[j] = cambio;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    /*
     * Ejercicio 10: Haz un programa que genere 20 números enteros del 1 al
     * 50 ambos inclusive y los almacene en un array,
     * posteriormente almacenará en un nuevo array solo los
     * números primos que haya en ese array. Ambos arrays
     * finalmente serán mostrados por consola.
     */

    public static void ejercicio10() {
        int a[] = new int[20];
        int b[] = new int[0];
        Random random = new Random();
        int numero;
        boolean primo = true;
        for (int i = 0; i < a.length; i++) {
            primo = true;
            numero = random.nextInt(51);
            a[i] = numero;
            if (numero == 2) {
                Arrays.copyOf(b, b.length + 1);
                b[b.length - 1] = numero;
            } else {
                for (int j = 2; j < numero && primo; j++) {
                    if (numero % j == 0) {
                        primo = false;
                    }
                }
                if (primo) {
                    b = Arrays.copyOf(b, b.length + 1);
                    b[b.length - 1] = numero;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    /*
     * Ejercicio 11: Realiza un programa que dado un array bidimensional,
     * lo muestre por pantalla con la siguiente estructura 3 x 4
     */

    public static void ejercicio11() {
        int matriz[][] = new int[4][3];
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = random.nextInt((5 - 2) + 1) + 2;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println();
        }
    }

    /*
     * Ejercicio 12: Realiza un programa que dado un array bidimensional lo
     * rellene de números enteros aleatorios del 2 al 12 (ambos
     * inclusive)
     */

    public static void ejercicio12() {
        int matriz[][] = new int[4][4];
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt((12 - 2) + 1) + 2;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }

    /*
     * Ejercicio 13: Realiza un programa que inserte en un array bidimensional
     * de 3x3 de números enteros, compuesto solamente por 0, tres
     * valores 1 en una posición aleatoria, no pueden solaparse, es decir, ocupar la
     * misma casilla alguno de los tres valores,
     * después muestra por pantalla el contenido del array.
     */

    public static void ejercicio13() {
        int matriz[][] = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
        Random filas = new Random();
        Random columnas = new Random();
        for (int i = 0; i < 3; i++) {
            int fila = filas.nextInt(3);
            int columna = columnas.nextInt(3);
            if (matriz[fila][columna] != 1) {
                matriz[fila][columna] = 1;
            } else {
                i--;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }

    /*
     * Ejercicio 14: Realiza un programa que pida al usuario el tamaño en las
     * dos dimensiones (X e Y) de un array bidimensional, construya
     * un array bidimensional (con esas dimensiones) con todas las
     * posiciones con el valor 0 y lo muestre por pantalla.
     * Posteriormente se va introducir en el array el valor 1 en todas
     * las posiciones exceptuando las que estén en los bordes
     * exteriores del array.
     */

    public static void ejercicio14() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántas filas quieres que tenga la matriz?");
        int filas = teclado.nextInt();
        System.out.println("¿Cuántas columnas quieres que tenga la matriz?");
        int columnas = teclado.nextInt();
        int matriz[][] = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = 0;
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i < filas - 1; i++) {
            for (int j = 1; j < columnas - 1; j++) {
                matriz[i][j] = 1;
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println();
        }
        teclado.close();
    }

    /*
     * Ejercicio 15: Realiza un programa que inserte en un array bidimensional
     * de 5x5 de números enteros, compuesto solamente por 0, tres
     * valores 1 de manera aleatoria, no pueden solaparse, es decir,
     * ocupar la misma casilla alguno de los tres valores, ni pueden
     * estar en casillas contiguas vertical u horizontalmente
     * (diagonalmente sí) después muestra por pantalla el contenido
     * del array.
     */

    public static void ejercicio15() {
        System.out.print("\033[H\033[2J");
        int matriz[][] = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 } };
        Random filas = new Random();
        Random columnas = new Random();
        for (int i = 0; i < 3; i++) {
            int fila = filas.nextInt(5);
            int columna = columnas.nextInt(5);
            // Para la esquina superior izquierda
            if (matriz[fila][columna] == 1) {
                i--;
            } else {
                if (fila == 0 && columna == 0) {
                    if ((matriz[fila + 1][columna] == 1) || (matriz[fila][columna + 1] == 1)) {
                        matriz[fila][columna] = 0;
                        i--;
                    } else {
                        matriz[fila][columna] = 1;
                    }
                }
                // Para la fila de arriba en las columnas del medio
                if (fila == 0 && columna > 0 && columna < 4) {
                    if ((matriz[fila][columna + 1] == 1) || (matriz[fila][columna - 1] == 1)
                            || (matriz[fila + 1][columna] == 1)) {
                        matriz[fila][columna] = 0;
                        i--;
                    } else {
                        matriz[fila][columna] = 1;
                    }
                }
                // Para la esquina superior derecha
                if (fila == 0 && columna == 4) {
                    if ((matriz[fila][columna - 1] == 1) || (matriz[fila + 1][columna] == 1)) {
                        matriz[fila][columna] = 0;
                        i--;
                    } else {
                        matriz[fila][columna] = 1;
                    }
                }
                // Para la columna de la izquierda que no sean las esquinas.
                if ((fila > 0 && fila < 4) && (columna == 0)) {
                    if ((matriz[fila + 1][columna] == 1) || (matriz[fila - 1][columna] == 1)) {
                        matriz[fila][columna + 1] = 0;
                        i--;
                    } else {
                        matriz[fila][columna] = 1;
                    }
                }
                // Para la columna de la derecha que no sean las esquinas.
                if ((fila > 0 && fila < 4) && (columna == 4)) {
                    if ((matriz[fila + 1][columna] == 1) || (matriz[fila - 1][columna] == 1)) {
                        matriz[fila][columna - 1] = 0;
                        i--;
                    } else {
                        matriz[fila][columna] = 1;
                    }
                }
                // Para la esquina inferior izquierda
                if (fila == 4 && columna == 0) {
                    if ((matriz[fila - 1][columna] == 1) || (matriz[fila][columna + 1] == 1)) {
                        matriz[fila][columna] = 0;
                        i--;
                    } else {
                        matriz[fila][columna] = 1;
                    }
                }
                // Para la fila de abajo en las columnas del medio
                if (fila == 4 && columna > 0 && columna < 4) {
                    if ((matriz[fila][columna + 1] == 1) || (matriz[fila][columna - 1] == 1)
                            || (matriz[fila - 1][columna] == 1)) {
                        matriz[fila][columna] = 0;
                        i--;
                    } else {
                        matriz[fila][columna] = 1;
                    }
                }
                // Para la esquina inferior derecha
                if (fila == 4 && columna == 4) {
                    if ((matriz[fila][columna - 1] == 1) || (matriz[fila - 1][columna] == 1)) {
                        matriz[fila][columna] = 0;
                        i--;
                    } else {
                        matriz[fila][columna] = 1;
                    }
                }
                // Para la zona del centro
                if ((fila > 0 && fila < 4) && (columna > 0 && columna < 4)) {
                    if (matriz[fila + 1][columna] == 1 || matriz[fila - 1][columna] == 1
                            || matriz[fila][columna + 1] == 1
                            || matriz[fila][columna - 1] == 1) {
                        matriz[fila][columna] = 0;
                        i--;
                    } else {
                        matriz[fila][columna] = 1;
                    }
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println();
        }
    }

    /*
     * Ejercicio 16: Realiza un programa en donde dado un array bidimensional
     * de tamaño 5x5 (con las posiciones con el valor 0) el usuario
     * puede introducir los números que él desee uno a uno, hasta
     * que introduzca la letra n. Cada vez que el usuario introduzca
     * un número se le mostrará el contenido del array.
     */

    public static void ejercicio16() {
        System.out.print("\033[H\033[2J");
        Scanner teclado = new Scanner(System.in);
        int matriz[][] = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 } };
        boolean seguir = true;
        while (seguir) {
            seguir = true;
            System.out.println("Introduce la fila en la que quieres que se aplique tu acción (Del 1 al 6)");
            int fila = teclado.nextInt();
            fila--;
            System.out.println("Introduce la columna en la que quieres que se aplique tu acción (Del 1 al 6)");
            int columna = teclado.nextInt();
            columna--;
            System.out.println(
                    "Introduce el valor que le quieras añadir a la posición " + (fila + 1) + " " + (columna + 1));
            int valor = teclado.nextInt();
            matriz[fila][columna] = valor;
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(matriz[i][j] + "  ");
                }
                System.out.println();
            }
            System.out.println("Deseas seguir s -> Si n -> No");
            teclado.nextLine();
            String siguiente = teclado.nextLine();
            if (siguiente.equals("s")) {
                seguir = true;
            } else if (siguiente.equals("n")) {
                seguir = false;
            } else {
                System.out.println("No has introducido un valor correcto");
                seguir = false;
            }
        }
        teclado.close();
    }

    /*
     * Ejercicio 17: Realiza un tablero de ajedrez con cuadros negros: \u25A1,
     * cuadro blancos: \u25A0 y una dama ۩ presenta la dama en
     * una posición cualquiera (al azar) del tablero (array
     * bidimensional) y vas a pedir la nueva coordenada de la dama
     * en el tablero, existen dos posibilidades: que no sea válida (se
     * informará al usuario que no es válida y que no se puede
     * realizar el movimiento) o que sea válida (en este caso se
     * mostrará la nueva disposición de la dama en el tablero), según
     * las reglas del ajedrez. En ambos casos se le pedirá al usuario
     * si desea seguir jugando (s->Sí y n->No) y en caso afirmativo se
     * le volverá a pedir las nuevas coordenadas y el proceso volverá
     * a empezar
     */

    public static void ejercicio17() {
        System.out.print("\033[H\033[2J");
        String tablero[][] = new String[8][8];
        Random randomfila = new Random();
        Random randomcolumna = new Random();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    tablero[i][j] = "\u25A0";
                } else {
                    tablero[i][j] = "\u25A1";
                }
            }
        }
        int filadama = randomfila.nextInt(8);
        int columnadama = randomcolumna.nextInt(8);
        tablero[filadama][columnadama] = "D";

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        ejercicio17();
    }
}
