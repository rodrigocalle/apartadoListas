package ejerenclase;

public class ListaSimpleMat {

    protected NodoMat P;  //raiz de la lista

    public ListaSimpleMat() {
        P = null;		// la raiz apunta a nullo es decir
        // se define una lista simple vacia
    }

    public NodoMat getP() {
        return P;
    }

    public void setP(NodoMat p) {
        P = p;
    }

}
