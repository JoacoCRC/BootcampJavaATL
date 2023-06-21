package clase6;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {
    /*
    Escribe un programa que permita al usuario jugar el juego clásico de "piedra, papel, tijeras" contra la computadora.
    El programa debe solicitar al usuario que ingrese su elección (piedra, papel o tijeras) y luego generar una
    elección aleatoria para la computadora.
    Después de eso, el programa debe determinar el ganador según las reglas del juego y mostrar el resultado.
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int comp=random.nextInt(3)+1;

        String seleccionPersona;
        String seleccionComputadora;

        System.out.println("Ingrese su eleccion(piedra, papel o tijera)");
        seleccionPersona=scanner.nextLine();
        while(!seleccionPersona.equals("piedra") && !seleccionPersona.equals("papel") && !seleccionPersona.equals("tijera")){
            System.out.println("Eleccion mal ingresada, por favor escriba piedra, papel o tijera");
            seleccionPersona=scanner.nextLine();
        }
        if(comp==1)
            seleccionComputadora="piedra";
        else if(comp==2)
            seleccionComputadora="papel";
        else
            seleccionComputadora="tijera";

        System.out.println("Juegas "+seleccionPersona+"\nLa computadora juega "+seleccionComputadora);

        if(seleccionComputadora.equals(seleccionPersona))
            System.out.println("Hay empate");
        else{
            if(seleccionComputadora.equals("piedra")){
                if(seleccionPersona.equals("tijera"))
                    System.out.println("Gana la computadora");
                else
                    System.out.println("Has ganado");
            }else if(seleccionComputadora.equals("papel")){
                if(seleccionPersona.equals("tijera"))
                    System.out.println("Has ganado");
                else
                    System.out.println("Gana la computadora");
            }else{
                if(seleccionPersona.equals("papel"))
                    System.out.println("Gana la computadora");
                else
                    System.out.println("Has ganado");
            }
        }

    }
}
