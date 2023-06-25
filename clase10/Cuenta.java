package clase10;




/*
Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular (que es una persona) y cantidad (puede tener decimales).
Construye los siguientes métodos para la clase:
    Un constructor, donde los datos pueden estar vacíos.
    Los setters y getters para cada uno de los atributos. El atributo no se puede modificar directamente, sólo ingresando o retirando dinero.
    mostrar(): Muestra los datos de la cuenta.
    ingresar(cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
    retirar(cantidad): se retira una cantidad a la cuenta. La cuenta puede estar en números rojos.

 */
public class Cuenta {
    private Persona titular;
    private Float cantidad;

    public Cuenta(Persona titular) {
        this.titular = titular;
        this.cantidad = 0.0f;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public Float getCantidad() {
        return cantidad;
    }

    public void setCantidad(Float cantidad){
        this.cantidad=cantidad;
    }

    public void ingresar(Float cantidad){
        if(cantidad>0)
            this.cantidad+=cantidad;
    }

    public void retirar(Float cantidad){
        this.cantidad-=cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular=" + titular +
                ", cantidad=" + cantidad +
                '}';
    }
}
