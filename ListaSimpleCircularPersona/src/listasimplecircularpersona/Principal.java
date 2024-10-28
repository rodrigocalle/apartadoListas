//Marcelo Aruquipa
package listasimplecircularpersona;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("nombre: Marcelo Aruauipa");
		System.out.println("tema: Listas circulares");
		
		LS_CircularPer A = new LS_CircularPer();
		A.llenar1(5);
		A.mostrar();
		
//		System.out.println("-----------------------------------------");
//		NodoPer z = A.eliFinal();
//		System.out.println(z.getNom() + " - " + z.getEdad());
//		System.out.println("-----------------------------------------");
//		A.mostrar();
//		System.out.println("nro de nodos de la lista circular: " + A.nroNodos());

		System.out.println("-----------------------------------------");
		NodoPer w = A.eliPrincipio();
		System.out.println("datos eliminados: " + w.getNom() + " " + w.getEdad());
		A.mostrar();
		
		System.out.println("-----------------------------------------");
		A.eliPrincipio();
		A.mostrar();
		
		
//		System.out.println("-----------------------------------------");
//		A.adiFinal("german", 25);
//		A.mostrar();
	}	
}



