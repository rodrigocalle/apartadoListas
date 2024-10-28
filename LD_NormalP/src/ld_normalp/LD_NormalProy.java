//Lic Aruquipa Marcelo
package ld_normalp;

public class LD_NormalProy extends ListaDobleProy{
	public LD_NormalProy() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoProy R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(Proyecto z){
		NodoProy nuevo = new NodoProy();
		nuevo.setProy(z);
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		NodoProy R = P;
		while(R != null) {
			R.getProy().mostrar();
			R = R.getSig();
		}
	}
	void adiFinal(Proyecto z) {
		NodoProy nuevo =  new NodoProy();
		nuevo.setProy(z);
		if(esVacia())
			P = nuevo;
		else {
			NodoProy R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoProy eliPrimero() {
		NodoProy x = new NodoProy();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				x = P;
				P = P.getSig();
				P.setAnt(null);
				x.setSig(null);
			}
		}
		return x;
	}
	
	NodoProy eliFinal() {
		NodoProy x = new NodoProy();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoProy R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoProy aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
	void leer1(int n) {
		for (int i = 1; i <= n; i++) {
			Proyecto z = new Proyecto();
			z.leer();
			adiPrimero(z);
		}
	}
	
	void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Proyecto z = new Proyecto();
			z.leer();
			adiFinal(z);
		}
	}
}
