/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LS_SimpleCircularPaices;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Idioma {
    private  String idioma;
    private  int nroHavitantes;

    public Idioma() {
    }

    public Idioma(String idioma, int nroHavitantes) {
        this.idioma = idioma;
        this.nroHavitantes = nroHavitantes;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getNroHavitantes() {
        return nroHavitantes;
    }

    public void setNroHavitantes(int nroHavitantes) {
        this.nroHavitantes = nroHavitantes;
    }
    
    public  void leer(){
        Scanner lee = new Scanner(System.in);
        System.out.println("Datos persona: nombre, nroHavitantes");
        this.idioma = lee.next();
        this.nroHavitantes = lee.nextInt();
    }
    
    public  void mostrar(){
        System.out.println("["+"Idioma: "+idioma+"nroHabitantes: "+nroHavitantes+"]");
    }
}
