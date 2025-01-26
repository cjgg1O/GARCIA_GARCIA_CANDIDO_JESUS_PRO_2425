import java.util.Scanner;

public class App {
    // Ejercicio 1: Diseñar un programa que pida un número por teclado y escriba
    // tantas líneas como diga el número y en cada línea escriba desde el número 1
    // hasta el número introducido. Ejemplo: Si se introduce el número 5, el
    // programa deberá mostrar en pantalla:12345

    public static void ejercicio1() {
        int numusr;
        int numero = 0;
        int lineas = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        numusr = teclado.nextInt();
        teclado.close();
        while (lineas < numusr) {
            lineas++;
            while (numero < numusr) {
                numero++;
                System.out.print(numero);
            }
            System.out.println(":");
            numero = 0;
        }
    }

    // Ejercicio 2: Diseñar un programa que haga lo mismo que el anterior, pero en
    // este caso deberáescribir los números en orden decreciente, es decir, si
    // introducimos el número 5 deberá mostrar en pantalla:
    // 54321
    // 54321
    // 54321
    // 54321
    // 54321

    public static void ejercicio2() {
        int numusr;
        int numerousr;
        int numero = 1;
        int lineas = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        numusr = teclado.nextInt();
        numerousr = numusr;
        numusr += 1;
        teclado.close();
        while (lineas < numerousr) {
            lineas++;
            while (numero < numusr) {
                numusr -= 1;
                System.out.print(numusr);
            }
            numusr = numerousr + 1;
            System.out.println(":");
        }
    }

    // Ejercicio 3: Deberéis diseñar un programa similar al anterior, pero en lugar
    // de escribir en lugar de imprimir en todas las líneas todos los números desde
    // el 1 hasta el introducido por teclado, en la primera línea se imprimirá sólo
    // el número 1, en la segunda el 1 y el 2, y así hasta escribir el número de
    // líneas indicadas por el usuario.

    public static void ejercicio3() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        int numerousr = teclado.nextInt();
        teclado.close();
        for (int numero = 1; numero <= numerousr; numero++) {
            for (int filas = 1; filas <= numero; filas++) {
                System.out.print(filas);
            }
            System.out.println();
        }
    }

    // Ejercicio 4: Diseña un programa que escriba todos los números del 100 al 0 de
    // 7 en 7, es decir, mostrará 100, 93, 86…0.
    public static void ejercicio4() {
        int numero = 100;
        int fin = 0;
        do {
            System.out.println(numero);
            numero -= 7;
        } while (numero >= fin);
        if (numero <= 2) {
            numero = 0;
            System.out.println(numero);
        }
    }

    // Ejercicio 5: Desarrollar un programa que te pregunte cuando números quieres
    // leer. Nosotros deberemos leer la cantidad de números indicada y calcula el
    // promedio de los valores indicados

    public static void ejercicio5() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Cuántos números vas a introducir? ");
        int valores = teclado.nextInt();
        double suma = 0;
        for (int valor = 1; valor <= valores; valor++) {
            System.out.println("Introduce el valor " + valor + ":");
            double resultado = teclado.nextDouble();
            suma += resultado;
        }
        System.out.println("La media de los " + valores + " numeros que has introducido es: " + (suma / valores));
        teclado.close();
    }

    // Ejercicio 6: Realiza un programa que lea un número por teclado y nos diga si
    // el número es o no primo. (Los números primos son aquellos que sólo son
    // divisibles por ellos mismos y por la unidad).

    public static void ejercicio6() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        int numero = teclado.nextInt();
        teclado.close();
        boolean primo = true;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = false;
                System.out.println("Primo " + primo);
                break;
            }
        }
        if (primo == true) {
            System.out.println("Primo " + primo);
        }
    }

    // Ejercicio 7: Desarrollar un programa que lea números enteros hasta teclear 0,
    // y nos muestre el máximo, el mínimo y la media de todos ellos. El 0 no se debe
    // contar como número introducido, solo como valor de salida.

    public static void ejercicio7() {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int suma = 0;
        int media = 0;
        int maximo = -2147483648;
        int minimo = 2147483647;
        do {
            System.out.println("Introduce un número: ");
            numero = teclado.nextInt();
            if (numero == 0) {
                break;
            }
            suma += numero;
            media++;
            if (numero > maximo) {
                maximo = numero;
            } else if (numero < minimo) {
                minimo = numero;
            }
        } while (numero != 0);
        teclado.close();
        System.out.println("El númeo maximo es " + maximo + " y el mínimo es " + minimo + ".");
        System.out.println("La media es " + (suma / media));
    }

    // Ejercicio 8: Escribe un programa en Java que implemente una calculadora
    // simple. La calculadora debe permitir a los usuarios realizar operaciones
    // matemáticas básicas, como suma, resta, multiplicación y división. El programa
    // deberá mostrar un menú con las siguientes opciones:
    // 1. Sumar
    // 2. Restar
    // 3. Multiplicar
    // 4. Dividir
    // 5. Es primo (indica si el número introducido es primo o no lo es)
    // 6. Salir

    public static void ejercicio8() {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        int num1, num2;
        do {
            System.out.println("Introduce lo que quieras hacer");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Primo");
            System.out.println("6. Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Introduce el primer factor para la suma: ");
                    num1 = teclado.nextInt();
                    System.out.print("Introduce el segundo factor: ");
                    num2 = teclado.nextInt();
                    System.out.println("El resultado de la suma de " + num1 + " y " + num2 + " es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.print("Introduce el primer factor para la resta: ");
                    num1 = teclado.nextInt();
                    System.out.print("Introduce el segundo factor: ");
                    num2 = teclado.nextInt();
                    System.out.println("El resultado de la resta de " + num1 + " y " + num2 + " es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.print("Introduce el primer factor para la multiplicación: ");
                    num1 = teclado.nextInt();
                    System.out.print("Introduce el segundo factor: ");
                    num2 = teclado.nextInt();
                    System.out.println(
                            "El resultado de la mutiplicación de " + num1 + " y " + num2 + " es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.print("Introduce el primer factor para la división: ");
                    num1 = teclado.nextInt();
                    System.out.print("Introduce el segundo factor: ");
                    num2 = teclado.nextInt();
                    System.out.println(
                            "El resultado de la división de " + num1 + " y " + num2 + " es: " + (num1 / num2));
                    break;
                case 5:
                    boolean primo = true;
                    System.out.println("Introduce el numero para comprobar si es primo ");
                    num1 = teclado.nextInt();
                    for (int i = 2; i < num1; i++) {
                        if (num1 % i == 0) {
                            primo = false;
                            System.out.println("Primo " + primo);
                            break;
                        }
                    }
                    if (primo == true) {
                        System.out.println("Primo " + primo);
                    }
                    break;
                case 6:
                    System.out.println("Saliendo de la calculadora...");
                    break;
                default:
                    System.out.println("No has introducido un valor correcto.");
                    break;
            }
        } while (opcion < 6 && opcion > 0);
        teclado.close();
    }

    // Ejercicio 9: Diseña un programa que calcule la letra de un DNI. Para ello:
    // o 1º Pediremos el DNI por teclado al usuario.
    // o 2º Para calcular la letra, cogeremos el DNI y lo dividiremos entre 23
    // quedándonos con el resto de la división, que debe estar entre 0 y 22.

    public static void ejercicio9() {
        Scanner teclado = new Scanner(System.in);
        String seguir;
        String sigue = "Si";
        do {
            System.out.print("Introduce los números de tu DNI: ");
            int dni = teclado.nextInt();
            teclado.nextLine();
            int resto = dni % 23;
            switch (resto) {
                case 0:
                    System.out.println("La letra de tu dni es la T");
                    break;
                case 1:
                    System.out.println("La letra de tu dni es la R");
                    break;
                case 2:
                    System.out.println("La letra de tu dni es la W");
                    break;
                case 3:
                    System.out.println("La letra de tu dni es la A");
                    break;
                case 4:
                    System.out.println("La letra de tu dni es la G");
                    break;
                case 5:
                    System.out.println("La letra de tu dni es la M");
                    break;
                case 6:
                    System.out.println("La letra de tu dni es la Y");
                    break;
                case 7:
                    System.out.println("La letra de tu dni es la F");
                    break;
                case 8:
                    System.out.println("La letra de tu dni es la P");
                    break;
                case 9:
                    System.out.println("La letra de tu dni es la D");
                    break;
                case 10:
                    System.out.println("La letra de tu dni es la X");
                    break;
                case 11:
                    System.out.println("La letra de tu dni es la B");
                    break;
                case 12:
                    System.out.println("La letra de tu dni es la N");
                    break;
                case 13:
                    System.out.println("La letra de tu dni es la J");
                    break;
                case 14:
                    System.out.println("La letra de tu dni es la Z");
                    break;
                case 15:
                    System.out.println("La letra de tu dni es la S");
                    break;
                case 16:
                    System.out.println("La letra de tu dni es la Q");
                    break;
                case 17:
                    System.out.println("La letra de tu dni es la V");
                    break;
                case 18:
                    System.out.println("La letra de tu dni es la H");
                    break;
                case 19:
                    System.out.println("La letra de tu dni es la L");
                    break;
                case 20:
                    System.out.println("La letra de tu dni es la C");
                    break;
                case 21:
                    System.out.println("La letra de tu dni es la K");
                    break;
                case 22:
                    System.out.println("La letra de tu dni es la E");
                    break;
                default:
                    System.out.println("Número incorrecto.");
                    break;
            }
            System.out.println("¿Quieres comprobar otro DNI?: Si, No.");
            seguir = teclado.nextLine();
        } while (seguir.equalsIgnoreCase(sigue));
        teclado.close();
    }

    // Ejercicio 10: Solicita al usuario una cadena y comprueba el número de vocales
    // que tiene. Deberás usar el método charAT(i) de la clase String para extraer
    // un carácter de la cadena, donde i es la posición del carácter de la cadena
    // que queremos obtener. Por ejemplo, si quisiéramos obtener el carácter número
    // de 5 de una cadena lo haríamos así: cadena.charAT(i)

    public static void ejercicio10() {
        boolean reintentar;
        Scanner teclado = new Scanner(System.in);
        do {
            reintentar = false;
            System.out.println("Escribe una palabra o una frase:");
            String frase = teclado.nextLine();
            int vocales = 0;
            for (int i = 0; i < frase.length(); i++) {
                char resultado = frase.charAt(i);
                switch (resultado) {
                    case 'a', 'A':
                        vocales++;
                        break;
                    case 'e', 'E':
                        vocales++;
                        break;
                    case 'i', 'I':
                        vocales++;
                        break;
                    case 'o', 'O':
                        vocales++;
                        break;
                    case 'u', 'U':
                        vocales++;
                        break;
                    default:
                        break;
                }
            }
            if (vocales <= 0) {
                System.out.println("La frase " + frase + " no tiene ninguna vocal.");
            } else if (vocales == 1) {
                System.out.println("La frase " + frase + " tiene " + vocales + " vocal.");
            } else {
                System.out.println("La frase " + frase + " tiene " + vocales + " vocales.");
            }
            System.out.println("¿Quiéres intentarlo de nuevo?: Si, No.");
            String intento = teclado.nextLine();
            if (intento.equalsIgnoreCase("Si")) {
                reintentar = true;
            }
        } while (reintentar);
        teclado.close();
        System.out.println("Fin...");
    }

    // Ejercicio 11: Realiza el control de acceso a una caja fuerte. La combinación
    // será un número de cuatro cifras. El usuario tendrá 4 oportunidades para
    // averiguar el número. El programa nos pedirá la combinación para abrirla. Si
    // no acertamos, se nos mostrará el mensaje “Clave incorrecta le quedan X
    // intentos”, si agota los 4 intentos mostrará el mensaje “Lo siento has agotado
    // las 4 oportunidades” y si acertamos se nos dirá “Has abierto la caja fuerte”.

    public static void ejercicio11() {
        int contrasenia = 4321;
        int usrpswrd;
        Scanner teclado = new Scanner(System.in);
        for (int intentos = 4; intentos >= 0; intentos--) {
            System.out.print("Introduce la contraseña: ");
            usrpswrd = teclado.nextInt();
            if (usrpswrd == contrasenia) {
                System.out.println("Contraseña correcta.");
                intentos = -1;
            } else {
                System.out.println("Contraseña incorrecta te quedan " + intentos + " intentos.");
            }
            if (intentos == 0) {
                System.out.println("Sin intentos.");
                intentos = -1;
            }
        }
        teclado.close();
    }

    // Ejercicio 12: Realiza un programa que compruebe si dos números son amigos.
    // Para ello hay que comprobar que la suma de todos los divisores del primer
    // número (sin contar con él) es el segundo número, y que la suma de todos los
    // divisores propios del segundo número (sin contar con él) es el primer número.

    public static void ejercicio12() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el primero número: ");
        int num1 = teclado.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = teclado.nextInt();
        int suma = 0;
        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                suma += i;
            }
        }
        if (suma == num2) {
            System.out.println("Los números " + num1 + " y " + num2 + " son amigos.");
        } else {
            System.out.println("Los números " + num1 + " y " + num2 + " no son amigos.");
        }
        teclado.close();
    }

    // Ejercicio 13: Realiza un algoritmo que permita calcular un número determinado
    // de elementos de la serie de Fibonacci, teniendo en cuenta que cada uno es la
    // suma de los dos elementos anteriores, con la excepción de los dos primeros,
    // que son 0 y 1. Así, la serie estaría formada por los números: 0, 1, 1, 2, 3,
    // 5, 8, 13, 21…

    public static void ejercicio13() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número del paso final para la sucesión de fibonacci.");
        int pasofin = teclado.nextInt();
        int sumando1 = 0;
        int sumando2 = 0;
        int resultado = 0;
        pasofin -= 2;
        for (int i = 0; i < pasofin; i++) {
            if (resultado < 1) {
                for (int j = 0; j <= 1; j++) {
                    resultado = sumando1 + sumando2;
                    sumando1 = 1;
                    System.out.println(resultado);
                }
            }
            resultado = sumando1 + sumando2;
            sumando2 = sumando1;
            sumando1 = resultado;
            System.out.println(resultado);
        }
        teclado.close();
    }

    public static void main(String[] args) throws Exception {
        // ejercicio1();z
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5();
        // ejercicio6();
        // ejercicio7();
        // ejercicio8();
        ejercicio9();
        // ejercicio10();
        // ejercicio11();
        // ejercicio12();
        // ejercicio13();
    }
}
