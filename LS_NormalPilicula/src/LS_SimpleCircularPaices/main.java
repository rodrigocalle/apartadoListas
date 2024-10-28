/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LS_SimpleCircularPaices;

/**
 *
 * @author rodri
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pais p1=new Pais("Peru", "Castellano");
        Pais p2=new Pais("Bolivia", "Castellano");
        Pais p3=new Pais("Brasil","Portuges");
        Pais p4=new Pais("Colombia", "Castellano");
        
        
        Idioma i1=new Idioma("Castellano", 20);
        Idioma i2=new Idioma("Castellano", 45);
        Idioma i3=new Idioma("Portuges", 20);
        Idioma i4=new Idioma("Ingles", 10);
        
        LS_NormalIdioma B=new LS_NormalIdioma();
        B.adiFinal(i1);
        B.adiFinal(i2);
        B.adiFinal(i3);
        B.adiFinal(i4);
        System.out.println("------IDIOMAS-------");
        B.mostrar();
        
        
        LS_CircularPais A=new LS_CircularPais();
        A.adiFinal(p1);
        A.adiFinal(p2);
        A.adiFinal(p3);
        A.adiFinal(p4);
        System.out.println("-----Paices--------");
        A.mostrar();
        
        System.out.println("----Mostrar los paices que tienen como idioma oficial i-esima de la lista------");
        mostrarPicesIdioma(A,2);
        
        System.out.println("-------c) contar cuantos paises hablan el idioma X y  el numero de   hablantes----");
        //contarCuantosPaicesHablanIdiomaXyNumHavitantes(A);
        
    }
    //static void contarCuantosPaicesHablanIdiomaXyNumHavitantes(LS_CircularPais A)
    
    
    static void mostrarPicesIdioma(LS_CircularPais A, int x) {
        NodoPais r = A.getP();
        int c = 0;
        while (r.getSig() != A.getP()) {
            Pais px = r.getQ();
            if (c == x) {
                px.mostrar();
            }
            c++;
            r = r.getSig();
        }
    }
    
    
    
}
