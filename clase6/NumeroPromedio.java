package clase6;

import java.util.Scanner;

public class NumeroPromedio {
    /*
    Armar un programa que permita cargar 3 números y mostrar cual es el número promedio
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n1,n2,n3;

        System.out.println("Ingrese 3 numeros");
        n1=scanner.nextInt();
        n2=scanner.nextInt();
        n3=scanner.nextInt();

        System.out.println("El promedio de los tres numeros ingresados es: "+(n1+n2+n3)/3);

    }
}
