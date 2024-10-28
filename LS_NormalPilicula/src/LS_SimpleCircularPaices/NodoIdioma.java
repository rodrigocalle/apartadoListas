package LS_SimpleCircularPaices;

import ls_normalpilicula.*;

public class NodoIdioma {

    private Idioma q;  //define el dato objeto persona
    private NodoIdioma sig; //definiendo el campo enlace sig

    public NodoIdioma() {  //constructor
        sig = null;
    }

    public Idioma getQ() {
        return q;
    }

    public void setQ(Idioma q) {
        this.q = q;
    }

    public NodoIdioma getSig() {
        return sig;
    }

    public void setSig(NodoIdioma sig) {
        this.sig = sig;
    }

}
