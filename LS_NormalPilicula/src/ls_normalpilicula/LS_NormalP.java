package ls_normalpilicula;

public class LS_NormalP extends ListaSimpleP {

    public LS_NormalP() {
        super();
    }

    public boolean esVacia() {
        if (P == null) {
            return true;
        }
        return false;
    }

    public void adiPrincipio(Pelicula z) {
        NodoP nuevo = new NodoP();
        nuevo.setQ(z); //setea el nodo con el nuevo dato z
        nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
        P = nuevo;      //P apunta a nuevo
    }

    public void adiFinal(Pelicula z) {
        NodoP nuevo = new NodoP();
        nuevo.setQ(z);

        if (esVacia()) {
            P = nuevo;   //p apunta a nuevo
        } else {
            NodoP R = P;
            while (R.getSig() != null) {
                R = R.getSig();
            }
            R.setSig(nuevo);
        }
    }

    public void mostrar() {
        NodoP R = P;   //R apunta  a la raiz P
        while (R != null) {
            R.getQ().mostrar();
            R = R.getSig();//R apunta al siguiente nodo 
        }
    }

    public int nroNodos() {
        NodoP R = P;
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

    public NodoP eliPrincipio() {
        NodoP x = new NodoP();
        if (!esVacia()) {
            x = P;     // x apunta a la raiz P
            P = P.getSig();
            x.setSig(null);
        }
        return x;
    }

    public NodoP eliFinal() {
        NodoP x = new NodoP();
        if (!esVacia()) {
            if (nroNodos() == 1) {
                x = P;      //x apunta a la raiz P
                P = null;
            } else {
                NodoP R = P;
                NodoP S = P;
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
            Pelicula z = new Pelicula();
            z.leer();
            adiPrincipio(z);
        }
    }

    public void leer2(int n) {//lee al   final para  el final de lista //se asemeja a auna cola   
        for (int i = 1; i <= n; i++) {
            Pelicula z = new Pelicula();
            z.leer();
            adiFinal(z);
        }
    }
}
