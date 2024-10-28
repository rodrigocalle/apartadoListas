//Marcelo Aruquipa
package listasimplecircularpersona;

public class NodoPer {

    private String nom;  //define el dato objeto persona
    private int edad;   //

    private NodoPer sig; //definiendo el campo enlace sig

    public NodoPer() {  //constructor
        sig = null;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public NodoPer getSig() {
        return sig;
    }

    public void setSig(NodoPer sig) {
        this.sig = sig;
    }

}
