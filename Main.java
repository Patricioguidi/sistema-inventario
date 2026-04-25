public class Main {

    public static void main(String[] args) {

        InventarioService servicio = new InventarioService();

        // Simulación de egreso
        servicio.registrarEgreso(10, 3);
    }
}
