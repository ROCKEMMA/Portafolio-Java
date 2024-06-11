package conversor;

import mis_metodos.ListaOpciones;

import java.util.Scanner;

public class Monedas {

    private static String[] opcionesMonedas = {
            "Quetzales / Dolares", "Dolares / Quetzales",
            "Quetzales / Pesos MX", "Pesos MX / Quetzales"
    };

    public static void programa(){
        ListaOpciones.cargarOpciones(opcionesMonedas);

        Scanner scanner = new Scanner(System.in);
        System.out.print("[?] ");
        String rScanner = scanner.nextLine();

        switch (rScanner){
            case "1":
                System.out.print("[Q] ");
                double rQ1 = scanner.nextDouble();
                System.out.println("[$] " + quetzalesDolares(rQ1));
                break;
            case "2":
                System.out.print("[$] ");
                double rD = scanner.nextDouble();
                System.out.println("[Q] " + dolaresQuetzales(rD));
                break;
            case "3":
                System.out.print("[Q] ");
                double rQ2 = scanner.nextDouble();
                System.out.println("[MX] " + quetzalesPesosMexicanos(rQ2));
                break;
            case "4":
                System.out.print("[MX] ");
                double rMX = scanner.nextDouble();
                System.out.println("[Q] " + pesosMexicanosQuetzales(rMX));
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

    }

    // FUNCIONES
    public static double quetzalesDolares(double quetzales){
        double dolares = quetzales * (1/7.5);
        return dolares;
    }

    public static double dolaresQuetzales(double dolares){
        double quetzales = dolares * 7.5;
        return quetzales;
    }

    public static double pesosMexicanosQuetzales(double pesosMexicanos){
        double quetzales = pesosMexicanos * (1 / 2.5);
        return quetzales;
    }

    public static double quetzalesPesosMexicanos(double quetzales){
        double pesosMexicanos = quetzales * 2.5;
        return pesosMexicanos;
    }

}
