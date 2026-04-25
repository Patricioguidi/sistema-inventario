public class InventarioService {

    public void registrarEgreso(int stockActual, int cantidad) {

        System.out.println("Stock actual: " + stockActual);
        System.out.println("Cantidad a retirar: " + cantidad);

        if (stockActual >= cantidad) {
            int nuevoStock = stockActual - cantidad;

            System.out.println("Egreso realizado correctamente");
            System.out.println("Nuevo stock: " + nuevoStock);

            // Simulación de guardado en base de datos
            System.out.println("Movimiento registrado en MySQL");

        } else {
            System.out.println("Error: stock insuficiente");
        }
    }
}
