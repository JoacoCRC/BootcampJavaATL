package clase8;

import java.util.Scanner;

public class AreaTriangulo {
    /*
    Hacer una función que calcule el área de un triángulo. Al llamarla debe devolver el área del triángulo.
     */
    public static void main(String[] args) {
        float base;
        float altura;

        base=pedirFloat("Ingrese base del trinagulo");
        altura=pedirFloat("Ingrese altura del trinagulo");

        System.out.println("El area del triangulo con base: "+base+" y altura: "+altura+" es de: "+areaTriangulo(base,altura));

    }

    private static float pedirFloat(String pedido){
        Scanner scanner=new Scanner(System.in);
        System.out.println(pedido);
        return scanner.nextFloat();
    }

    private static float areaTriangulo(float base,float altura){
        return  base*altura / 2;
    }
}
