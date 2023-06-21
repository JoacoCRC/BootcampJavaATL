package clase7;

import java.util.Scanner;

public class Arreglo {
/*
Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.

Después de realizar el ejercicio anterior, agregar que muestre el número mayor y el número menor.

Ahora, hay que mostrar el promedio. Para hacer esto se suman todos los números y se divide por 5, ya que el usuario agregó 5 números.

 */
    public static void main(String[] args) {
        Integer [] arreglo=new Integer[5];
        Scanner scanner=new Scanner(System.in);

         for(int i=0;i<5;i++){
             System.out.println("Ingrese un numero");
              arreglo[i]=scanner.nextInt();
         }
         for(int i=0;i<5;i++){
            System.out.println(arreglo[i]);
         }
        ////////////////////////////////////////////////////////////////////////////////////////////////

        int mayor=arreglo[0];
        int menor=arreglo[0];

        for(int i=1;i<5;i++){
            if(arreglo[i]>mayor)
                mayor=arreglo[i];
            else
                menor=arreglo[i];
        }

        System.out.println("El numero mayor del arreglo es: "+mayor);
        System.out.println("El numero menor del arreglo es: "+menor);

        ///////////////////////////////////////////////////////////////////////////////////////////////////

        int sum=0;
        for(int i=0;i<5;i++){
            sum+=arreglo[i];
        }
        System.out.println("El promedio del arreglo es: "+sum/5);
    }
}
