package matematicas;

import opciones.ListaOpciones;

import java.util.Scanner;

public class Mate {
    public static String[] opciones = {"Sumar","Restar","Dividir","Multiplicar"};

    // FUNCIONES
    public static double sumar(double a,double b){ return a+b; }
    public static double restar(double a,double b){ return a-b; }
    public static double dividir(double a,double b){ return a/b; }
    public static double multiplicar(double a,double b){ return a*b; }

    // MÉTODO
    public static void programa(){
        System.out.println("[ MATEMÁTICAS ]");
        ListaOpciones.cargarOpciones(Mate.opciones);

        Scanner intoDato = new Scanner(System.in);
        System.out.print("[?]: ");
        int dato = intoDato.nextInt();

        System.out.println();
        System.out.print("num1: ");
        double num1 = intoDato.nextInt();
        System.out.print("num2: ");
        double num2 = intoDato.nextDouble();

        double r = 0;

        switch (dato){
            case 1:
                r = sumar(num1,num2);
                break;
            case 2:
                r = restar(num1,num2);
                break;
            case 3:
                r = dividir(num1,num2);
                break;
            case 4:
                r = multiplicar(num1,num2);
                break;
        }
        System.out.println("[R] "+"Resultado: "+ r+ "\n");
        System.out.println("----------------------------------------------");
    }
}
