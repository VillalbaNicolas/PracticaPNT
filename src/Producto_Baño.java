public class Producto_Baño extends Producto {

    private String marca;
    private int cantidad;


    public Producto_Baño(String nombre, String marca, int cantidad, int precio) {

        super(nombre, precio);
        this.marca = marca;
        this.cantidad = cantidad;
    }


    public String getMarca() {
        return marca;
    }
    public int getCantidad() {
        return cantidad;
    }


    @Override
    public String toString() {

        String mensaje;

        mensaje ="Nombre: " +getNombre() +" " + getMarca() + "   ///   Contenido: " + getCantidad() + "ml" +
                "   ///   Precio: $" + getPrecio();

        return mensaje;
    }


}
