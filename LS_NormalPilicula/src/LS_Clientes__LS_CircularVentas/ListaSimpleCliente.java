package LS_Clientes__LS_CircularVentas;



public class ListaSimpleCliente {

    protected NodoCliente P;  //raiz de la lista

    public ListaSimpleCliente() {
        P = null;		// la raiz apunta a nullo es decir
        // se define una lista simple vacia
    }

    public NodoCliente getP() {
        return P;
    }

    public void setP(NodoCliente p) {
        P = p;
    }

}
