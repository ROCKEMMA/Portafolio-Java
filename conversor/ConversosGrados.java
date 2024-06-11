package conversor;
import mis_metodos.ListaOpciones;

import java.util.Scanner;

public class ConversosGrados {
    private  static String[] opciones = {
            "fahrenheit/celsius",
            "celsius/fahrenheit"
    };

    public static double cAf(double gradosC){
        return (gradosC - 32) * 5/9;
    }
    public static double fAc(double gradosF){
        return (gradosF * 9/5) + 32;
    }

    public static void programaGrados(){
        ListaOpciones.cargarOpciones(opciones);

        Scanner intoDato = new Scanner(System.in);
        System.out.print("[?]: ");
        int opcion = intoDato.nextInt();

        if(opcion==1){
            System.out.print("[F]: ");
        }else if (opcion==2) {
            System.out.print("[C]: ");
        }else {
            System.out.println("Opción no disponible");
        }

        double grados = intoDato.nextDouble();
        double cAf = opcion == 1 ? fAc(grados) : cAf(grados);

        System.out.print("[R]: " + cAf+ "\n");
        System.out.println("▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪▪\n");
    }
}
