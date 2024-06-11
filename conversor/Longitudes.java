package conversor;

import mis_metodos.ListaOpciones;

import java.util.Scanner;

public class Longitudes {

    private static String[] opcionesLongitudes = {
            "Metros > Kilómetros", "Kilómetros > Metros",
            "Metros > Millas", "Millas > Metros",
            "Centímetros > Pulgadas", "Pulgadas > Centímetros"
    };

    public static void programa(){
        ListaOpciones.cargarOpciones(opcionesLongitudes);

        Scanner scanner = new Scanner(System.in);
        System.out.print("[?] ");
        String rScanner = scanner.nextLine();

        switch (rScanner){
            case "1":
                System.out.print("[m] ");
                double rM1 = scanner.nextDouble();
                System.out.println("[km] " + metrosKilometros(rM1));
                break;
            case "2":
                System.out.print("[km] ");
                double rKm = scanner.nextDouble();
                System.out.println("[m] " + kilometrosMetros(rKm));
                break;
            case "3":
                System.out.print("[m] ");
                double rM2 = scanner.nextDouble();
                System.out.println("[mi] " + metrosMillas(rM2));
                break;
            case "4":
                System.out.print("[mi] ");
                double rMi = scanner.nextDouble();
                System.out.println("[m] " + millasMetros(rMi));
                break;
            case "5":
                System.out.print("[cm] ");
                double rCm = scanner.nextDouble();
                System.out.println("[in] " + centimetrosPulgadas(rCm));
                break;
            case "6":
                System.out.print("[in] ");
                double rIn = scanner.nextDouble();
                System.out.println("[cm] " + pulgadasCentimetros(rIn));
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

    }

    // FUNCIONES
    public static double metrosKilometros(double metros){
        return metros / 1000;
    }

    public static double kilometrosMetros(double kilometros){
        return kilometros * 1000;
    }

    public static double metrosMillas(double metros){
        return metros / 1609.34;
    }

    public static double millasMetros(double millas){
        return millas * 1609.34;
    }

    public static double centimetrosPulgadas(double centimetros){
        return centimetros / 2.54;
    }

    public static double pulgadasCentimetros(double pulgadas){
        return pulgadas * 2.54;
    }

}
