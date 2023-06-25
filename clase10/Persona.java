package clase10;

import java.time.LocalDate;
import java.time.Period;

/*
Vamos a crear una clase llamada Persona. Sus atributos son: id, nombre, edad, fecha de nacimiento y DNI.
Construye los siguientes métodos para la clase:
    Un constructor, donde los datos pueden estar vacíos.
    Los setters y getters para cada uno de los atributos.
    mostrar(): Muestra los datos de la persona.
    esMayorDeEdad(): Devuelve un valor lógico indicando si es mayor de edad.

 */

public class Persona {
    private Integer id;
    private String nombre;
    private Integer edad;
    private LocalDate fechaNacimiento;
    private String dni;

    public  Persona(Integer id, String nombre, LocalDate nacimiento,String dni){
        this.id=id;
        this.nombre=nombre;
        this.fechaNacimiento=nacimiento;
        this.dni=dni;
        this.edad=getEdad();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getEdad(){
        LocalDate fechaActual= LocalDate.now();
        Period periodo= Period.between(this.fechaNacimiento,fechaActual);
        this.edad=periodo.getYears();

        return this.edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean isMayorEdad(){
        return getEdad()>=18;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", fechaNacimiento=" + fechaNacimiento +
                ", dni='" + dni + '\'' +
                '}';
    }
}
