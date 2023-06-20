package clase5;

import java.util.Scanner;

public class EdadPerros {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int edadHumana,edadPerruna;

        System.out.println("Ingrese su edad en años ");
        edadHumana=scanner.nextInt();

        edadPerruna=edadHumana*7;

        System.out.println("Su edad en años de perro es: "+edadPerruna);
    }
}
