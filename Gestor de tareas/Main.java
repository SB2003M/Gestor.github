import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce tu correo: ");
        String correo = scanner.nextLine();

        System.out.print("Introduce tu contraseña: ");
        String contraseña = scanner.nextLine();

        System.out.print("Introduce la descripción de la tarea: ");
        String descripcion = scanner.nextLine();

        System.out.print("Introduce la categoría de la tarea: ");
        String categoria = scanner.nextLine();

        System.out.print("Introduce el recordatorio de la tarea: ");
        String recordatorio = scanner.nextLine();

        System.out.print("Introduce la notificación de la tarea: ");
        String notificacion = scanner.nextLine();

        // Crea instancias de las clases
        Tarea tarea1 = new Tarea(descripcion, categoria, recordatorio, notificacion);
        Usuario usuario1 = new Usuario(nombre, correo, contraseña);
        usuario1.agregarTarea(tarea1);

        // ...
    }
}
