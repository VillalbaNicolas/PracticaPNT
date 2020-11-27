public class Bebida extends Producto{

    private double litros;
    private String tipo;


    public Bebida(String nombre, int precio, double litros) {
        super(nombre, precio);
        this.litros=litros;

    }

    public Bebida(String nombre, String tipo, int precio, double litros ) {
        super(nombre, precio);
        this.litros = litros;
        this.tipo = tipo;
    }



    public double getLitros() {
        return litros;
    }
    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        String mensaje;
        String mensa_aux;
        if(tipo!=null){
            mensa_aux = " " + getTipo();
        }else
            mensa_aux = "";

        mensaje =  "Nombre: " + getNombre() + mensa_aux + "   ///   Litros: " + getLitros() +
                "   ///   Precio: $" + getPrecio();



        return  mensaje;
    }



}
