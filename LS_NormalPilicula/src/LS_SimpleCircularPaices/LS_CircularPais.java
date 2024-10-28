//Marcelo Aruquipa
package LS_SimpleCircularPaices;

import java.util.Scanner;

public class LS_CircularPais extends ListaSimplePais {

    public LS_CircularPais() {
        super();  //constructor de la clase padre ListaSimplePer
    }

    public boolean esVacia() {
        if (P == null) {
            return true;   //lista vacia
        }
        return false;      //lista NO vacia
    }

    public int nroNodos() {
        int c = 0;
        if (P != null) {
            NodoPais R = P;
            while (R.getSig() != P) {
                c++;
                R = R.getSig();
            }
            c++;  //para contar el ultimo nodo
        }
        return c;
    }

    public void adiFinal(Pais z) {
        NodoPais nuevo = new NodoPais();
        nuevo.setQ(z); 


        if (P == null) {
            P = nuevo;   //p apunta a nuevo
            P.setSig(P);
        } else {
            NodoPais R = P;
            while (R.getSig() != P) {
                R = R.getSig();
            }
            R.setSig(nuevo);
            nuevo.setSig(P);
        }
    }

    public void adiPrincipio(Pais z) {
        NodoPais nuevo = new NodoPais();
        nuevo.setQ(z);
        if (P == null) {
            P = nuevo;  //p apunta a nuevo
            P.setSig(P);
        } else {
            NodoPais R = P;
            while (R.getSig() != P) {
                R = R.getSig();
            }
            R.setSig(nuevo);
            nuevo.setSig(P);
            P = nuevo;
        }
    }

    public void mostrar() {
        NodoPais R = P;   //R apunta  a la raiz P
        while (R.getSig() != P) {
            R.getQ().mostrar();
            R = R.getSig();
        }
        R.getQ().mostrar();
    }

    public NodoPais eliPrincipio() {
        NodoPais x = null;
        if (!esVacia()) {
            if (P.getSig() == P) {
                x = P;
                x.setSig(null);
                P = null;
            } else {
                x = P;     // x apunta a la raiz P
                NodoPais R = P;
                while (R.getSig() != P) {
                    R = R.getSig();
                }
                P = P.getSig();
                R.setSig(P);
                x.setSig(null);
            }
        }
        return x;
    }

    public NodoPais eliFinal() {
        NodoPais x = new NodoPais();
        if (P != null) {
            if (P.getSig() == P) {
                x = P;
                x.setSig(null);
                P = null;
            } else {
                NodoPais S = new NodoPais();
                NodoPais R = P;
                while (R.getSig() != P) {
                    S = R;         //S apunta a R
                    R = R.getSig(); //R apunta al siguiente de R
                }
                x = R;
                x.setSig(null);
                S.setSig(P);
            }
        }
        return x;
    }
///llena  al final
    public void llenar1(int n) {
        for (int i = 1; i <= n; i++) {
            Pais z=new Pais();
            z.leer();
            adiFinal(z);
        }
    }
///llena al principio
    public void llenar2(int n) {
        for (int i = 1; i <= n; i++) {
            Pais z=new Pais();
            z.leer();
            adiPrincipio(z);
        }
    }
}
