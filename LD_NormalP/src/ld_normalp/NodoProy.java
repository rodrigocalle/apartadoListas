//Lic Aruquipa Marcelo
package ld_normalp;
public class NodoProy {
	private Proyecto proy;
	private NodoProy ant;
	private NodoProy sig;
	
	NodoProy(){
		this.sig = null;
		this.ant = null;
	}

	public Proyecto getProy() {
		return proy;
	}

	public void setProy(Proyecto proy) {
		this.proy = proy;
	}

	public NodoProy getAnt() {
		return ant;
	}

	public void setAnt(NodoProy ant) {
		this.ant = ant;
	}

	public NodoProy getSig() {
		return sig;
	}

	public void setSig(NodoProy sig) {
		this.sig = sig;
	}
	
}
