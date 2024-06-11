package IMC;

import mis_metodos.ListaOpciones;

import java.util.Scanner;

// FUNCIÓN IMC
public class IMC {

    private static String[] opcionesIMC = {"Información","Calcular"};

    // FUNCIONES
    public static double calcularIMC(double peso,double altura){
        return peso/(altura*altura);
    }

    public static void programaIMC(){

        ListaOpciones.cargarOpciones(opcionesIMC);

        Scanner inputScanner = new Scanner(System.in);
        System.out.print("[?] ");
        int rScanner = inputScanner.nextInt();

        switch (rScanner) {
            case 1:
                System.out.println("Información");
                break;
            case 2:
                System.out.print("[P] ");
                double peso = inputScanner.nextDouble();
                System.out.print("[Am] ");
                double altura = inputScanner.nextDouble();

                double IMC = calcularIMC(peso,altura);

                System.out.println("[IMC] " + IMC);

                System.out.println("----------------------------------------------");
                if (IMC < 18.5){
                    System.out.println("--> IMC Bajo");
                } else if (IMC >18.5 && IMC <24.9) {
                    System.out.println("--> IMC Normal");
                } else if (IMC>25 && IMC<29.9) {
                    System.out.println("--> IMC Sobre peso");
                }else if (IMC>30 && IMC<34.9) {
                    System.out.println("--> IMC Obesidad I");
                }else if (IMC>35 && IMC<39.9) {
                    System.out.println("--> IMC Obesidad II");
                }else if (IMC>40 && IMC<49.9) {
                    System.out.println("--> IMC Obesidad III");
                }else if (IMC>50) {
                    System.out.println("--> IMC Obesidad IV");
                }
                break;
        }
    }
}
