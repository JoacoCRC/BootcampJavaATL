package clase5;

import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double precioOriginal,precioFinal;
        int porcentajeDesc;

        System.out.println("Ingrese el precio del producto");
        precioOriginal=scanner.nextDouble();
        System.out.println("Ingrese el porcentaje de descuento a aplicar");
        porcentajeDesc=scanner.nextInt();

        precioFinal= precioOriginal - (precioOriginal * porcentajeDesc / 100);
        System.out.println("El precio final para el producto de valor "+precioOriginal+" con un "+porcentajeDesc+"% es de "+precioFinal);
    }
}
