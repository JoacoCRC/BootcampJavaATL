package clase6;

import java.util.Scanner;

public class MayorMenor {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n1,n2,n3;
        int mayor,menor;

        System.out.println("Ingrese 3 numeros");
        n1=scanner.nextInt();
        mayor=n1;
        menor=n1;
        n2=scanner.nextInt();
        if(n2>mayor)
            mayor=n2;
        else
            menor=n2;
        n3=scanner.nextInt();
        if(n3>mayor)
            mayor=n3;
        else if(n3<menor)
            menor=n3;

        System.out.println("El numero mas grande es: "+mayor+" y el mas chico es: "+menor);

    }
}
