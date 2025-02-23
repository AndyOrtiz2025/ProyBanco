public class Cliente {
    private String nombre; 
    private boolean esPrioritario; 

    // Constructor para crear un nuevo cliente
    public Cliente(String nombre, boolean esPrioritario) {
        this.nombre = nombre;
        this.esPrioritario = esPrioritario;
    }


        // Método para obtener el nombre del cliente
    public String getNombre() {
        return nombre;
    }

    public boolean esPrioritario() {
        return esPrioritario;
    }

    @Override
    public String toString() {
        return nombre + (esPrioritario ? " (Cliente prioritario)" : " (Cliente regular)");
    }
}
