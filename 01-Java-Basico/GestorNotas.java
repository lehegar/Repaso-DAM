import java.util.ArrayList;
import java.util.Scanner;

public class GestorNotas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> notas = new ArrayList<>();

        int eleccionUsuario;

        do {

            // MENU DE INICIO
            System.out.println("----- MENÚ -----");
            System.out.println("1. Añadir nota");
            System.out.println("2. Ver todas las notas");
            System.out.println("3. Borrar notas");
            System.out.println("4. Salir");
            System.out.println("5. Editar una nota");
            System.out.print("Elige una opción: ");
            eleccionUsuario = scanner.nextInt();
            scanner.nextLine();

            // ELECCION DEL USUARIO
            switch (eleccionUsuario) {

                // AÑADIR NOTAS
                case 1:
                    System.out.println("Escribe la nota que desea añadir:");
                    String notaAnadida = scanner.nextLine();
                    notas.add(notaAnadida);
                    break;

                // VER TODAS LAS NOTAS
                case 2:
                    System.out.println("Aquí tienes todas las notas:");

                    if (notas.isEmpty()) {
                        System.out.println("No hay notas guardadas.");
                    } else {
                        for (int i = 0; i < notas.size(); i++) {
                            System.out.println("[" + (i + 1) + "] " + notas.get(i));
                        }
                    }

                    break;

                // ELIMINAR NOTA
                case 3:

                    if (notas.isEmpty()) {

                        System.out.println("No hay notas guardadas.");

                    } else {

                        System.out.println("¿Qué nota desea eliminar?");

                        for (int i = 0; i < notas.size(); i++) {
                            System.out.println("[" + (i + 1) + "] " + notas.get(i));
                        }

                        System.out.print("Introduce el número de la nota que quieres eliminar: ");
                        int notaEliminadaUsuario = scanner.nextInt();
                        scanner.nextLine();

                        if (notaEliminadaUsuario >= 1 && notaEliminadaUsuario <= notas.size()) {

                            notas.remove(notaEliminadaUsuario - 1);
                            System.out.println("Nota eliminada correctamente.");

                        } else {

                            System.out.println("Número de nota no válido.");

                        }

                    }

                    break;

                // SALIR DEL PROGRAMA
                case 4:
                    System.out.println("Has salido");
                    break;

                // EDITAR NOTA
                case 5:

                    if (notas.isEmpty()) {

                        System.out.println("Lo siento, no hay notas.");

                    } else {

                        System.out.println("¿Qué nota deseas editar?");

                        for (int i = 0; i < notas.size(); i++) {
                            System.out.println("[" + (i + 1) + "] " + notas.get(i));
                        }

                        System.out.print("Introduce el número de la nota que quieres editar: ");
                        int notaEditar = scanner.nextInt();
                        scanner.nextLine();

                        if (notaEditar >= 1 && notaEditar <= notas.size()) {

                            System.out.print("Escribe el nuevo texto de la nota: ");
                            String nuevaNota = scanner.nextLine();

                            notas.set(notaEditar - 1, nuevaNota);

                            System.out.println("Nota editada correctamente.");

                        } else {

                            System.out.println("Número de nota no válido.");

                        }

                    }

                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (eleccionUsuario != 4);

        scanner.close();

    }
}
