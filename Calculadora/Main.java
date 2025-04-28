import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menú
        System.out.println("Bienvenido a la calculadora para operaciones básicas.");
        System.out.println("Ingresa el primer número:");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingresa el segundo número:");
        int secondNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingresa la operación que deseas hacer: (+, -, *, /)");
        String operation = scanner.next();

        scanner.close();

        // Instancia de objeto calculadora
        Calculadora calculadora = new Calculadora(firstNumber, secondNumber);

        // Hace una u otra operación dependiendo del contenido de la variable operation
        switch (operation) {
            case "+":
                calculadora.sumar(firstNumber, secondNumber)
                break;

            case "-":
            calculadora.restar(firstNumber, secondNumber);
                break;

            case "*":
                calculadora.multiplicar(firstNumber, secondNumber)
                break;

            case "/":
                calculadora.dividir(firstNumber, secondNumber)
                break;
                
            default:
            System.out.println("Opción no válida");
                break;
        }
    }
}