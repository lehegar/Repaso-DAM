import java.util.Scanner;

public class Contrasena {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Introduce la contraseña elegida:?");
        String respuestaUsuario = scanner.nextLine();

        int longitudContrasenaUsuario = respuestaUsuario.length();

        boolean tieneMayuscula = false;
        boolean tieneNumero = false;


        for (int i = 0; i < respuestaUsuario.length(); i++) {
            char caracteres = respuestaUsuario.charAt(i);

            if (Character.isUpperCase(caracteres)) {
                tieneMayuscula = true;
            }

            if (Character.isDigit(caracteres)) {
                tieneNumero = true;
            }  
        }

        if (longitudContrasenaUsuario < 8) {
            System.out.println("Contraseña no válida, necesitas al menos 8 carácteres");
        }

        
        if (!tieneMayuscula) {
            System.out.println("Contraseña no válida, necesitas al menos 1 mayuscula");
        }

        if (!tieneNumero) {
            System.out.println("Contraseña no válida, necesitas al menos 1 número");
        }

      if (tieneNumero && tieneMayuscula && longitudContrasenaUsuario >= 8) {
        System.out.println("Contraseña correcta");
        }

        scanner.close();
    
}}
