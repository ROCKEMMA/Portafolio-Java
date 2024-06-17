// importar del nombrePaquete.nombreClase
import conversor.Monedas;
import conversor.Longitudes;
import interfaz_grafica.Banner;
import libros.Biblioteca;
import lista.ListaDeCompras;
import calculadora.AritmeticaBasica;
import mis_metodos.ListaOpciones;
import IMC.IMC;
import conversor.ConversosGrados;
import mis_metodos.MisMetodos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] listaDeOpciones = {
                "Calculadora", "Calcular IMC","Farenheit | Celsius", "Conversor de unidades","Calcular edad",
                "Lista de compras","Conversor de Monedas", "Biblioteca", "Opción_9", "Salir"
        };

        boolean programa = true;
        do {
            Banner.mostrarMensaje();
            MisMetodos.imprimirLinea();

            ListaOpciones.cargarOpciones(listaDeOpciones);

            Scanner scanner = new Scanner(System.in);
            System.out.print("[?] ");
            int opcion = scanner.nextInt();

            MisMetodos.imprimirLinea();

            switch (opcion){
                case 1:
                    AritmeticaBasica.programa();
                    break;
                case 2:
                    IMC.programaIMC();
                    break;
                case 3:
                    ConversosGrados.programaGrados();
                    break;
                case 4:
                    Longitudes.programa();
                    break;
                case 5:
                    break;
                case 6:
                    ListaDeCompras.programa();
                    break;
                case 7:
                    Monedas.programa();
                case 8 :
                    Biblioteca.programa();
                case 10:
                    programa = false;
                    break;
            }
        }while (programa);

    }
}