import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ficheros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("1. Escribir nota");
            System.out.println("2. Leer notas");
            System.out.println("3. Salir");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduce un número válido.");
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.println("Escribe tu nota:");
                    String notaUsuario = scanner.nextLine();

                    try {
                        FileWriter fw = new FileWriter("notas.txt", true);
                        fw.write(notaUsuario + "\n");
                        fw.close();
                        System.out.println("Nota guardada.");
                    } catch (IOException e) {
                        System.out.println("Error al guardar la nota.");
                    }
                    break;

                case 2:
                    try {
                        BufferedReader br = new BufferedReader(new FileReader("notas.txt"));
                        String linea;
                        while ((linea = br.readLine()) != null) {
                            System.out.println(linea);
                        }
                        br.close();
                    } catch (IOException e) {
                        System.out.println("Error al leer las notas.");
                    }
                    break;
                case 3:
                    System.out.println("Hasta luego");
                    break;
            }
        } while (opcion != 3);
    }
}