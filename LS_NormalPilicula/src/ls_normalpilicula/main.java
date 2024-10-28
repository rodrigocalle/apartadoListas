/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ls_normalpilicula;

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
        LS_NormalP A=new LS_NormalP();
        Pelicula p1=new  Pelicula("Titanic", "Rodrigo", 32);
        Pelicula p2=new  Pelicula("Aro", "Vanessa", 20);
        Pelicula p3=new  Pelicula("Han", "Rodrigo", 2);
        Pelicula p4=new  Pelicula("Halloewen", "Rodrigo", 2);
        Pelicula p5=new  Pelicula("Roboot", "Rodrigo", 4);
        Pelicula p6=new  Pelicula("Roboot", "Alfredo", 18);
        Pelicula p7=new  Pelicula("Roboot", "Rodrigo", 4);
        Pelicula p8=new  Pelicula("Roboot", "Alfredo", 4);
        
        A.adiFinal(p1);
        A.adiFinal(p2);
        A.adiFinal(p3);
        A.adiFinal(p4);
        A.adiFinal(p5);
        A.adiFinal(p6);
        A.adiFinal(p7);
        A.adiFinal(p8);
        
        A.mostrar();
        
        System.out.println("------Agrupar Pelicular por el Director------");
        agruparPeliculaPorDirector(A);
        A.mostrar();
        
        System.out.println("-----Contar las  peliculas  que  tienen  una duracion mayor 12mts");
        contarPeliculasMarorX(A,12);
    }
   static void contarPeliculasMarorX(LS_NormalP A,int x){
        NodoP r=A.getP();
        int nroNodos=A.nroNodos();
        int c=0;
        while(r!=null){
            Pelicula px=r.getQ();
            if(px.getDuracion()>x){
                c++;
            }
            r=r.getSig();
                
        }
        System.out.println("numero de peliculas mayor a: "+x+" es: "+c);
    }
    
    
    static  void agruparPeliculaPorDirector(LS_NormalP A){
        NodoP r=A.getP();
        LS_NormalP nuevaL=new LS_NormalP();
        while(r!=null){
            nuevaL.adiFinal(r.getQ());
            NodoP s=r.getSig();
            NodoP preS=r;
            while(s!=null){
                if(s.getQ().getDirector().equals(r.getQ().getDirector())){
                    nuevaL.adiFinal(s.getQ());
                    preS.setSig(s.getSig());
                    s.setSig(null);
                    s=preS.getSig();
                }
                else{
                    preS=s;
                    s=s.getSig();
                }
            }
            r=r.getSig();
            A.setP(r);
        }
        A.setP(nuevaL.getP());
    }
    
        

    
}
