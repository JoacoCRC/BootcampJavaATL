package clase10;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona persona1=new Persona(1,"Joaquin Acuna", LocalDate.of(1998,7,4),"41306816");

        System.out.println(persona1);
        if(persona1.isMayorEdad())
            System.out.println("Es mayor de edad");
        else
            System.out.println("No es mayor de edad");

        //----------eliminar los warnings----------------
        Integer entero=persona1.getId();
        persona1.setId(entero);

        entero=persona1.getEdad();
        persona1.setEdad(entero);

        String cadena=persona1.getNombre();
        persona1.setNombre(cadena);

        cadena=persona1.getDni();
        persona1.setDni(cadena);

        LocalDate date=persona1.getFechaNacimiento();
        persona1.setFechaNacimiento(date);

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Cuenta cuenta1=new Cuenta(persona1);
        System.out.println(cuenta1);
        cuenta1.retirar(500.0f);
        System.out.println(cuenta1 );
        cuenta1.ingresar(1000.0f);
        System.out.println(cuenta1);

        //----------eliminar los warnings----------------
        Persona persona=cuenta1.getTitular();
        cuenta1.setTitular(persona);

        Float decimal=cuenta1.getCantidad();
        cuenta1.setCantidad(decimal);

    }
}
