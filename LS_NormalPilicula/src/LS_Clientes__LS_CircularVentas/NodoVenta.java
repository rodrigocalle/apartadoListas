package LS_Clientes__LS_CircularVentas;


public class NodoVenta {

    private Venta venta;  //define el dato objeto persona
    private NodoVenta sig; //definiendo el campo enlace sig

    public NodoVenta() {  //constructor
        sig = null;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public NodoVenta getSig() {
        return sig;
    }

    public void setSig(NodoVenta sig) {
        this.sig = sig;
    }
    
    

}
