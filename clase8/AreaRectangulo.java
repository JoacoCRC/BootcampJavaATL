package clase8;

import java.util.Scanner;

public class AreaRectangulo {
    /*
    Hacer una función que calcule el área de un cuadrado. Al llamarla debe devolver el área del cuadrado.
     */
    public static void main(String[] args) {
        float ancho;
        float alto;

        ancho=pedirFloat("Ingrese al ancho del rectangulo");
        alto=pedirFloat("Ingrese al alto del rectangulo");

        System.out.println("El area del rectangulo con ancho: "+ancho+" y alto: "+alto+" es de: "+areaRectangulo(ancho,alto));

    }

    private static float pedirFloat(String pedido){
        Scanner scanner=new Scanner(System.in);
        System.out.println(pedido);
        return scanner.nextFloat();
    }

    private static float areaRectangulo(float ancho,float alto){
        return ancho*alto;
    }
}

