package clase5;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinarNumero {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        boolean adivinado=false;
        Random random=new Random();
        int numero= random.nextInt(101);
        int numeroIngresado;

        System.out.println("Adivine el numero entre el 0 y el 100");
        numeroIngresado=scanner.nextInt();

        while(!adivinado){
            if(numero==numeroIngresado)
                adivinado=true;
            else{
                if(numero>numeroIngresado)
                    System.out.println("Numero incorrecto, el numero es mayor al ingresado");
                else
                    System.out.println("Numero incorrecto, el numero es menor al ingresado");

                System.out.println("Ingrese otro numero");
                numeroIngresado=scanner.nextInt();
            }
        }

        System.out.println("Adivinaste el numero!!!!");

    }
}
