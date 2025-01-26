import java.util.Scanner;

public class App {

    // Ejercicio 1: Escribe un programa que pida un número y diga si es o no
    // múltiplo de 3.

    public static void ejercicio1() {
        double numero;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        numero = teclado.nextDouble();

        if (numero % 3 == 0) {
            System.out.println("El número es multiplo de 3");
        } else {
            System.out.println("El número no es multiplo de 3");
        }
        teclado.close();
    }

    // Ejercicio 2: Escribe un programa que lee por teclado tres números enteros y
    // calcula y muestra el mayor de los tres.

    public static void ejercicio2() {
        int num1, num2, num3;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        num1 = teclado.nextInt();
        System.out.print("Introduce el segundo número: ");
        num2 = teclado.nextInt();
        System.out.print("Introduce el tercer número: ");
        num3 = teclado.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El número " + num1 + "es el mayor");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El número " + num2 + " es el mayor");
        } else if (num3 > num2 && num3 > num1) {
            System.out.println("El número " + num3 + " es el mayor");
        } else {
            System.out.println("!!ERROR!! Es posible que todos los números que hayas introducido sean iguales");
        }
        teclado.close();
    }

    // Ejercicio 3: Escribe un programa que lea por teclado tres números enteros H,
    // M, S correspondientes a hora, minutos y segundos respectivamente, y comprueba
    // si la hora que indican es una hora válida.

    public static void ejercicio3() {
        int h, m, s;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la hora: ");
        h = teclado.nextInt();
        System.out.println("Introduce los minutos: ");
        m = teclado.nextInt();
        System.out.println("Introduce los segundos: ");
        s = teclado.nextInt();

        if ((h >= 0 && h < 24) && (m >= 0 && m < 60) && (s >= 0 && s < 60)) {
            System.out.println("La hora es válida: Son las " + h + ":" + m + ":" + s);
        } else {
            System.out.println("La hora que has introducido utiliza un formato no válido.");
        }
        teclado.close();
    }

    // Ejercicio 4: Escribe un programa que pida por teclado un número entre 0 y 10,
    // y muestre en pantalla el nombre en letras de ese número. Se debe controlar
    // que se introduzca un número válido.

    public static void ejercicio4() {
        double numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero entre 0 y 10: ");
        numero = teclado.nextDouble();

        if (numero < 0 && numero > 10) {
            System.out.println(
                    "El número " + numero + "no es válido\nRecuerda que debes introducir un numero entre 0 y 10.");
        } else if (numero == 0) {
            System.out.println("cero");
        } else if (numero == 1) {
            System.out.println("uno");
        } else if (numero == 2) {
            System.out.println("dos");
        } else if (numero == 3) {
            System.out.println("tres");
        } else if (numero == 4) {
            System.out.println("cuatro");
        } else if (numero == 5) {
            System.out.println("cinco");
        } else if (numero == 6) {
            System.out.println("seis");
        } else if (numero == 7) {
            System.out.println("siete");
        } else if (numero == 8) {
            System.out.println("ocho");
        } else if (numero == 9) {
            System.out.println("nueve");
        } else if (numero == 10) {
            System.out.println("diez");
        } else {
            System.out.println("No has introducido un número correcto.");
        }
        teclado.close();
    }

    // Ejercicio 5: Escribe un programa que realice lo contrario que el anterior, es
    // decir pide un número en letras y enseña un número.

    public static void ejercicio5() {
        String numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero entre cero y diez:");
        numero = teclado.nextLine();

        if (numero.toLowerCase().equals("cero")) {
            System.out.println("0");
        } else if (numero.toLowerCase().equals("uno")) {
            System.out.println("1");
        } else if (numero.toLowerCase().equals("dos")) {
            System.out.println("2");
        } else if (numero.toLowerCase().equals("tres")) {
            System.out.println("3");
        } else if (numero.equals("cuatro")) {
            System.out.println("4");
        } else if (numero.toLowerCase().equals("cinco")) {
            System.out.println("5");
        } else if (numero.toLowerCase().equals("seis")) {
            System.out.println("6");
        } else if (numero.toLowerCase().equals("siete")) {
            System.out.println("7");
        } else if (numero.toLowerCase().equals("ocho")) {
            System.out.println("8");
        } else if (numero.toLowerCase().equals("nueve")) {
            System.out.println("9");
        } else if (numero.toLowerCase().equals("diez")) {
            System.out.println("10");
        } else {
            System.out.println("No has introducido un número correcto.");
        }
        teclado.close();
    }

    // Ejercicio 6: Escribe un programa que lea una variable entera mes y compruebe
    // si el valor corresponde a un mes de 30 días, de 31 o de 28. Supondremos que
    // febrero tiene 28 días. Se mostrará además el nombre del mes.

    public static void ejercicio6() {
        String mes;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el nombre de un mes: ");
        mes = teclado.nextLine();

        if (mes.equals("Enero") || mes.equals("Marzo") || mes.equals("Mayo") || mes.equals("Julio")
                || mes.equals("Agosto") || mes.equals("Octubre") || mes.equals("Diciembre")) {
            System.out.println("El mes de " + mes + " tiene 31 días");
        } else if (mes.equals("Abril") || mes.equals("Junio") || mes.equals("Septiembre") || mes.equals("Noviembre")) {
            System.out.println("El mes de " + mes + " tiene 30 días");
        } else if (mes.equals("Febrero")) {
            System.out.println("El mes " + mes + " tiene 28 días.");
        } else {
            System.out.println("Has escrito mal el nombre del mes, has escrito '" + mes + "'.");
        }
        teclado.close();
    }

    // Ejercicio 7: Escribe un programa que pida la nota de las tres evaluaciones, y
    // si están aprobadas realizar la media para calcular la nota final. Evaluación
    // aprobada >= 5. Si no, escribe que evaluación debe recuperar.

    public static void ejercicio7() {
        float nota1, nota2, nota3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu nota de la primera evaluación:");
        nota1 = teclado.nextFloat();
        System.out.println("Introduce tu nota de la segunda evaluación:");
        nota2 = teclado.nextFloat();
        System.out.println("Introduce tu nota de la tercera evaluación:");
        nota3 = teclado.nextFloat();

        if ((nota1 >= 0 && nota1 <= 10) && (nota2 >= 0 && nota2 <= 10) && (nota3 >= 0 && nota3 <= 10)) {
            if (nota1 >= 5 && nota2 >= 5 && nota3 >= 5) {
                double notsinred = (Math.round((((nota1 + nota2 + nota3) / 3) * 100)));
                System.out.println(
                        "La media de las notas " + nota1 + ", " + nota2 + " y " + nota3 + " es: " + (notsinred / 100));
            } else {
                System.out.println("Tienes notas suspensas, por lo que no se te hara nota media.");
            }
        } else {
            System.out.println("La nota no es válida, recuerda que debe ser un número entre 0 y 10.");
        }
        if (nota1 < 5) {
            System.out.println("Debes recuperar la primera evaluación ya que tienes una nota de " + nota1);
        }
        if (nota2 < 5) {
            System.out.println("Debes recuperar la segunda evaluación ya que tienes una nota de " + nota2);
        }
        if (nota3 < 5) {
            System.out.println("Debes recuperar la tercera evaluación ya que tienes una nota de " + nota3);
        }
        teclado.close();
    }

    // Ejercicio 8: Escribe un programa que calcule el sueldo de un trabajador. Debe
    // pedir el número de horas trabajadas este mes. Las primeras 150 horas se pagan
    // a 10€ y a partir de ahí, las restantes horas que superen las 150 se pagan a
    // 20€. Debe aparecer por pantalla el total del sueldo.

    public static void ejercicio8() {
        int horas;
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Cuántas horas trabajas al mes?: ");
        horas = teclado.nextInt();

        if (horas > 0) {
            if (horas <= 150) {
                System.out.println("Tu salario mensual es de " + (horas * 10));
            } else {
                int horas20 = (horas - 150);
                System.out.println("Tu salario mensual es de " + ((150 * 10) + (horas20 * 20)));
            }
        } else {
            System.out.println(
                    "Has introducido incorrectamente las horas\nNo pongas números negativos en las horas ni numero 0\nHas escrito  "
                            + horas);
        }

        teclado.close();
    }

    // Ejercicio 9: Escribe un programa que diga si un año es bisiesto. No deber
    // permitir aceptar años negativos. Un año es bisiesto si cumple una de las
    // siguientes reglas:
    // 1. Divisible entre 4, divisible entre 100 y divisible entre 400.
    // 2. Divisible entre 4, NO divisible entre 100

    public static void ejercicio9() {
        int anho;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe aqui un año para comprobar si es bisiesto o no: ");
        anho = teclado.nextInt();

        if (anho >= 0) {
            if (((anho % 4 == 0) && (anho % 100 == 0) && (anho % 400 == 0))
                    || ((anho % 4 == 0) && !(anho % 100 == 0))) {
                System.out.println("El año " + anho + " es bisiesto.");
            } else {
                System.out.println("El año " + anho + " no es bisiesto.");
            }
        } else {
            System.out.println("No has introducido un año correcto, has introducido " + anho);
        }
        teclado.close();
    }

    public static void main(String[] args) throws Exception {
        String ejercicio;
        Scanner ejer = new Scanner(System.in);
        System.out.println("¿Qué ejercicio quieres ver?");
        ejercicio = ejer.nextLine();
        switch (ejercicio) {
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
            default:
                System.out.println("No has introducido ningun numero o ejercicio válido");
                break;
        }
        ejer.close();
    }
}
