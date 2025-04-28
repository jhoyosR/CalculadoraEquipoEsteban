public class Calculadora {
    int firstNumber;
    int secondNumber;

    public Calculadora(int firstNumber, int secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void restar(int firstNumber, int secondNumber){
        System.out.println("La resta entre "+ firstNumber + " y " + secondNumber + " es: " + (firstNumber-secondNumber));
    }
}