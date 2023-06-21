package clase6;

import java.util.Scanner;

public class BuscadorTwitter {
    /*
    Arma un buscador de tweets para Twitter.com. Es bastante similar al anterior.
    Pídele al usuario que ingrese el nombre de una celebridad (de una sola palabra), por ejemplo: “Messi”.
    Después muestra en consola la concatenación de:
    “https://twitter.com/search?q=” + palabra
    */

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String busqueda;
        String buscadorTwitter="https://twitter.com/search?q=";
        System.out.println("Ingrese la busqueda a realizar");
        busqueda=scanner.nextLine();
        StringBuilder busquedaFinal= new StringBuilder();
        int i=0;


        while(i<busqueda.length()) {
            if (busqueda.charAt(i)==' ')
                busquedaFinal.append("%20");
            else
                busquedaFinal.append(busqueda.charAt(i));

            i++;
        }

        System.out.println(buscadorTwitter+busqueda);
        buscadorTwitter+=busquedaFinal;
        System.out.println(buscadorTwitter);

    }

}
