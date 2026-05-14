public class Calculadora {
    public static void main(String[] args) {

        System.out.println("Write the first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Write the second number");
        int secondNumber = scanner.nextInt();

        System.out.println("Write the second number");
        String operation = scanner.nextLine();

        int total;

        switch (operation) {
            case "+":
                total = firstNumber + secondNumber;
                break;

             case "-":
                total = firstNumber + secondNumber;
                break;
        }

        System.out.println("El resultado es: " + total);


}}
