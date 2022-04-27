/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
-----------------------------------------------------------------
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa
va a tener que contar con muchas personas y muchos perros. El programa deberá
preguntarle a cada persona, que perro según su nombre, quiere adoptar. Dos personas
no pueden adoptar al mismo perro, si la persona eligió un perro que ya estaba adoptado,
se le debe informar a la persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros. */
package ej1relaciones;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class Ej1Relaciones {

    public static void main(String[] args) {
        ArrayList<Persona> listaPersonas = new ArrayList();
        ArrayList<Perro> listaPerro= new ArrayList();
        crearPersonas(listaPersonas);
        crearMascotas(listaPerro);
        adoptarMascota(listaPersonas,listaPerro);
        System.out.println(listaPersonas);
    }
    
    public static ArrayList crearPersonas(ArrayList listaPersonas){
       
       listaPersonas.add(new Persona("Leandro", "Pepito", 30, 33233, null));
       listaPersonas.add(new Persona("Sofia", "Pepito", 20, 1111233, null));
       listaPersonas.add(new Persona("Pepito", "Sofia", 20, 1551233, null));
       listaPersonas.add(new Persona("Alicia", "Pepito", 50, 1111233, null));
       listaPersonas.add(new Persona("Lala", "Pepito", 40, 1111233, null));
       
       return listaPersonas;
    }
    public static ArrayList crearMascotas(ArrayList listaPerro){
        
        listaPerro.add(new Perro("Pichicho", "Caniche", 1, "Chico", false));
        listaPerro.add(new Perro("Firulais", "Caniche", 1, "grande", false));
        listaPerro.add(new Perro("Pepito", "Caniche", 5, "mediano", false));
        listaPerro.add(new Perro("Sancho", "Caniche", 1, "Chico", false));
        listaPerro.add(new Perro("Obama", "Caniche", 1, "Chico", false));
        
        return listaPerro;
    }
    
    public static void adoptarMascota(ArrayList listaPersonas, ArrayList listaPerro){
        Iterator<Persona> it = listaPersonas.iterator();
        Iterator<Perro> it2 = listaPerro.iterator();
        Scanner leer= new Scanner(System.in);
        
        
        while(it.hasNext()){
            boolean adoptar = false;
            Persona p = it.next();
            System.out.println("HOLA " + p.getNombre() + " INGRESE EL NOMBRE DE LA MASCOTA QUE QUIERE ADOPTAR");
            String adopcion= leer.next();
            it2= listaPerro.iterator();
            while(it2.hasNext()){
                Perro pe= it2.next();
                if (adopcion.equals(pe.getNombre()) && pe.isAdoptado()==false)
                {
                    pe.setAdoptado(true);
                    p.setPerro(pe);
                    adoptar=true;
                    System.out.println("FELICIDADES, HAS ADOPTADO A " + pe.getNombre());
                } else if(adopcion.equals(pe.getNombre()) && pe.isAdoptado()==true) {
                    adoptar=true;
                    System.out.println("ESE PERRO YA ESTÁ ADOPTADO");
                } 
            }
            if (adoptar==false)
            {
                System.out.println("PERRO INEXISTENTE");
            }
        }
    }
    
}
