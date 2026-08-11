import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Agenda {
    public static void main(String[] args) {

        HashMap<String, String> agenda = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int respuestaUsuario = 0;

        while (respuestaUsuario != 5){

            System.out.println("1. Añadir contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Mostrar todos");
            System.out.println("5. Salir");
            respuestaUsuario = sc.nextInt();
            sc.nextLine();
            

            switch (respuestaUsuario) {
                case 1:
                    System.out.println("Escribe el nombre:");
                    String nombreAgenda = sc.nextLine();

                    System.out.println("Escribe el número");
                    String numeroAgenda = sc.nextLine();

                    agenda.put(nombreAgenda, numeroAgenda);
                    break;

                case 2:
                    System.out.println("Escribe el nombre:");
                    String nombreBuscar = sc.nextLine();

                    if(!agenda.containsKey(nombreBuscar)) {
                        System.out.println("El contacto no existe.");
                    } 
                    else {System.out.println("El telefono es:" + "" + agenda.get(nombreBuscar));}

                    break; 
                
                case 3:

                    System.out.println("Escribe el nombre a eliminar:");
                    String nombreEliminar = sc.nextLine();

                    if(!agenda.containsKey(nombreEliminar)) {
                        System.out.println("El contacto no existe.");
                    } 
                    else {
                        agenda.remove(nombreEliminar);
                        System.out.println(nombreEliminar + " ha sido eliminado.");
                        }

                    

                    break;

                case 4:

                    for (Map.Entry<String, String> datos : agenda.entrySet()) {

                        System.out.println(datos.getKey() + ": " + datos.getValue());

        

                 }

                 break;

               


            
            
        }

        }

  

    }
}