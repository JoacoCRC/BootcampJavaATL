package clase6;

import java.util.Scanner;

public class LlamarWhatsapp {
    /*
    Arma un programa que permita llamar a una persona por Whatsapp. Es similar al anterior.
    Pídele al usuario que ingrese un número de telefono sin espacios, por ejemplo: 5493541539405
    Después muestra en consola la concatenación de:
    “https://api.whatsapp.com/send?phone=” + telefono
     */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String numero;
        String  whtasapp="https://api.whatsapp.com/send?phone=";
        System.out.println("Ingrese el numero de la persona a llamar sin espacios. Ej: 5493541539405");
        numero=scanner.nextLine();

        whtasapp+=numero;
        System.out.println(whtasapp);
    }
}
