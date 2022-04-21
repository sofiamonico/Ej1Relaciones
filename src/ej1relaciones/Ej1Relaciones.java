/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package ej1relaciones;

import entidades.Perro;
import entidades.Persona;

/**
 *
 * @author Leandro
 */
public class Ej1Relaciones {

    public static void main(String[] args) {
        
        Perro m1 = new Perro("Pichicho", "Caniche", 1, "Chico");
        Perro m2 = new Perro("Firulais", "Callejero", 2, "Mediano");
        
        Persona p1 = new Persona("Leandro", "Pepito", 30, 342423, m1);
        Persona p2 = new Persona("Sofia", "Pepita", 25, 2323223, m2);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
    
}
