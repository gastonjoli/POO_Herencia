package Herencia;

/*
PASO 2: INDICARLE A JAVA QUE ESTUDIANTE ES UNA
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



}
