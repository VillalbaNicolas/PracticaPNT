public class Frutas extends Producto {

    private String formaCobro;

    public Frutas(String nombre, int precio, String formaCobro) {

        super(nombre, precio);
        this.formaCobro = formaCobro;
    }


    public String getFormaCobro() {
        return formaCobro;
    }

    @Override
    public String toString() {
        String mensaje;
        mensaje = "Nombre: " + getNombre() + "    ///   Precio: $" + getPrecio() +
                "  ///   Unidad de Venta: " + getFormaCobro();
        return mensaje;
    }
}


