import java.lang.Thread;
import java.util.Random;
import java.util.Scanner;

public class App {
    // Ejercicio 1: Realizar un programa que imprima en pantalla los números del 1
    // al 100. (Debes hacerlo con las tres estructuras iterativas vistas: while, do
    // while y for).

    public static void ejercicio1() {
        int numero = 0;
        // while
        while (numero < 100) {
            numero = numero + 1;
            System.out.println(numero);
        }
        // do/while
        do {
            numero++;
            System.out.println(numero);
        } while (numero < 100);
        // for
        for (numero = 1; numero <= 100; numero++) {
            System.out.println(numero);
        }
    }

    // Ejercicio 2: Escribir un programa que solicite un valor positivo y nos
    // muestre desde 1 hasta el valor ingresado de uno en uno.
    public static void ejercicio2() {
        int numerousr;
        int numero = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Introduce un numero positivo: ");
        numerousr = keyboard.nextInt();
        while (numerousr <= 0) {
            System.out.println("ERROR");
            System.out.print("Introduce un numero positivo: ");
            numerousr = keyboard.nextInt();
        }
        do {
            numero = numero + 1;
            System.out.println(numero);
        } while (numero < numerousr);
        keyboard.close();
    }

    // Ejercicio 3: Desarrollar un programa que permita la carga de 10 valores por
    // teclado y nos muestre posteriormente la suma de los valores ingresados y su
    // promedio.

    public static void ejercicio3() {
        int valor;
        int intento = 1;
        int suma = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Introduce el valor " + (intento) + ":");
            valor = teclado.nextInt();
            suma += valor;
            intento++;
        } while (intento <= 10);
        System.out.println("La suma de todos estos numeros es " + suma + "\nLa media es " + (suma / 10.0));
        teclado.close();
    }

    // Ejercicio 4: Diseña una aplicación o programa que consista en lo siguiente:
    // o Guarda en una variable tu nombre.
    // o Pide al usuario que intente adivinar tu nombre pidiendo que lo introduzca
    // por teclado.
    // o El programa finaliza cuando el usuario adivina tu nombre. Sino el programa
    // debe continuar pidiendo al usuario que lo intente otra vez.

    public static void ejercicio4() {
        String nombre = "Candi";
        String nombreusr;
        Scanner teclado = new Scanner(System.in);
        System.out.print("A que no adivinas mi nombre: ");
        nombreusr = teclado.nextLine();
        while (!nombreusr.equals(nombre)) {
            System.out.println("Ese no es mi nombre, intentalo otra vez.");
            nombreusr = teclado.nextLine();
        }
        teclado.close();
    }

    // Ejercicio 5: Diseña una aplicación que simule la tirada de dos dados y
    // muestre al usuario el resultado de la tirada. Si los dos dados tienen el
    // mismo número debe mostrar un mensaje indicando que el resultado es el mismo.
    // La aplicación se debe repetir hasta que el usuario indique que no quiere
    // tirar más (preguntando por ‘s’ o ‘n’, o “si” o “no”).

    public static void ejercicio5() {
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);
        String continuar;
        do {
            int dado1 = random.nextInt(6);
            int dado2 = random.nextInt(6);
            if (dado1 == dado2) {
                System.out.println("El primer dado ha sacado el numero " + dado1
                        + ".\nEl segundo dado ha sacado el número " + dado2 + ".\nLos dos dados son iguales");
                System.out.println("¿Quieres seguir tirando el dado?");
                continuar = teclado.nextLine();
            } else {
                System.out.println("El primer dado ha sacado el numero " + dado1
                        + "\nEl segundo dado ha sacado el número " + dado2);
                System.out.println("¿Quieres seguir tirando el dado?");
                continuar = teclado.nextLine();
            }
        } while (continuar.toLowerCase().equals("s") || continuar.toLowerCase().equals("si"));
        System.out.println("Se ha detenido el lanzamiento de los dados");
        teclado.close();
    }

    // Ejercicio 6: Realizar un juego para adivinar un número. Para ello primero, el
    // programa debe guardar un número en una variable y el usuario debe introducir
    // números hasta acertarlos. Para darle pistas al usuario se le indicará “mayor”
    // o “menor” según sea mayor o menor con respecto al número guardado. El proceso
    // termina cuando el usuario acierta.

    public static void ejercicio6() {
        Random random = new Random();
        int numrandom = random.nextInt(100);
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número a ver si aciertas: ");
        int numusr = teclado.nextInt();
        boolean adivina = false;

        while (!adivina) {
            if (numusr < numrandom) {
                System.out.println("El numero que has introducido es menor que el numero esperado.");
                System.out.print("Introduce el numero de nuevo: ");
                numusr = teclado.nextInt();
            } else if (numusr > numrandom) {
                System.out.println("El número que has introducido es mayor que el numero esperado: ");
                System.out.print("Introduce el numero de nuevo: ");
                numusr = teclado.nextInt();
            } else {
                adivina = true;
                System.out.println("El número esperado era " + numrandom + " asi que es correcto.");
            }
        }
        teclado.close();
    }

    // Ejercicio 7: Diseña una aplicación que simule un reloj digital que muestre la
    // hora sin parar. Debe esperar un segundo real para darle más realismo. Pasos:
    // o Pide al usuario que introduzca la hora y los minutos.
    // o Inicializa el reloj a esa hora con esos minutos y 0 segundos.
    // o Cada vez que transcurra un segundo incrementa la hora comprobando si hay
    // cambio de minuto y hora
    // o Muéstralo por pantalla.

    public static void ejercicio7() throws InterruptedException {
        int hora, minuto;
        int segundo = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la hora que es: ");
        hora = teclado.nextInt();
        System.out.print("Introduce tambien los minutos: ");
        minuto = teclado.nextInt();
        teclado.close();
        while (true) {
            Thread.sleep(1000);
            segundo++;
            if (minuto >= 60) {
                System.out.println("!!ERROR!! Los minutos no pueden superar el numero 59");

            }
            if (hora >= 24) {
                System.out.println("!!ERROR!! Las horas no pueden ser superior a 23.");
            } else {
                if (segundo >= 60) {
                    minuto++;
                    segundo = 0;
                    if (minuto >= 60) {
                        hora++;
                        minuto = 0;
                        if (hora >= 24) {
                            hora = 0;
                        }
                    }
                }
                System.out.println(hora + ":" + minuto + ":" + segundo);
            }
        }
    }

    // Ejercicio 8: Escriba un programa que calcule el factorial de un número. El
    // factorial de un número es igual al producto de todos los números enteros
    // positivos desde 1 hasta dicho número.

    public static void ejercicio8() {
        int multipl = 1;
        int numero;
        int resultado = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe un número para calcular su factorial: ");
        numero = teclado.nextInt();
        do {
            resultado = resultado * (multipl + 1);
            multipl++;
        } while (multipl < numero);
        System.out.println("El resultado del factorial de " + numero + " es: " + resultado);
        teclado.close();
    }

    // Ejercicio 9: Escriba un programa que dibuje una escalera de asteriscos. La
    // altura de la escalera se lee por teclado. Posteriormente hacer lo mismo, pero
    // con la pirámide invertida.

    public static void ejercicio9() {
        int altura;
        String dibujo = "";
        int piramide = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Qué altura debe tener la pirámide?: ");
        altura = teclado.nextInt();
        System.out.println("Pirámide mirando hacia arriba:");
        teclado.close();
        while (piramide < altura) {
            dibujo = dibujo + "*";
            System.out.println(dibujo);
            piramide++;
        }
        piramide = 0;
        System.out.println("Piramide mirando hacia abajo:");
        dibujo = dibujo + "*";
        while (!dibujo.isEmpty()) {
            dibujo = dibujo.substring(1);
            System.out.println(dibujo);
            piramide++;
        }
    }

    public static void main(String[] args) throws Exception {
        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5();
        // ejercicio6();
        // ejercicio7();
        // ejercicio8();
        ejercicio9();
    }
}
