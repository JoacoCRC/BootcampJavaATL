package clase5;

import java.util.Scanner;

public class ConversorMillasAKm {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double millas,km;

        System.out.println("Ingrese un numero de millas ");
        millas=scanner.nextDouble();

        km=millas*1.60934;

        System.out.println(millas+" millas equivalen a "+km+" kilometros");
    }
}
