package LS_SimpleCircularPaices;

import ls_normalpilicula.*;

public class NodoPais {

    private Pais q;  //define el dato objeto persona
    private NodoPais sig; //definiendo el campo enlace sig

    public NodoPais() {  //constructor
        sig = null;
    }

    public Pais getQ() {
        return q;
    }

    public void setQ(Pais q) {
        this.q = q;
    }

    public NodoPais getSig() {
        return sig;
    }

    public void setSig(NodoPais sig) {
        this.sig = sig;
    }

}
