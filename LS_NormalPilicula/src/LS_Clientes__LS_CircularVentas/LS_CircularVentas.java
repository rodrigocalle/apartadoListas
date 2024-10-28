//Marcelo Aruquipa
package LS_Clientes__LS_CircularVentas;



public class LS_CircularVentas extends ListaSimpleVenta {

    public LS_CircularVentas() {
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
            NodoVenta R = P;
            while (R.getSig() != P) {
                c++;
                R = R.getSig();
            }
            c++;  //para contar el ultimo nodo
        }
        return c;
    }

    public void adiFinal(Venta z) {
        NodoVenta nuevo = new NodoVenta();
        nuevo.setVenta(z); 


        if (P == null) {
            P = nuevo;   //p apunta a nuevo
            P.setSig(P);
        } else {
            NodoVenta R = P;
            while (R.getSig() != P) {
                R = R.getSig();
            }
            R.setSig(nuevo);
            nuevo.setSig(P);
        }
    }

    public void adiPrincipio(Venta z) {
        NodoVenta nuevo = new NodoVenta();
        nuevo.setVenta(z);
        if (P == null) {
            P = nuevo;  //p apunta a nuevo
            P.setSig(P);
        } else {
            NodoVenta R = P;
            while (R.getSig() != P) {
                R = R.getSig();
            }
            R.setSig(nuevo);
            nuevo.setSig(P);
            P = nuevo;
        }
    }

    public void mostrar() {
        NodoVenta R = P;   //R apunta  a la raiz P
        while (R.getSig() != P) {
            R.getVenta().mostrar();
            R = R.getSig();
        }
        R.getVenta().mostrar();
    }

    public NodoVenta eliPrincipio() {
        NodoVenta x = null;
        if (!esVacia()) {
            if (P.getSig() == P) {
                x = P;
                x.setSig(null);
                P = null;
            } else {
                x = P;     // x apunta a la raiz P
                NodoVenta R = P;
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

    public NodoVenta eliFinal() {
        NodoVenta x = new NodoVenta();
        if (P != null) {
            if (P.getSig() == P) {
                x = P;
                x.setSig(null);
                P = null;
            } else {
                NodoVenta S = new NodoVenta();
                NodoVenta R = P;
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
            Venta z=new Venta();
            z.leer();
            adiFinal(z);
        }
    }
///llena al principio
    public void llenar2(int n) {
        for (int i = 1; i <= n; i++) {
            Venta z=new Venta();
            z.leer();
            adiPrincipio(z);
        }
    }
}
