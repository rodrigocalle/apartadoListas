//Marcelo Aruquipa
package ejerenclase;

public class ListaSimpleEst {

    protected NodoEst P;  //raiz de la lista

    public ListaSimpleEst() {
        P = null;		// la raiz apunta a nullo es decir
        // se define una lista simple vacia
    }

    public NodoEst getP() {
        return P;
    }

    public void setP(NodoEst p) {
        this.P = p;
    }

}
