package Iniciar;
public class Principal {
    /**
     * Complejidad temporal: O(1) Tiempo constante
     */
    public static void main(String[] args) {
        System.out.print("Usuario, direcion y lista de pedidos:");
        Cliente Usuario1 = new Cliente("Juan", "avenida 68");

        System.out.print("Ingrese su direccion de envio:");

        Producto telefono = new Producto("Iphone", "Telefono Inteligente", 3000000, 100);
        Producto laptop = new Producto("Hp", "Portatil de ultima generacion", 5000000, 56);
        Producto accesorio = new Producto("Funda", "Color azul 15x6 cm", 20000, 468);

    }
}
