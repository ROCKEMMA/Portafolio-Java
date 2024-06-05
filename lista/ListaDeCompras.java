package lista;

import opciones.ListaOpciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeCompras {

    // LISTA DE OPCIONES
    public static String[] opciones6 = {"Lista de compras","Salir"};

    // PROGRAMA INICIAL
    public static void programa(){
        // CARGAR OPCIONES
        ListaOpciones.cargarOpciones(opciones6);

        // LEER OPCIÓN
        Scanner opcion = new Scanner(System.in);
        System.out.print("[?]: ");
        int r = opcion.nextInt();

        // ACCIÓN SEGÚN OPCIÓN
        switch (r){
            case 1:
                crearLista();
                break;
            case 2:
                System.out.println("Salir");
                break;
        }

    }

    // OPCION 1 CREAR LISTA DE COMPRAS
    public static void crearLista(){
        // CREAR UNA LISTA VACÍA
        List<String> listaNombre = new ArrayList<>();
        List<Double> listaPrecio = new ArrayList<>();

        // PEDIR UN PRODUCTO Y SU PRECIO
        String rP;
        double rPc;

        for (int i = 1; i<=3;i++){
            Scanner item = new Scanner(System.in);
            System.out.print("Producto: ");
            rP = item.nextLine();
            System.out.print("Precio: ");
            rPc = item.nextDouble();

            // AGREGAR A LA LISTA VACÍA
            listaNombre.add(rP);
            listaPrecio.add(rPc);
        }
        // MOSTRAR LISTA
        System.out.println(listaNombre + "-->" + listaPrecio);
    }

}
