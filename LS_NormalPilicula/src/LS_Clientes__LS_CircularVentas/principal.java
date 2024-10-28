/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LS_Clientes__LS_CircularVentas;

/**
 *
 * @author rodri
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente c1=new Cliente("Rodrigo", 2);
        Cliente c2=new Cliente("Alfredo", 1);
        Cliente c3=new Cliente("Vanessa", 2);
        

        LS_NormalCliente lc=new LS_NormalCliente();
        lc.adiFinal(c1);
        lc.adiFinal(c2);
        lc.adiFinal(c3);
        System.out.println("-------LISTA DE CLIENTES-----");
        lc.mostrar();
        
        Venta v1=new  Venta("Chompa", "M", 120);
        Venta v2=new  Venta("jeans", "40", 140);
        Venta v3=new  Venta("Tenis", "44", 200);
        Venta v4=new  Venta("Camisa", "M", 42);
        Venta v5=new  Venta("jeans", "40", 280);
        
        LS_CircularVentas lv=new LS_CircularVentas();
        
        lv.adiFinal(v1);
        lv.adiFinal(v2);
        lv.adiFinal(v3);
        lv.adiFinal(v4);
        lv.adiFinal(v5);
        System.out.println("---------LISTA DE  VENTAS -------");
        lv.mostrar();
        
        System.out.println("mostarar  al   cliente numero X de la lista y las prendas que compro");
        mostrarClienteCompra(lc,lv,1);
        System.out.println("------c) Calcular el monto que pago cada cliente. --------");
        calculaMontoQuePagoCliente(lc,lv);
        
    }
    
    static  void calculaMontoQuePagoCliente(LS_NormalCliente lc,LS_CircularVentas lv){
        NodoCliente Rc=lc.getP();
        NodoVenta Rv=lv.getP();
        for (int i = 0; i < lc.nroNodos(); i++) {
            double monto=0;
            int nComp=Rc.getCli().getNroCompras();
            for (int j = 0; j < nComp; j++) {
                monto =monto+Rv.getVenta().getPrecio();
                Rv =Rv.getSig();
            }
            System.out.println("monto pagado por el cliente: "+Rc.getCli().getNombre()+" es: "+monto);
            Rc=Rc.getSig();
        }
        
    }
    //metodo  solo punteros 
    static void mostrarClienteCompra(LS_NormalCliente lc,LS_CircularVentas lv, int  x){
        NodoCliente Rc=lc.getP();
        NodoVenta Rv=lv.getP();
        for (int i = 0; i < x-1; i++) {
            int nComp=Rc.getCli().getNroCompras();
            for (int j = 0; j < nComp; j++) {
                Rv=Rv.getSig();
            }
            Rc=Rc.getSig();
        }
        int nCompX=Rc.getCli().getNroCompras();
        for (int i = 0; i < nCompX; i++) {
            System.out.println(Rv.getVenta().getPrenda()+" "+Rv.getVenta().getTalla()+" "+Rv.getVenta().getPrecio());
            Rv=Rv.getSig();
        }
    }
    
}
