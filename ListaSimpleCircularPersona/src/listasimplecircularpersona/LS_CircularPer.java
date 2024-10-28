//Marcelo Aruquipa
package listasimplecircularpersona;

import java.util.Scanner;

public class LS_CircularPer extends ListaSimplePer {

    public LS_CircularPer() {
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
            NodoPer R = P;
            while (R.getSig() != P) {
                c++;
                R = R.getSig();
            }
            c++;  //para contar el ultimo nodo
        }
        return c;
    }

    public void adiFinal(String nom, int edad) {
        NodoPer nuevo = new NodoPer();
        nuevo.setNom(nom);
        nuevo.setEdad(edad);

        if (P == null) {
            P = nuevo;   //p apunta a nuevo
            P.setSig(P);
        } else {
            NodoPer R = P;
            while (R.getSig() != P) {
                R = R.getSig();
            }
            R.setSig(nuevo);
            nuevo.setSig(P);
        }
    }

    public void adiPrincipio(String nom, int edad) {
        NodoPer nuevo = new NodoPer();
        nuevo.setNom(nom);
        nuevo.setEdad(edad);
        if (P == null) {
            P = nuevo;  //p apunta a nuevo
            P.setSig(P);
        } else {
            NodoPer R = P;
            while (R.getSig() != P) {
                R = R.getSig();
            }
            R.setSig(nuevo);
            nuevo.setSig(P);
            P = nuevo;
        }
    }

    public void mostrar() {
        NodoPer R = P;   //R apunta  a la raiz P
        while (R.getSig() != P) {
            System.out.println(R.getNom() + " - " + R.getEdad());
            R = R.getSig();
        }
        System.out.println(R.getNom() + " - " + R.getEdad());
    }

    public NodoPer eliPrincipio() {
        NodoPer x = null;
        if (!esVacia()) {
            if (P.getSig() == P) {
                x = P;
                x.setSig(null);
                P = null;
            } else {
                x = P;     // x apunta a la raiz P
                NodoPer R = P;
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

    public NodoPer eliFinal() {
        NodoPer x = new NodoPer();
        if (P != null) {
            if (P.getSig() == P) {
                x = P;
                x.setSig(null);
                P = null;
            } else {
                NodoPer S = new NodoPer();
                NodoPer R = P;
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
        Scanner lee = new Scanner(System.in);
        for (int i = 1; i <= n; i++) {
            System.out.println("nom - edad");
            String nom = lee.next();
            int edad = lee.nextInt();
            adiFinal(nom, edad);
        }
    }
///llena al principio
    public void llenar2(int n) {
        Scanner lee = new Scanner(System.in);
        for (int i = 1; i <= n; i++) {
            System.out.println("nom - edad");
            String nom = lee.next();
            int edad = lee.nextInt();
            adiPrincipio(nom, edad);
        }
    }
}
