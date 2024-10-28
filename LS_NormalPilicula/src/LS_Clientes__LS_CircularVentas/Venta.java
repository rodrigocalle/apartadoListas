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
public class Venta {
   private  String prenda;
   private String talla;
   private  double precio;

    public Venta() {
    }

    public Venta(String prenda, String talla, double precio) {
        this.prenda = prenda;
        this.talla = talla;
        this.precio = precio;
    }

    public String getPrenda() {
        return prenda;
    }

    public void setPrenda(String prenda) {
        this.prenda = prenda;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
   
   
   public  void leer(){
       Scanner lee=new Scanner(System.in);
       this.prenda=lee.next();
       this.talla=lee.next();
       this.precio=lee.nextDouble();
   }
   
   public   void mostrar(){
       System.out.println("[ prenda "+prenda+" talla: "+" precio: "+precio);
   }
}
