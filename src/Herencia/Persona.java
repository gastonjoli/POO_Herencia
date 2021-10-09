package Herencia;
//PASO1 1:
public class Persona {
    //Atributos

    private String nombre;
    private String apellido;
    private int edad;

    //Creamos metodos getter para cada uno de los atributos
    /*
    TIP : para intellij click derecho /generate/constructor/ctrl+nom-apell-edad
         y nos genera lo siguiente
         */

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

    }
     // Ahora necesitamos crear los metodos getter
        /*
     TIP : para intellij click derecho /generate/getter/ctrl+nom-apell-edad
         y nos genera lo siguiente:
         */

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
}


