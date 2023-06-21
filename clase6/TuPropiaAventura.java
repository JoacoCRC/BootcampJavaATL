package clase6;

import java.util.Scanner;

public class TuPropiaAventura {
    /*
    Crear un programa que cuente una historia al estilo de “Elige tu propia Aventura”.

    Los libros de “Elige tu propia aventura” eran historias interactivas, en el que el lector en un momento podía elegir a qué página ir. El ejercicio consiste en hacer un pequeño cuento de este estilo. Por ejemplo:


    Es una noche estrellada, te encuentras en un bosque misterioso:
    1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante
    2) Sigues el sendero iluminado hacia una pequeña cabaña acogedora

    El usuario escoge “2”:
    Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora. Al llegar a la cabaña, te das cuenta de que hay dos puertas:
    1) Entras por la puerta de la izquierda
    2) Optas por la puerta de la derecha

    El usuario escoge “1”:
    Al abrir la puerta de la izquierda, te encuentras con una habitación llena de tesoros brillantes y mágicos. Te maravillas con las joyas y los objetos preciosos que llenan la sala. Te das cuenta de que has encontrado el legendario tesoro perdido del bosque. Con tu corazón lleno de emoción y riquezas, decides regresar a casa para compartir tu increíble aventura con el mundo. ¡Felicidades, has tenido un final exitoso en tu búsqueda!
     */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int respuesta=0;

        System.out.println("Es una noche estrellada, te encuentras en un bosque misterioso: \n" +
                        "1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante \n" +
                "2) Sigues el sendero iluminado hacia una pequeña cabaña acogedora\n");
        while(respuesta!=1 && respuesta!=2){
           respuesta= scanner.nextInt();
        }
        if(respuesta==1){
            System.out.println("Al abrir la puerta de la izquierda, te encuentras con una habitación llena de tesoros brillantes y mágicos. \nTe maravillas con las joyas y los objetos preciosos que llenan la sala. \nTe das cuenta de que has encontrado el legendario tesoro perdido del bosque. \nCon tu corazón lleno de emoción y riquezas, decides regresar a casa para compartir tu increíble aventura con el mundo. \n¡Felicidades, has tenido un final exitoso en tu búsqueda!");

        }else{
            System.out.println("Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora. Al llegar a la cabaña, te das cuenta de que hay dos puertas:\n" +
                    "    1) Entras por la puerta de la izquierda\n" +
                    "    2) Optas por la puerta de la derecha");
            respuesta=0;
            while(respuesta!=1 && respuesta!=2){
                respuesta= scanner.nextInt();
            }
            if(respuesta==1){
                System.out.println("FIN CAMINO IZQUIERDA");
            }else{
                System.out.println("FIN CAMINO DERECHA");

            }
        }

    }

}
