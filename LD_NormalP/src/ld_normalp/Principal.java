//Lic Aruquipa Marcelo
package ld_normalp;

public class Principal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("nombre: Marcelo Aruquipa");
        System.out.println("tema: Listas dobles normalesn\n");

        LD_NormalProy A = new LD_NormalProy();

        System.out.println("Lista vacia: ");
        System.out.println(A.esVacia());

        System.out.println("nro de nodos: ");
        System.out.println(A.nroNodos());

        System.out.println("\nadicionando como primero: ");
        Proyecto z1 = new Proyecto("tienda", "willy", "monica");
        Proyecto z2 = new Proyecto("juego", "ana", "bryan");
        Proyecto z3 = new Proyecto("uml", "jose", "adrian");
        Proyecto z4 = new Proyecto("oop", "alan", "jorge");

        A.adiPrimero(z1);
        A.adiPrimero(z2);
        A.adiPrimero(z3);
        A.adiPrimero(z4);

        A.mostrar();
       
        
        System.out.println("b) -----VERIFICA SI  EXISTE ALGUN PROYECTO  CON  EL PARTICIPANTE DE NOMX-----");
        verivircaSExisteParTiciPanteDenomX(A,"willy");
        System.out.println("___c) llevar al   final  de la  lista el  el primer nodo___");
    }
    
    static  void verivircaSExisteParTiciPanteDenomX(LD_NormalProy lp,String nomx){
        NodoProy R=lp.getP();
        while(R!=null){
            if(R.getProy().getNom1().equals(nomx)||R.getProy().getNom2().equals(nomx)){ 
                System.out.println("_____SI EXSISTE EL PARTIIPANTEN -----------"+nomx);
            }
            R=R.getSig();
        }
        
    }
    
    
    
}
