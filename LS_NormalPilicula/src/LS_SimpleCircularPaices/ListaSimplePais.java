package LS_SimpleCircularPaices;

import ls_normalpilicula.*;

public class ListaSimplePais {

    protected NodoPais P;  //raiz de la lista

    public ListaSimplePais() {
        P = null;		// la raiz apunta a nullo es decir
        // se define una lista simple vacia
    }

    public NodoPais getP() {
        return P;
    }

    public void setP(NodoPais p) {
        P = p;
    }

}
