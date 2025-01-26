import java.util.Scanner;

public class App {
    static Scanner teclado = new Scanner(System.in);

    public static void calculadora() {
        int num1, num2;
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        System.out.println(suma(num1, num2));

    }

    public static int suma(int num1, int num2) {
        return num1 + num2;
    }

    
    public static void main(String[] args) throws Exception {
        calculadora();
    }
}
