package ls_normalpilicula;

public class ListaSimpleP {

    protected NodoP P;  //raiz de la lista

    public ListaSimpleP() {
        P = null;		// la raiz apunta a nullo es decir
        // se define una lista simple vacia
    }

    public NodoP getP() {
        return P;
    }

    public void setP(NodoP p) {
        P = p;
    }

}
