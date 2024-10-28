/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LS_Clientes__LS_CircularVentas;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Cliente {
    private String nombre;
    private int nroCompras;

    public Cliente() {
    }
    
    
    public Cliente(String nombre, int nroCompras) {
        this.nombre = nombre;
        this.nroCompras = nroCompras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroCompras() {
        return nroCompras;
    }

    public void setNroCompras(int nroCompras) {
        this.nroCompras = nroCompras;
    }
    
    public   void leer(){
        Scanner lee=new Scanner(System.in);
        this.nombre =lee.next();
        this.nroCompras =lee.nextInt();
    }
    
    public  void mostrar(){
        System.out.println("[nombre "+nombre+" nroClientes "+"]");
    }
    
}
