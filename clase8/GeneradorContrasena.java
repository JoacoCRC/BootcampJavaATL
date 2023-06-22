package clase8;

import java.util.Random;
import java.util.Scanner;

public class GeneradorContrasena {
    /*
    Crear una función que sea un generador de contraseñas. Al llamarla debe devolver una contraseña
    (por ejemplo, puedes utilizar Math.random() para devolver un número aleatorio que podría ser una contraseña.
     */
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int length;

        System.out.println("Ingrese la cantidad de caracteres que quiere en su contraseña");
        length=scanner.nextInt();
        System.out.println("La contraseña generada con "+length+" caracteres es: "+generarContrasena(length));
    }

    private static String generarContrasena(int length){
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            sb.append(randomChar);
        }

        return sb.toString();
    }
}
