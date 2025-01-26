import java.util.Random;
import java.util.Scanner;

public class App {

    // Ejercicio 1: Diseña un programa que pide al usuario que ingrese la cantidad
    // de números que va a introducir. Deberá leer la cantidad de números indicada y
    // cuenta cuántos son positivos, negativos y ceros, cuantos pares y cuantos
    // impares, mostrando esa información al finalizar la ejecución.

    public static void ejercicio1() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Cuantos números queires introducir?: ");
        int cantnum = teclado.nextInt();
        int neg = 0;
        int pos = 0;
        int ceros = 0;
        int pares = 0;
        int impares = 0;
        for (int i = 1; i <= cantnum; i++) {
            System.out.print("Introduce el numero " + i + ": ");
            int num = teclado.nextInt();
            if (num == 0) {
                ceros++;
            } else if (num < 0) {
                neg++;
            } else if (num > 0) {
                pos++;
            }
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        teclado.close();
        System.out.println("Números positivos: " + pos + "\nNúmeros negativos: " + neg + "\nNúmero de ceros: "
                + ceros + "\nNúmeros pares: " + pares + "\nNúmeros impares: " + impares);
    }

    // Ejercicio 2: Crea un programa que solicite un número y muestra su tabla de
    // multiplicar del 1 al 10.

    public static void ejercicio2() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();
        int resultado;
        for (int i = 1; i <= 10; i++) {
            resultado = numero * i;
            System.out.println(numero + " * " + i + " = " + resultado);
        }
        teclado.close();
    }

    // Ejercicio 3: Diseña un programa que permita al usuario convertir temperaturas
    // de Celsius a Fahrenheit y viceversa. Ofrece un menú para elegir la
    // conversión. (Para pasar de Celsius a Fahrenheit: (°C * 1,8) + 32 y de
    // Fahrenheit a Celsius: (ºF-32)/1.8)

    public static void ejercicio3() {
        Scanner teclado = new Scanner(System.in);
        boolean seguir = true;
        int temp;
        do {
            System.out.println("╔═════════════════════════════╗");
            System.out.println("║  CONVERSOR DE TEMPERATURAS  ║");
            System.out.println("╠═════════════════════════════╣");
            System.out.println("║ 1. DE CELSIUS A FAHRENHEIT  ║");
            System.out.println("║                             ║");
            System.out.println("║ 2. DE FAHRENHEIT A CELSIUS  ║");
            System.out.println("║                             ║");
            System.out.println("║ 3.         SALIR            ║");
            System.out.println("╚═════════════════════════════╝");
            int casos = teclado.nextInt();
            switch (casos) {
                case 1:
                    System.out.print("\033[H\033[2J");
                    System.out.println("╔════════════════════════════════════════════════╗");
                    System.out.println("║  Escribe la temperatura en grados Celsius: Cº  ║");
                    System.out.println("╚════════════════════════════════════════════════╝");
                    temp = teclado.nextInt();
                    double fahre = ((temp * 1.8) + 32);
                    System.out.println(temp + " grados Celsius equivalen a " + fahre + " grados Fahrenheit.");
                    break;
                case 2:
                    System.out.print("\033[H\033[2J");
                    System.out.print("\033[H\033[2J");
                    System.out.println("╔═══════════════════════════════════════════════════╗");
                    System.out.println("║  Escribe la temperatura en grados FAHRENHEIT: Fº  ║");
                    System.out.println("╚═══════════════════════════════════════════════════╝");
                    temp = teclado.nextInt();
                    double celsi = ((temp - 32) / 1.8);
                    System.out.println(temp + " grados Fahrenheit equivalen a " + celsi + " grados Fahrenheit.");
                    break;
                case 3:
                    seguir = false;
                    System.out.print("\033[H\033[2J");
                    System.out.println("╔═════════════════════════════╗");
                    System.out.println("║          SALIENDO...        ║");
                    System.out.println("╠═════════════════════════════╣");
                    break;
                default:
                    System.out.print("\033[H\033[2J");
                    System.out
                            .println("Has introducido un valor incorrecto. Solo puedes utilizar los valores 1, 2 y 3.");
                    break;
            }
        } while (seguir);
        System.out.println("║             FIN             ║");
        System.out.println("╚═════════════════════════════╝");
        teclado.close();
    }

    // Ejercicio 4: Implementa un programa que pida un número entero al usuario y
    // determine si es un número perfecto. Un número es perfecto si es igual a la
    // suma de sus divisores propios. (Los divisores propios de un número son
    // aquellos números por los que es divisible un número sin contar el número).

    public static void ejercicio4() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();
        int suma = 0;
        if (numero == 1) {
            System.out.println("El número es perfecto");
        } else {
            for (int i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    suma += i;
                }
            }
            if (suma == numero) {
                System.out.println("El número es perfecto");
            } else {
                System.out.println("El número no es perfercto");
            }
        }
        teclado.close();
    }

    // Ejercicio 5: Crea un programa que pida al usuario un número entero positivo y
    // calcule la suma de todos los números primos hasta ese número.

    public static void ejercicio5() {
        Scanner teclado = new Scanner(System.in);
        System.err.print("Introduce un número: ");
        int numero = teclado.nextInt();
        int suma = 0;
        if (numero <= 0) { // Números positivos a partir de uno.
            System.out.println("ERROR, El número debe ser mayor a cero.");
        } else {
            for (int i = 2; i < numero; i++) {
                boolean primo = false;
                if (i == 2 || i == 3) {
                    primo = true;
                } else if (i % 2 == 0) {
                    primo = false;
                } else {
                    primo = true;
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            primo = false;
                            break;
                        }
                    }
                }
                if (primo) {
                    suma += i;
                }
            }
        }
        teclado.close();
        System.out.println("La suma de todos los primos de " + numero + " es " + suma);
    }

    // Ejercicio 6: Diseña un programa que simule una casa de apuestas. Se comenzará
    // con un saldo de 100€. Pedirá al usuario que cantidad quiere apostar, la cual
    // deberá estar entre 1 y el saldo disponible. Se deberá generar un booleano
    // aleatorio (random.nextBoolean()), en caso de que salga true, el usuario gana
    // el importe apostado. Se jugará a este juego mientras quiera el usuario y/o
    // quede saldo.

    public static void ejercicio6() throws InterruptedException {
        float saldo = 100;
        Scanner teclado = new Scanner(System.in);
        boolean seguir = true;
        do {
            System.out.print("\033[H\033[2J");
            System.out.println("╔══════════════════════════╗");
            System.out.println("║           bwin           ║");
            System.out.println("╚══════════════════════════╝");
            System.out.println("ACRUALMENTE TIENES " + saldo + " EUROS EN TU MONEDERO.");
            System.out.println("╔══════════════════════════╗");
            System.out.println("║   MOVIMIENTOS POSIBLES   ║");
            System.out.println("╠══════════════════════════╣");
            System.out.println("║ 1.  INGRESAR MAS DINERO  ║");
            System.out.println("║                          ║");
            System.out.println("║ 2.    APOSTAR DINERO     ║");
            System.out.println("║                          ║");
            System.out.println("║ 3.    RETIRAR DINERO     ║");
            System.out.println("║                          ║");
            System.out.println("║ 4.       salir           ║");
            System.out.println("╚══════════════════════════╝");
            int casos = teclado.nextInt();
            switch (casos) {
                case 1:
                    System.out.print("\033[H\033[2J");
                    System.out.println("╔══════════════════════════╗");
                    System.out.println("║           bwin           ║");
                    System.out.println("╚══════════════════════════╝");
                    System.out.println("¿Cuanto dinero quieres ingresar? Puedes ingresar desde 1 hasta 500 Euros: ");
                    int ingreso = teclado.nextInt();
                    if (ingreso < 1 || ingreso > 500) {
                        System.out.println("No puedes ingresar valores inferiores a 1 Euro o superiores a 500 Euros.");
                        Thread.sleep(5000);
                    } else {
                        System.out.println("Ingresando el dinero");
                        Thread.sleep(2500);
                        saldo += ingreso;
                    }
                    break;
                case 2:
                    System.out.println("¿Cuánto apuestas?");
                    int apuesta = teclado.nextInt();
                    Boolean resultado;
                    Random resultadobulean = new Random();
                    resultado = resultadobulean.nextBoolean();
                    if (resultado) {
                        System.out.println(
                                "Has ganado la apuesta tus " + apuesta + " Euros seran ingresados a tu monedero");
                        System.out.println("ingresando cantidad mostrada...");
                        Thread.sleep(2500);
                        saldo += apuesta;
                    } else {
                        System.out.println("Lo sentimos pero has perdido la apusta.");
                        System.out.println("Retirando cantidad apostada...");
                        Thread.sleep(2500);
                        saldo -= apuesta;
                    }
                    break;
                case 3:
                    System.out.print("\033[H\033[2J");
                    System.out.println("╔══════════════════════════╗");
                    System.out.println("║           bwin           ║");
                    System.out.println("╚══════════════════════════╝");
                    System.out.println(
                            "¿Cuanto dinero quieres retirar? Puedes retirar desde 1 hasta 500 Euros:\nActualmente tienes "
                                    + saldo + " Euros en tu monedero.");
                    int retirada = teclado.nextInt();
                    if (retirada < 1 || retirada > 500) {
                        System.out.println("No puedes retirar valores inferiores a 1 Euro o superiores a 500 Euros.");
                        Thread.sleep(5000);
                    } else {
                        System.out.println("Retirando el dinero");
                        Thread.sleep(2500);
                        saldo -= retirada;
                    }
                    break;
                case 4:
                    System.out.println("╔══════════════════════════╗");
                    System.out.println("║        saliendo...       ║");
                    System.out.println("╚══════════════════════════╝");
                    Thread.sleep(3000);
                    seguir = false;
                    break;
                default:
                    System.out.println("Has introducido un valor incorrecto.");
                    Thread.sleep(2000);
                    break;
            }
            if (saldo < 1) {
                System.out.println("Sin saldo , se procedera a salir de la aplicacion automaticamente.");
                Thread.sleep(3000);
            }
        } while (seguir && saldo > 0);
        teclado.close();
        System.out.print("\033[H\033[2J");
        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║   SE HA CERRADO LA APLICACIÓN    ║");
        System.out.println("╚══════════════════════════════════╝");
    }

    // Ejercicio 7: Crea un programa que simule una quiniela, para ello se deberá
    // leer el resultado de 15 partidos. El usuario deberá introducir 1, X o 2.
    // Almacenaremos los valores en variables para luego poder usarlas. Debemos
    // controlar que solo pueda introducir 1, X o 2 Una vez pedidos todos los
    // resultados iremos generando aleatoriamente el resultado de los partidos, si
    // gana el equipo de casa (1), empatan(X) o gana el equipo visitante. Debemos
    // mostrar para finaliza el resultado del partido y el que puso el usuario, y
    // finalmente el número de aciertos. Los aciertos en la quiniela se cuentan del
    // 1 al 14 + el pleno al 15.

    public static void ejercicio7() {
        Scanner teclado = new Scanner(System.in);
        boolean acertado = false;
        int aciertos = 0;
        String prediccion = "";
        boolean pleno = false;
        for (int i = 1; i <= 15; i++) {
            System.out.print("Partido " + i + ": ");
            prediccion = teclado.nextLine();
            if ((prediccion.equalsIgnoreCase("1"))
                    || (prediccion.equalsIgnoreCase("X") || (prediccion.equalsIgnoreCase("2")))) {
                Random random = new Random();
                int resultadorandom = random.nextInt(3);
                String resultado = "";
                if (resultadorandom == 0) {
                    resultado = "1";
                } else if (resultadorandom == 1) {
                    resultado = "X";
                } else if (resultadorandom == 2) {
                    resultado = "2";
                }
                if (i == 15) {
                    if (resultado.equalsIgnoreCase(prediccion)) {
                        System.out.println("Pleno al " + i + ": Resultado  = " + resultado + ", Tu apuesta = "
                                + prediccion + ". Has acertado!!!");
                        pleno = true;
                    } else {
                        System.out.println("Pleno al " + i + " Resultado  = " + resultado + ", Tu apuesta = "
                                + prediccion + ". No acertado");
                        pleno = false;
                        acertado = false;
                    }
                } else {
                    if (resultado.equalsIgnoreCase(prediccion)) {
                        System.out.println("Partido " + i + " Resultado = " + resultado + ", Tu apuesta = " + prediccion
                                + ". Has acertado!!!");
                        acertado = true;
                    } else {
                        System.out.println("Partido " + i + " Resultado = " + resultado + ", Tu apuesta = " + prediccion
                                + ". No acertado");
                        acertado = false;
                    }
                }
            } else {
                i--;
                System.out.println("Resultado no válido, introduce otro: " + prediccion);
            }
            if (acertado && !pleno) {
                aciertos++;
            }
        }
        teclado.close();
        System.out.println("Numero total de aciertos: " + aciertos);
        if (pleno) {
            System.out.println("Has acertado el pleno de 15");
        } else {
            System.out.println("NO has acertado el pleno de 15");
        }
    }

    // Ejercicio 8: Crea un programa que lea una frase por teclado y la convierta al
    // formato camelCase. Por ejemplo, si introducimos por teclado “hola como
    // estás”, el programa deberá mostrar “HolaComoEstás”. Pistas:
    // o Recuerda que podemos ir cogiendo carácter a carácter de una cadena usando
    // la función cadena.charAt(i), donde cadena es nuestra variable cadena y la i
    // la posición del carácter.
    // o Podemos pasar a minúscula un carácter con la función:
    // Character.toLowerCase(c), donde c es el carácter a convertir.
    // o Podemos pasar a mayúsculas un carácter con la función:
    // Character.toUpperCase(c), donde c es el carácter a convertir.

    public static void ejercicio8() {
        
    }

    public static void main(String[] args) throws Exception {
        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5();
        // ejercicio6();
        // ejercicio7();
        ejercicio8();
    }
}