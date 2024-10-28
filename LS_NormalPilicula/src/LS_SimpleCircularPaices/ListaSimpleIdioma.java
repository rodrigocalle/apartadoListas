package LS_SimpleCircularPaices;

import ls_normalpilicula.*;

public class ListaSimpleIdioma {

    protected NodoIdioma P;  //raiz de la lista

    public ListaSimpleIdioma() {
        P = null;		// la raiz apunta a nullo es decir
        // se define una lista simple vacia
    }

    public NodoIdioma getP() {
        return P;
    }

    public void setP(NodoIdioma p) {
        P = p;
    }

}
