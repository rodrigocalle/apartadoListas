package LS_Clientes__LS_CircularVentas;



public class ListaSimpleVenta {

    protected NodoVenta P;  //raiz de la lista

    public ListaSimpleVenta() {
        P = null;		// la raiz apunta a nullo es decir
        // se define una lista simple vacia
    }

    public NodoVenta getP() {
        return P;
    }

    public void setP(NodoVenta p) {
        P = p;
    }

}
