import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    long num;
    int numvez;
    String arrab;
    Scanner numero = new Scanner(System.in);
    Scanner numerovezes = new Scanner(System.in);
    Scanner arribabajo= new Scanner(System.in);
        System.out.println("Escribe el numero que deseas cambiar de unidad de medida:");
    num = numero.nextLong();
        System.out.println("¿Deseas subir o bajar de unidad? Ej: 'Subir: De KB a GB' o 'Bajar: De TB a MB'.\nMínima unidad permitida Byte.");
    arrab = arribabajo.nextLine();
    
        switch (arrab) {
            case "SUBIR", "subir", "Subir":
                        System.out.println("¿Cuantas veces deseas subir en la escalera?\nEJ: Si quieres subir de MB a TB elije 2\nMáximo de veces que se puede subir 4");
                    numvez = numerovezes.nextInt(); 
                switch (numvez) {
                    case 1:
                        System.out.println("El resultado es " + (num / 1024));
                        break;
                    case 2:
                        System.out.println("El resultado es " + (num / 1024 / 1024));
                        break;
                    case 3:
                        System.out.println("El resultado es " + (num / 1024 / 1024 / 1024));
                        break;
                    case 4:
                        System.out.println("El resultado es " + (num / 1024 / 1024 / 1024 / 1024));
                        break;
                    default:
                        System.out.println("Has puesto un valor incorrecto, recuerda que solo puedes utilizar valores de subida del 1 al 4");
                        break;
                }
                break;
            case "BAJAR", "bajar", "Bajar":
                    System.out.println("¿Cuántas veces deseas bajar en la escalera?\nEJ: Si quieres bajar de TB a MB elije 2\nMáximo de veces que se puede bajar 4\nSi bajas mas de la cuenta te dara un valor erroneo.");
                numvez = numerovezes.nextInt();
                    switch (numvez) {
                        case 1:
                            System.out.println("El resultado es " + (num * 1024));
                            break;
                        case 2:
                            System.out.println("El resultado es " + (num * 1024 * 1024));
                            break;
                        case 3:
                            System.out.println("El resultado es " + (num * 1024 * 1024 * 1024));
                            break;
                        case 4:
                            System.out.println("El resultado es " + (num * 1024 * 1024 * 1024 * 1024));
                            break;
                        default:
                            System.out.println("Has puesto un valor incorrecto, recuerda que solo puedes utilizar valores de bajada del 1 al 4");
                            break;
                    }
                break;
            default:
                    System.out.println("Has utilizado un valor incorrecto");
                break;
        }
    numero.close();
    numerovezes.close();
    arribabajo.close();
    }
}
