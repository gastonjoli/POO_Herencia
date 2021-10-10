package Herencia;

/*
PASO 2: Debemos INDICARLE A JAVA QUE ESTUDIANTE ES UNA
CLASE HIJA DE PERSONA con la palabra EXTENDS.
de la siguiente forma:
 */
public class Estudiante extends Persona{
    private int codigoEstudiante;
    private float notaFinal;

//PASO 3 : Crear un constructor especial ya que es una clase hija.

    public Estudiante(String nombre,String apellido,int edad,int codigoEstudiante,float notaFinal){
        super(nombre,apellido,edad); // Le decimos a java con SUPER que nom apell y edad ya estan inicializados.

        // lo que si falta inicializar son los atributos extras que tiene estudiante:

        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
     }
     /*
     Cuando quiero llamar a mi atributos nombre, apellido y edad
     veremos que no se puede porque no pertenece a esta clase por
     lo que tenemos que utilizarlos métodos getter de la
     clase persona linea 30 - 31 -32.
     Una vez terminados de poner los datos de la clase persona
     poner los atributos que solo pertenecen a estudiante sin
     usar los getter porque como son de la misma clase podemos
     ponerlo directo LINEAS 33 y 34.
      */
     public void mostrardatos(){
         System.out.println("Nombre del estudiante: "+getNombre()+
                 "\nApellido: "+getApellido()+
                 "\nEdad: "+getEdad()+
                 "\nCodigo Estudiante:"+codigoEstudiante+
                 "\nNota Final: "+notaFinal);

     }

}
