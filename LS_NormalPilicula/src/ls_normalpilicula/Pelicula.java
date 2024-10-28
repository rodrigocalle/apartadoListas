/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ls_normalpilicula;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Pelicula {
    private String titulo;
    private  String director;
    private int duracion ;

    public Pelicula() {
    }
    
    

    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }
    
    
    public void leer() {
        Scanner lee = new Scanner(System.in);
        System.out.println("Datos Pelicula: titulo, director, Duracion");
        this.titulo = lee.nextLine();
        this.director= lee.nextLine();
        this.duracion= lee.nextInt();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public void mostrar(){
        System.out.println("["+"titulo: "+titulo+" Director: "+director+" duracion: "+duracion+ "]");
    }
}
