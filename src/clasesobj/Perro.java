/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesobj;

/**
 *
 * @author UCA
 */
public class Perro {

    private Duenio duenio;
    private String nombre;
    private int edad;
    private String raza;
    private String color;
    private String genero;

    public Perro() {

    }

    public Perro(Duenio duenio, String nombre, int edad, String raza, String color, String genero) {
        this.duenio = duenio;
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.color = color;
        this.genero = genero;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;

    }

    public void setNombre(String Nombre) {
        this.nombre = nombre;

    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Duenio getDuenio() {
        return this.duenio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void ladrar() {
        System.out.println("WOOF! WOOF! WOOF!");
    }

}
