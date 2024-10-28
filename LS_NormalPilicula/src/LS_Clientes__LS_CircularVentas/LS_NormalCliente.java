package LS_Clientes__LS_CircularVentas;


public class LS_NormalCliente extends ListaSimpleCliente {

    public LS_NormalCliente() {
        super();
    }

    public boolean esVacia() {
        if (P == null) {
            return true;
        }
        return false;
    }

    public void adiPrincipio(Cliente z) {
        NodoCliente nuevo = new NodoCliente();
        nuevo.setCli(z); //setea el nodo con el nuevo dato z
        nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
        P = nuevo;      //P apunta a nuevo
    }

    public void adiFinal(Cliente z) {
        NodoCliente nuevo = new NodoCliente();
        nuevo.setCli(z);

        if (esVacia()) {
            P = nuevo;   //p apunta a nuevo
        } else {
            NodoCliente R = P;
            while (R.getSig() != null) {
                R = R.getSig();
            }
            R.setSig(nuevo);
        }
    }

    public void mostrar() {
        NodoCliente R = P;   //R apunta  a la raiz P
        while (R != null) {
            R.getCli().mostrar();
            R = R.getSig();//R apunta al siguiente nodo 
        }
    }

    public int nroNodos() {
        NodoCliente R = P;
        int c = 0;
        if (this.esVacia()) {
            return 0;
        } else {
            while (R != null) {
                c++;
                R = R.getSig();
            }
        }
        return c;
    }

    public NodoCliente eliPrincipio() {
        NodoCliente x = new NodoCliente();
        if (!esVacia()) {
            x = P;     // x apunta a la raiz P
            P = P.getSig();
            x.setSig(null);
        }
        return x;
    }

    public NodoCliente eliFinal() {
        NodoCliente x = new NodoCliente();
        if (!esVacia()) {
            if (nroNodos() == 1) {
                x = P;      //x apunta a la raiz P
                P = null;
            } else {
                NodoCliente R = P;
                NodoCliente S = P;
                while (R.getSig() != null) {
                    S = R;         //S apunta a R
                    R = R.getSig(); //R apunta al siguiente de R
                }
                x = R;
                S.setSig(null);
            }
        }
        return x;
    }

    public void leer1(int n) {  //adiciona al preincipio  //crea un nodo guarada un ogj persona se asemeja a una  pila 
        for (int i = 1; i <= n; i++) {
            Cliente z = new Cliente();
            z.leer();
            adiPrincipio(z);
        }
    }

    public void leer2(int n) {//lee al   final para  el final de lista //se asemeja a auna cola   
        for (int i = 1; i <= n; i++) {
            Cliente z = new Cliente();
            z.leer();
            adiFinal(z);
        }
    }
}
