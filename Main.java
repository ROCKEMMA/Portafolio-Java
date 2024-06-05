// importar del nombrePaquete.nombreClase
import interfaz_grafica.Banner;
import lista.ListaDeCompras;
import matematicas.Mate;
import opciones.ListaOpciones;
import programas.IMC;
import grados.ConversosGrados;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // LISTA DE OPCIONES
        String[] listaDeOpciones = {
                "Calculadora", "IMC","Farenheit / Celsius", "Calcular edad","Grados",
                "Lista de compras","Opción_7", "Opción_8", "Opción_9", "Salir"
        };

        boolean programa = true;
        do {
            Banner.mensaje();

            ListaOpciones.cargarOpciones(listaDeOpciones);

            Scanner intOpcion = new Scanner(System.in);
            System.out.print("[?]: ");
            int opcion = intOpcion.nextInt();
            System.out.println("----------------------------------------------");

            // OPCIONES
            switch (opcion){
                case 1:
                    Mate.programa();
                    break;
                case 2:
                    IMC.programaIMC();
                    break;
                case 3:
                    ConversosGrados.programaGrados();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    ListaDeCompras.programa();
                    break;
                case 10:
                    programa = false;
                    break;
            }
        }while (programa);

    }
}