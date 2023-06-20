package clase5;

import java.util.Scanner;

public class CalculadoraPropina {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double totalCuenta,totalFinal;
        int porcentajePropina;

        System.out.println("Ingrese el total de la cuenta ");
        totalCuenta= scanner.nextDouble();

        System.out.println("Ingrese el porcentaje de propina deseado ");
        porcentajePropina= scanner.nextInt();

        totalFinal= totalCuenta+ (totalCuenta * porcentajePropina / 100);
        System.out.println("El precio final de la cuenta es de "+totalFinal);

    }
}
