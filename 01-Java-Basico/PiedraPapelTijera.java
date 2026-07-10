import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int eleccionUsuario = 0;

        while (eleccionUsuario != 4) {

            System.out.println("JUEGO PIEDRA PAPEL O TIJERA");
            System.out.println();
            System.out.println("¿Qué eliges?");
            System.out.println("1. Piedra");
            System.out.println("2. Papel");
            System.out.println("3. Tijera");
            System.out.println("4. Salir");
            String respuestaUsuario = "";
            eleccionUsuario = scanner.nextInt();

            if (eleccionUsuario == 4) {
                break;
            }

            switch (eleccionUsuario) {
                case 1:
                    System.out.println("Piedra");
                    respuestaUsuario = "Piedra";
                    break;
                case 2:
                    System.out.println("Papel");
                    respuestaUsuario = "Papel";
                    break;
                case 3:
                    System.out.println("Tijera");
                    respuestaUsuario = "Tijera";
                    break;

                case 4:
                    break;
            }


            int numeroAleatorio = random.nextInt(3) + 1;

            String respuestaMaquina = "";

            switch (numeroAleatorio) {
                case 1:
                    System.out.println("Piedra");
                    respuestaMaquina = "Piedra";
                    break;
                case 2:
                    System.out.println("Papel");
                    respuestaMaquina = "Papel";
                    break;
                case 3:
                    System.out.println("Tijera");
                    respuestaMaquina = "Tijera";
                    break;
            }

            if (respuestaMaquina.equals(respuestaUsuario)) {
                System.out.println("EMPATE");
            } else if (respuestaUsuario.equals("Piedra") && respuestaMaquina.equals("Tijera")) {
                System.out.println("GANA EL USUARIO");
            } else if (respuestaUsuario.equals("Papel") && respuestaMaquina.equals("Piedra")) {
                System.out.println("GANA EL USUARIO");
            } else if (respuestaUsuario.equals("Tijera") && respuestaMaquina.equals("Papel")) {
                System.out.println("GANA EL USUARIO");
            } else {
                System.out.println("GANA LA MAQUINA");
            }

        }

        System.out.println("HAS SALIDO DEL JUEGO");

        scanner.close();
    }
}
