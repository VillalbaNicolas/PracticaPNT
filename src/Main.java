/*
Ejercicio Escuelita Somos PNT


Imaginemos un supermercado de barrio.


Crear un programa cuyo punto de entrada sea un main en donde, al ejecutarse,
se visualiza lo siguiente por consola y se termina la ejecución:



Nombre: Coca-Cola Zero /// Litros: 1.5 /// Precio: $20

Nombre: Coca-Cola /// Litros: 1.5 /// Precio: $18

Nombre: Shampoo Sedal /// Contenido: 500ml /// Precio: $19

Nombre: Frutillas /// Precio: $64 /// Unidad de venta: kilo

=============================

Producto más caro: Frutillas

Producto más barato: Coca-Cola


La solución debe cumplir con los siguientes requisitos:

-Diseñar una solución orientada a objetos.

-La salida es por consola y exactamente como se requiere.

-Usar solamente las clases provistas por Java 8..

-Cargar la lista de productos en un único método. No hay ingreso por pantalla de ningún tipo.

-El algoritmo usado para la impresión no tiene que depender de la cantidad o tipo de productos.

-Para mostrar el mayor / menor, utilizar la interfaz Comparable.

-Para imprimir por pantalla, sobrescribir el método toString()

 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Producto producto1 = new Bebida("Coca-Cola", 20, 1.5);
        Producto producto2 = new Bebida("Coca-Cola", "Zero", 18, 1.5);
        Producto producto3 = new Producto_Baño("Shampoo", "Sedal", 500, 19);
        Producto producto4 = new Frutas("Frutillas", 64, "Kilo");

        ArrayList<Producto> lista = new ArrayList<>();
        lista.add(producto1);
        lista.add(producto2);
        lista.add(producto3);
        lista.add(producto4);


        Producto productoCaro = null;
        Producto productoBarato = null;





        for (int i = 0; i < lista.size(); i++) {

            if (i < lista.size() - 1) {
                if (lista.get(i).compareTo(lista.get(i + 1)) == 1) {
                    if (i == 0) {
                        productoCaro = lista.get(i);
                        productoBarato = lista.get(i + 1);
                    } else {
                        if (productoBarato.getPrecio() > lista.get(i + 1).getPrecio()) {
                            productoBarato = lista.get(i + 1);
                        }
                        if (productoCaro.getPrecio() < lista.get(i + 1).getPrecio()) {
                            productoCaro = lista.get(i + 1);
                        }
                    }
                } else if (lista.get(i).compareTo(lista.get(i + 1)) == -1) {
                    if (i == 0) {
                        productoCaro = lista.get(i + 1);
                        productoBarato = lista.get(i + 1);
                    } else {
                        if (productoCaro.getPrecio() < lista.get(i + 1).getPrecio()) {
                            productoCaro = lista.get(i + 1);
                        }
                        if (productoBarato.getPrecio() > lista.get(i + 1).getPrecio()) {
                            productoBarato = lista.get(i + 1);
                        }
                    }
                } else continue;
            }System.out.println(lista.get(i).toString());
        }
        System.out.println("\nProducto mas Caro: " +productoCaro.getNombre() + "\nProducto mas Barato: " + productoBarato.getNombre() );



    }




}
