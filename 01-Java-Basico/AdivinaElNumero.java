import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(100)+1;
        int intentos = 1; 

        System.out.println("¿Qué número crees que es?");
        int respuestaUsuario = scanner.nextInt();

        while (respuestaUsuario != numeroAleatorio) {

            intentos += 1;    

            if (respuestaUsuario > numeroAleatorio) {
                System.out.println("Más bajo");
            } else if (respuestaUsuario < numeroAleatorio) {
                System.out.println("Más alto");} 

            

            System.out.println("¿Qué número crees que es?");
            respuestaUsuario = scanner.nextInt();
    }   

    System.out.println("HAS ACERTADO");
}







    
