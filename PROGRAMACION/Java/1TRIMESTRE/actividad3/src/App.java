import java.util.Scanner;

public class App {

    // Ejercicio 1: Construte un programa que pida dos números al usuario e indique
    // cuál es mayor o si son iguales.

    public static void ejercicio1() {
        double num1, num2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe dos números:\nNúmero 1: ");
        num1 = teclado.nextDouble();
        System.out.print("Número 2: ");
        num2 = teclado.nextDouble();
        if (num1 > num2) {
            System.out.println("El número " + num1 + " es mayor a " + num2);
        } else if (num1 < num2) {
            System.out.println("El número " + num2 + " es mayor a " + num1);
        } else if (num1 == num2) {
            System.out.println("Los dos números son iguales");
        } else {
            System.out.println("No has introducido valores correctos");
        }
        teclado.close();
    }

    // Ejercicio 2: Construye un programa que pida un número al usuario y nos
    // indique si es par o inpar.

    public static void ejercicio2() {
        double numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un número:");
        numero = teclado.nextDouble();
        if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es inpar");
        }
        teclado.close();
    }

    // Ejercicio 3: Construye un programa que pida dos números al usuario y muestre
    // el resultado de su división. Si el segundo número es 0, debe mostrar un
    // mensaje de error.

    public static void ejercicio3() {
        double num1, num2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe los números que van a ser divididos:\nNúmero 1: ");
        num1 = teclado.nextDouble();
        System.out.print("Número 2: ");
        num2 = teclado.nextDouble();

        if (num2 == 0) {
            System.out.println("!!ERROR!! El número 2 no puede ser igual a 0");
        } else {
            System.out.println("El resultado de la división entre " + num1 + " y " + num2 + "es: " + (num1 / num2));
        }
        teclado.close();
    }

    // Ejercicio 4: Construye un programa que pida dos números al usuario. Debe
    // calcular el resultado de elevar el primero (base) al segundo (exponente)
    // teniendo en cuenta lo siguiente:
    // Si el primer exponente es 0 el resultado es 1
    // En cualquier otro caso calcula la potencia(Math.pow(base,exponente) es la
    // función que calcula la potencia)

    public static void ejercicio4() {
        double base, expo;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la base y el exponente del numero al que quieres elevar\nBase: ");
        base = teclado.nextDouble();
        System.out.print("Exponente: ");
        expo = teclado.nextDouble();
        if (expo == 0) {
            System.out.println("El resultado de cualquier numero elevado a 0 es 1");
        } else {
            System.out.println("El resultado de elevar " + base + " a " + expo + " es " + (Math.pow(base, expo)));
        }
        teclado.close();
    }

    // Ejercicio 5: Construye un programa que exprese si un triángulo es isósceles,
    // equilátero o escaleno y si es rectangulo. Para ello debe recibir por teclado
    // 3 valores correspondiente a la medida de sus lados.

    public static void ejercicio5() {
        double lado1, lado2, lado3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuánto mide el primer lado?");
        lado1 = teclado.nextDouble();
        System.out.println("¿Cuánto mide el segundo?");
        lado2 = teclado.nextDouble();
        System.out.println("¿Cuánto mide el tercero?");
        lado3 = teclado.nextDouble();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Este triángulo es equilátero");
        } else if (lado1 == lado2 && lado2 != lado3 || lado1 != lado2 && lado2 == lado3
                || lado1 != lado2 && lado1 == lado3) {
            if (Math.pow(lado1, 2) + Math.pow(lado2, 2) == Math.round(Math.pow(lado3, 2))
                    || Math.pow(lado2, 2) + Math.pow(lado3, 2) == Math.round(Math.pow(lado1, 2))
                    || Math.pow(lado1, 2) + Math.pow(lado3, 2) == Math.round(Math.pow(lado2, 2))) {
                System.out.println("Este triángulo es rectángulo isósceles");
            } else {
                System.out.println("Este tríangulo es isosceles");
            }
        } else if (lado1 != lado2 && lado2 != lado3) {
            if (Math.pow(lado1, 2) + Math.pow(lado2, 2) == Math.round(Math.pow(lado3, 2))
                    || Math.pow(lado2, 2) + Math.pow(lado3, 2) == Math.round(Math.pow(lado1, 2))
                    || Math.pow(lado1, 2) + Math.pow(lado3, 2) == Math.round(Math.pow(lado2, 2))) {
                System.out.println("Este triángulo es rectángulo escaleno");
            } else {
                System.out.println("Este tríangulo es escaleno");
            }
        } else {
            System.out.println("Algo has puesto mal");
        }
        teclado.close();
    }

    // Ejercicio 6: Un instituto esta organizando un vieje y te piden que construyas
    // un programa que calcule el coste total del viaje y lo que le supone a cada
    // alumno en función de lo siguiente:
    // Si llegan a 50 alumnos o mas, deberán pagar 40 euros por alumno.
    // De 30 a 49 alumnos, deberán pagar 48 euros por alumno.
    // De 20 a 29 alumnos, deberan pagar 56 euros por alumno.
    // Menos de 20 alimnos, deben abonar un total de 2000 euros.

    public static void ejercicio6() {
        int numalum;
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántos alumnos vienen al viaje?");
        numalum = teclado.nextInt();

        if (numalum == 0) {
            System.out.println("Ha habido un error a la hora de introducir el numero de alumnos, asegurate de que no sea 0");
        } else if (numalum < 20) {
            System.out.println("Se debe abonar un total de " + (2000 / numalum)
                    + " euros ya que el total de dinero a recaudar entre los " + numalum + " alumnos es de 2000 euros");
        } else if (numalum >= 20 && numalum <= 29) {
            System.out.println("Se debe abonar un total de 56 euros ya que el total a abonar entre los " + numalum
                    + " es de " + (numalum * 56) + " euros");
        } else if (numalum >= 30 && numalum <= 49) {
            System.out.println("Se debe abonar un total de 48 euros ya que el total a abonar entre los " + numalum
                    + " es de " + (numalum * 48));
        } else if (numalum >= 50) {
            System.out.println("Se debe abonar un total de 40 euros ya que el total a abonar entre los " + numalum + " es de " + (numalum * 40));
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
            case "Ejercicio 2", "EJERCICIO 2", "ejercicio 2", "Ej 2", "EJ 2", "ej 2", "Ejercicio2", "EJERCICIO2",
                    "ejercicio2", "Ej2", "EJ2", "ej2", "2":
                ejercicio2();
                break;
            case "Ejercicio 3", "EJERCICIO 3", "ejercicio 3", "Ej 3", "EJ 3", "ej 3", "Ejercicio3", "EJERCICIO3",
                    "ejercicio3", "Ej3", "EJ3", "ej3", "3":
                ejercicio3();
                break;
            case "Ejercicio 4", "EJERCICIO 4", "ejercicio 4", "Ej 4", "EJ 4", "ej 4", "Ejercicio4", "EJERCICIO4",
                    "ejercicio4", "Ej4", "EJ4", "ej4", "4":
                ejercicio4();
                break;
            case "Ejercicio 5", "EJERCICIO 5", "ejercicio 5", "Ej 5", "EJ 5", "ej 5", "Ejercicio5", "EJERCICIO5",
                    "ejercicio5", "Ej5", "EJ5", "ej5", "5":
                ejercicio5();
                break;
            case "Ejercicio 6", "EJERCICIO 6", "ejercicio 6", "Ej 6", "EJ 6", "ej 6", "Ejercicio6", "EJERCICIO6",
                    "ejercicio6", "Ej6", "EJ6", "ej6", "6":
                ejercicio6();
                break;
            default:
                System.out.println("No has introducido ningun numero o ejercicio válido");
                break;
        }
        ejer.close();
    }
}
