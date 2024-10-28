package LS_Clientes__LS_CircularVentas;


public class NodoCliente {

    private Cliente cli;  //define el dato objeto persona
    private NodoCliente sig; //definiendo el campo enlace sig

    public NodoCliente() {  //constructor
        sig = null;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public NodoCliente getSig() {
        return sig;
    }

    public void setSig(NodoCliente sig) {
        this.sig = sig;
    }

    

}
