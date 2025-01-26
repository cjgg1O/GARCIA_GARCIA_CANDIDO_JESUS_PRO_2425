import java.util.Scanner;

public class App {
    // Ejercicio 1: Escribe un programa que muestre tu nombre por pantalla.

    public static void ejercicio1() {
        System.out.println("Tu nombre es Cándido Jesús García García");
    }

    /*
     * Ejercicio 2: Modifica el programa anterior para que además se muestre tu edad
     * y tu correo electrónico.
     * Asegúrate de que los datos se muestran en líneas separadas.
     */

    public static void ejercicio2() {
        System.out.println(
                "Tu nombre es Cándido Jesús García García\nTu edad es de 20 años\ntu correo electronico es: candi5@educarex.es");
    }

    /*
     * Ejercicio 3: Escribe un programa que muestre por pantalla 10 palabras en
     * inglés junto a su correspondiente traducción al castellano.
     * Las palabras deben estar distribuidas en dos columnas y alineadas a la
     * izquierda.
     * Pista: Se puede insertar un tabulador mediante \t.
     */

    public static void ejercicio3() {
        System.out.println(
                "Casa \t \t \t House\nPerro \t \t \t Dog\nGato \t \t \t Cat\nCielo \t \t \t Sky\nAgua \t \t \t Water\nComida \t \t \t Food\nSol \t \t \t Sun\nLuna \t \t \t Moon\nLibro \t \t \t Book\nFlor \t \t \t Flower");
    }

    // Ejercicio 4: Escribe un programa que muestre tu horario de clase. Puedes usar
    // espacios o tabuladores para alinear el texto.

    public static void ejercicio4() {
        System.out.println(
                "\t    HORAS \t LUNES\t\tMARTES\t\tMIÉRCOLES \t JUEVES\t\tVIERNES\n \t15:45 - 16:40 \tB B D D        S. I N F \tENT. DESR     PROGRAMACIÓN    PROGRAMACIÓN\n \t16:40 - 17:35 \tB B D D        S. I N F \tENT. DESR     PROGRAMACIÓN    PROGRAMACIÓN\n \t17:35 - 18:30  ING. PROF     PROGRAMACIÓN      PROGRAMACIÓN\t B B D D \t IPE 1\n \t18:30 - 19:25 \t IPE 1 \t     PROGRAMACIÓN      LEN. MARCAS \t B B D D       ENT. DESR\n \t19:25 - 20-20 LEN. MARCAS      B B D D\t       LEN. MARCAS\tING. PROF\tS. I N F\n \t20:20 - 21-25 LEN. MARCAS      B B D D\t\tS. I M F\t  IPE 1\t\tS. I N F");
    }

    /*
     * Ejercicio 5: Escribe un programa que pinte por pantalla una pirámide rellena
     * a base de asteriscos.
     * La base de la pirámide debe estar formada por 9 asteriscos.
     */

    public static void ejercicio5() {
        System.out.println(
                "\t\t\t\t*\n\t\t\t*\t*\t*\n\t\t*\t*\t*\t*\t*\n\t*\t*\t*\t*\t*\t*\t*\n*\t*\t*\t*\t*\t*\t*\t*\t*");
    }

    /*
     * Ejercicio 6: Igual que el programa anterior,
     * pero esta vez la pirámide estará hueca (se debe ver únicamente el contorno
     * hecho con asteriscos).
     */

    public static void ejercicio6() {
        System.out.println(
                "\t\t\t\t*\n\t\t\t*\t \t*\n\t\t*\t \t \t \t*\n\t*\t \t \t \t \t \t*\n*\t*\t*\t*\t*\t*\t*\t*\t*");
    }

    // Ejercicio 7: Igual que el programa anterior, pero esta vez la pirámide debe
    // aparecer invertida, con el vértice hacia abajo.

    public static void ejercicio7() {
        System.out.println(
                "*\t*\t*\t*\t*\t*\t*\t*\t*\n\t*\t \t \t \t \t \t*\n\t\t*\t \t \t \t*\n\t\t\t*\t \t*\n\t\t\t\t*");
    }

    // Aquí se elije cual de todos los ejercicios se debe ejecutar

    // Aqui se elije el ejercicio que se va a ejecutar
    public static void main(String[] args) throws Exception {
        System.out.println("Escribe el ejercicio que quieres ejecutar (Ej: Ejercicio 4): ");
        String opciones;
        Scanner opcion = new Scanner(System.in);
        opciones = opcion.nextLine();

        switch (opciones) {
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
            case "Ejercicio 7", "EJERCICIO 7", "ejercicio 7", "Ej 7", "EJ 7", "ej 7", "Ejercicio7", "EJERCICIO7",
                    "ejercicio7", "Ej7", "EJ7", "ej7", "7":
                ejercicio7();
            default:
                System.out
                        .println("No has introducido un nombre correcto, vuelve a intentarlo con un ejercicio válido");
                break;
        }
        opcion.close();
    }
}
