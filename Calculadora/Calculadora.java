public class Calculadora {
    
    // Atributos
    int firstNumber;
    int secondNumber;
    
    // Constructor
    public Calculadora(int firstNumber, int secondNumber) {
        this.firstNumber  = firstNumber;
        this.secondNumber = secondNumber;
    }
    
    // Método para sumar que recibe dos parámetros de tipo int
    public void sumar(int a, int b) {
        System.out.println("La suma de "+ a +" + " + b + " = " + (a+b));
    }

    // Método para multiplicar que recibe dos parámetros de tipo int
    public void multiplicar (int firstNumber, int secondNumber) {
        System.out.println("El resultado de la multiplicación entre " + firstNumber + " y " + secondNumber + " es: " + (firstNumber * secondNumber)); 
    }
    
    // Método para dividir que recibe dos parámetros de tipo int
    public void dividir (int firstNumber, int secondNumber) {
        System.out.println("El resultado de la división entre " + firstNumber + " y " + secondNumber + " es: " + (firstNumber / secondNumber)); 
    }

}