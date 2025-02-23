import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static Queue<Cliente> colaClientes = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("1. Agregar cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Mostrar cola de espera");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    agregarCliente();
                    break;
                case 2:
                    atenderCliente();
                    break;
                case 3:
                    mostrarCola();
                    break;
                case 4:
                    System.out.println("Gracias por usar el sistema de atención del banco");
                    break;
                default:
                    System.out.println("Opción no válida vulve a intentarlo.");
            }
        } while (opcion != 4);
    }

    private static void agregarCliente() {
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("¿Es prioritario?: ");
        String esPrioritarioStr = scanner.nextLine().toLowerCase();
        boolean esPrioritario = esPrioritarioStr.equals("s");
        colaClientes.add(new Cliente(nombre, esPrioritario));
        System.out.println("Cliente agregado a la cola."); 
    }

    private static void atenderCliente() {
        if (colaClientes.isEmpty()) {
            System.out.println("No hay clientes en espera.");
        } else {
            Cliente cliente = colaClientes.poll();
            System.out.println("Atendiendo a: " + cliente);
             // Mostrar cuántos clientes quedan en espera
        System.out.println("Clientes restantes en espera: " + colaClientes.size());
        }
    }

    private static void mostrarCola() {
        if (colaClientes.isEmpty()) {
            System.out.println("No hay clientes en espera.");
        } else {
            System.out.println("Clientes en espera:");
            for (Cliente cliente : colaClientes) {
                System.out.println(cliente);
            }
     }
}
}