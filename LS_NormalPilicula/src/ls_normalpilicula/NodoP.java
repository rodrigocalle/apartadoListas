package ls_normalpilicula;

public class NodoP {

    private Pelicula q;  //define el dato objeto persona
    private NodoP sig; //definiendo el campo enlace sig

    public NodoP() {  //constructor
        sig = null;
    }

    public Pelicula getQ() {
        return q;
    }

    public void setQ(Pelicula q) {
        this.q = q;
    }

    public NodoP getSig() {
        return sig;
    }

    public void setSig(NodoP sig) {
        this.sig = sig;
    }

}
