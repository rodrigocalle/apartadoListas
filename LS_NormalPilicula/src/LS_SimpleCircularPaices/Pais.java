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
public class Pais {
    private String nom;
    private String idiomaoficial;

    public Pais() {
    }
    
    
    
    public Pais(String nom, String idiomaoficial) {
        this.nom = nom;
        this.idiomaoficial = idiomaoficial;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getIdiomaoficial() {
        return idiomaoficial;
    }

    public void setIdiomaoficial(String idiomaoficial) {
        this.idiomaoficial = idiomaoficial;
    }
    
    public void leer() {
        Scanner lee = new Scanner(System.in);
        System.out.println("Datos persona: nombre, IdiomaOficial");
        this.nom = lee.next();
        this.idiomaoficial = lee.next();
    }
    
    public void mostrar(){
        System.out.println("["+"nomPais "+nom+" idiomaoficial: "+idiomaoficial+"]");
    }
}
