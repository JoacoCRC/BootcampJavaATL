package clase6;

import java.util.Scanner;

public class BuscadorPaises {

    /*
    Arma un buscador de países con Google Maps.
    Primero, pidele al usuario que ingrese un país (Ej: Colombia).
    Después muestra en consola la concatenación de:
    “https://www.google.com/maps/search/” + pais
    Entonces, cuando hagas click en el link que aparece en consola, te abrirá esa ubicación.
    */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String pais;
        String  googleMaps="https://www.google.com/maps/search/";

        System.out.println("Ingrese el nombre del pais a buscar");
        pais=scanner.nextLine();


        pais= pais.substring(0,1).toUpperCase()+pais.substring(1).toLowerCase();

        googleMaps+=pais;
        System.out.println(googleMaps);


    }
}
