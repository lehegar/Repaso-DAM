import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Write the second number");
        int secondNumber = scanner.nextInt();

        scanner.nextLine(); 

        System.out.println("What's the operation?");
        String operation = scanner.nextLine();

        int total = 0;


        if (secondNumber == 0 && operation.equals("/") ) {
            System.out.println("This operation isn't possible");
            return;
        }

        switch (operation) {
            case "+":
                total = firstNumber + secondNumber;
                break;

             case "-":
                total = firstNumber - secondNumber;
                break;

            case "*":
                total = firstNumber * secondNumber;
                break;
            
            case "/":
                total = firstNumber / secondNumber;
                break;

            default:
                System.out.println("Invalid operation");
                return;
        }

        System.out.println("El resultado es: " + total);

        scanner.close();


}}
