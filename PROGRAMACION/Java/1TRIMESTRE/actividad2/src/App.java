import java.util.Scanner;

public class App {

    // Ejercicio 1: Pide por teclado un String que contenga preguntando por tu
    // nombre, después muestra un mensaje de bienvenida por consola. Por ejemplo: si
    // introduzco “Fernando”, me aparezca “Bienvenido Fernando”.

    public static void ejercicio1() {
        String nombre;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe tu nombre aqui: ");
        nombre = teclado.nextLine();
        System.out.println("Bienvenido " + nombre);
        teclado.close();
    }

    // Ejercicio 2: Pedir dos números y realizar operaciones básicas de suma, resta
    // y multiplicación, enseñando el resultado.

    public static void ejercicio2() {
        double num1, num2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe el primer número con el que quieras operar: ");
        num1 = teclado.nextDouble();
        System.out.print("Escribe el segundo número con el que quieras operar: ");
        num2 = teclado.nextDouble();
        System.out.println("El resultado de la suma entre " + num1 + " y " + num2 + "es: " + (num1 + num2));
        System.out.println("El resultado de la resta entre " + num1 + " y " + num2 + "es: " + (num1 - num2));
        System.out.println("El resultado de la multiplicación entre " + num1 + " y " + num2 + "es: " + (num1 * num2));
        System.out.println("El resultado de la división entre " + num1 + " y " + num2 + "es: " + (num1 / num2));
        teclado.close();
    }

    // Ejercicio 3: Pedir un número calcular su raíz cuadra.

    public static void ejercicio3() {
        double numero;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe aqui un número para hacer su raiz cuadrada. ");
        numero = teclado.nextDouble();
        double raizcuad = Math.sqrt(numero);
        System.out.println("El resultado de la raiz cuadrada de " + numero + " es: " + raizcuad);
        teclado.close();
    }

    // Ejercicio 4: Pedir dos números (base y exponente) y calcular la potencia.

    public static void ejercicio4() {
        double base, exponente;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe la base del número a elevar: ");
        base = teclado.nextDouble();
        System.out.print("Escribe aqui el exponente de " + base + ": ");
        exponente = teclado.nextDouble();
        double resultado = Math.pow(base, exponente);
        System.out.println("El resultado de la potencia entre " + base + " y " + exponente + " es: " + resultado);
        teclado.close();
    }

    // Ejercicio 5: Pedir el radio de un circulo y calcular su área. (A=pi*r^2)
    // (Podemos usar Math.PI para el valor de pi o poner directamente el valor).

    public static void ejercicio5() {
        double radio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el radio del circulo: ");
        radio = teclado.nextDouble();
        int exponente = 2;
        double radioCuadrado = Math.pow(radio, exponente);
        double area = Math.PI * radioCuadrado;
        System.out.println("El area del circulo cuyo radio es " + radio + " es: " + area);
        teclado.close();
    }

    // Ejercicio 6: Pedir el radio de una circunferencia y calcular su
    // longitud.(L=2*pi*r)

    public static void ejercicio6() {
        double radio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el radio del circulo: ");
        radio = teclado.nextDouble();
        double longiSinSuma = Math.PI * radio;
        double longi = longiSinSuma * 2;
        System.out.println("La longitud de este esta circunferencia es. " + longi);
        teclado.close();
    }

    // Ejercicio 7: Pedir un password y comprobar si es igual que un String definido
    // en el programa. Enseñar el resultado por pantalla.

    public static void ejercicio7() {
        String paswd = "Hola1234";
        String paswdUser;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la contraseña. ");
        paswdUser = teclado.nextLine();
        System.out.println("El estado de la contraseña que has puesto es: ==> " + (paswdUser.equals(paswd)));
        teclado.close();
    }

    // Ejercicio 8: Pedir una frase y enseñar por pantalla, la longitud, la primera
    // y última letra.

    public static void ejercicio8() {
        String frase;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe aqui una frase: ");
        frase = teclado.nextLine();
        System.out.println("La longitud de lo que has escrito es: " + frase.length());
        System.out.println("La primera letra de la cadena es: " + frase.substring(0, 1) + "\nLa última letra es: "
                + frase.substring(frase.length() - 1, frase.length()));
        teclado.close();
    }

    // Ejercicio 9: Pedir por consola o pantalla una frase que contenga la palabra
    // "amigo", como por ejemplo: “Hola amigo ¿cómo estás?”. El programa deberá
    // enseñar el substring "amigo" extraído de la cadena introducida por consola.

    public static void ejercicio9() {
        String frase;
        System.out.println("Escribe aquí una frase que debe contener la palabra 'amigo': ");
        Scanner teclado = new Scanner(System.in);
        frase = teclado.nextLine();
        System.out.println(frase.substring(frase.indexOf("amigo"), frase.indexOf("amigo") + 5));
        teclado.close();
    }

    // Ejercicio 10: Lo mismo que el ejercicio 9 pero cambiando la palabra "amigo"
    // por una que el usuario ponga por pantalla.

    public static void ejercicio10() {
        String frase, palabra;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe aquí una frase que debe contener la palabra que selecciones posteriormente: ");
        frase = teclado.nextLine();
        System.out.println("Escribe aqui la palabra que quieres que se coja: ");
        palabra = teclado.nextLine();
        System.out.println(frase.substring(frase.indexOf(palabra), frase.indexOf(palabra) + palabra.length()));
        teclado.close();
    }

    // Ejercicio 11: Debes preguntar por teclado que notas ha sacado el usuario y
    // responderle si ha aprobado, si ha sacado suficiente, notable o sobresaliente.

    public static void ejercicio11() {
        Double nota;
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Qué nota has sacado?");
        nota = teclado.nextDouble();

        if (nota < 5) {
            System.out.println("Suspenso");
        } else if (nota >= 5 & nota < 7) {
            System.out.println("Suficiente");
        } else if (nota >= 7 & nota < 9) {
            System.out.println("Notable");
        } else if (nota >= 9 & nota <= 10) {
            System.out.println("Sobresaliente");
        }
        teclado.close();
    }

    public static void main(String[] args) throws Exception {
        String ejercicios;
        Scanner ejer = new Scanner(System.in);
        System.out.print("Escribe que ejercicio quieres ver: ");
        ejercicios = ejer.nextLine();

        switch (ejercicios) {
            case "Ejercicio 1", "EJERCICIO 1", "ejercicio 1", "Ej 1", "EJ 1", "ej 1", "Ejercicio1", "EJERCICIO1",
                    "ejercicio1", "Ej1", "EJ1", "ej1", "1":
                ejercicio1();
                break;
            case "Ejercicio 2", "EJERCICIO 2", "ejercicio 2", "Ej 2", "EJ 2", "ej 2",
                    "Ejercicio2", "EJERCICIO2",
                    "ejercicio2", "Ej2", "EJ2", "ej2", "2":
                ejercicio2();
                break;
            case "Ejercicio 3", "EJERCICIO 3", "ejercicio 3", "Ej 3", "EJ 3", "ej 3",
                    "Ejercicio3", "EJERCICIO3",
                    "ejercicio3", "Ej3", "EJ3", "ej3", "3":
                ejercicio3();
                break;
            case "Ejercicio 4", "EJERCICIO 4", "ejercicio 4", "Ej 4", "EJ 4", "ej 4",
                    "Ejercicio4", "EJERCICIO4",
                    "ejercicio4", "Ej4", "EJ4", "ej4", "4":
                ejercicio4();
                break;
            case "Ejercicio 5", "EJERCICIO 5", "ejercicio 5", "Ej 5", "EJ 5", "ej 5",
                    "Ejercicio5", "EJERCICIO5",
                    "ejercicio5", "Ej5", "EJ5", "ej5", "5":
                ejercicio5();
                break;
            case "Ejercicio 6", "EJERCICIO 6", "ejercicio 6", "Ej 6", "EJ 6", "ej 6",
                    "Ejercicio6", "EJERCICIO6",
                    "ejercicio6", "Ej6", "EJ6", "ej6", "6":
                ejercicio6();
                break;
            case "Ejercicio 7", "EJERCICIO 7", "ejercicio 7", "Ej 7", "EJ 7", "ej 7",
                    "Ejercicio7", "EJERCICIO7",
                    "ejercicio7", "Ej7", "EJ7", "ej7", "7":
                ejercicio7();
                break;
            case "Ejercicio 8", "EJERCICIO 8", "ejercicio 8", "Ej 8", "EJ 8", "ej 8",
                    "Ejercicio8", "EJERCICIO8",
                    "ejercicio8", "Ej8", "EJ8", "ej8", "8":
                ejercicio8();
                break;
            case "Ejercicio 9", "EJERCICIO 9", "ejercicio 9", "Ej 9", "EJ 9", "ej 9",
                    "Ejercicio9", "EJERCICIO9",
                    "ejercicio9", "Ej9", "EJ9", "ej9", "9":
                ejercicio9();
                break;
            case "Ejercicio 10", "EJERCICIO 10", "ejercicio 10", "Ej 10", "EJ 10", "ej 10",
                    "Ejercicio10", "EJERCICIO10",
                    "ejercicio10", "Ej10", "EJ10", "ej10", "10":
                ejercicio10();
                break;
            case "Ejercicio 11", "EJERCICIO 11", "ejercicio 11", "Ej 11", "EJ 11", "ej 11",
                    "Ejercicio11", "EJERCICIO11",
                    "ejercicio11", "Ej11", "EJ11", "ej11", "11":
                ejercicio11();
                break;
            default:
                System.out
                        .println("No has introducido un nombre correcto, vuelve a intentarlo con un ejercicio válido");
                break;
        }
        ejer.close();
    }
}
