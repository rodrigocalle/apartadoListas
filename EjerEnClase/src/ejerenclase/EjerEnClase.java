/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerenclase;

/**
 *
 * @author rodri
 */
public class EjerEnClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LS_NormalEst  LSE1=new LS_NormalEst();
        LSE1.adiFinal(1122,"RU123", "Calle","Daza","Rodrigo");
        LSE1.adiFinal(1133,"RU124", "Choque","Apaza","Marlen");
        LSE1.adiFinal(1144,"RU1123", "Quispe","Condori","Rosa");
        LSE1.adiFinal(1155,"RU178", "Choque","Callo","Paola");
        
         LS_NormalEst  LSE2=new LS_NormalEst();
        LSE2.adiFinal(1122,"RU123", "Calle","Daza","Rodrigo");
        LSE2.adiFinal(1139,"RU124", "Choque","Apaza","Armando");
        LSE2.adiFinal(1144,"RU1123", "Quispe","Condori","Rosa");
        LSE2.adiFinal(1155,"RU178", "Choque","Callo","Tomas");
        LSE2.adiFinal(1155,"RU178", "Choque","Callo","Tomas");
        
        LS_NormalEst  LSE3=new LS_NormalEst();
        LSE3.adiFinal(1122,"RU123", "Calle","Daza","Rodrigo");
        LSE3.adiFinal(118,"RU124", "Choque","Apaza","Marlen");
        LSE3.adiFinal(1144,"RU1123", "Quispe","Condori","Milenca");
        LSE3.adiFinal(1155,"RU178", "Choque","Callo","Karen");
        
        
        Materia m1=new Materia("inf-111", "Prog1", "A","Tellez", LSE1);
        Materia m2=new Materia("inf-121", "Prog2", "B","Marcelo", LSE2);
        Materia m3=new Materia("inf-131", "Prog3", "C","Tarquino", LSE3);
        
        LS_CircularMat LSCmaterea=new LS_CircularMat();
        LSCmaterea.adiFinal(m1);
        LSCmaterea.adiFinal(m2);
        LSCmaterea.adiFinal(m3);
        
        LSCmaterea.mostrar();
        
        System.out.println("\n--LISTAR TODOS LOS ESTUDIANTES DE LA MATERIA DE SIGLA INF-121 POR PARALELOS ");
        listarEstudiantesDeLaMateriaX(LSCmaterea,"inf-121");
        System.out.println("----B) mostrar las  materias en las   que esta inscrito el estudiante con ci X-----");
        mostrarMateriaEnLasQueEstaInsCritoEstudianteX(LSCmaterea,1133);
        System.out.println("----c) MOSTRAR LAS MATERIAS  CON LA MAYOR CANTIDAD DE ESTUDIANTES------");
        mostraMatConMayCantEst(LSCmaterea);
    }
    
    static void mostraMatConMayCantEst(LS_CircularMat lscMat){
        int may=mayorNroest(lscMat);
        NodoMat R=lscMat.getP();
        int nd=lscMat.nroNodos();
        for (int i = 0; i < nd; i++) {
            Materia m=R.getMat();
            if(may==m.getLe().nroNodos()){
                System.out.println(m.getSigla());
            }
            R=R.getSig();
        }
    }
    
    static int mayorNroest(LS_CircularMat lmat){
        int may=0;
        NodoMat R= lmat.getP();
        int nd=lmat.nroNodos();
        for (int i = 0; i < nd; i++) {
            Materia m=R.getMat();
            LS_NormalEst le =m.getLe();
            if(may<le.nroNodos()){
                may=le.nroNodos();
            }
            R=R.getSig();
        }
        return may;
    }
    
    static void mostrarMateriaEnLasQueEstaInsCritoEstudianteX(LS_CircularMat lscMat, int cix){
        int nd=lscMat.nroNodos();
        NodoMat R=lscMat.getP();
        for (int i = 0; i < nd; i++) {
            Materia m=R.getMat();
            if(buscaEstCi(m.getLe(),cix)){
                System.out.println(m.getSigla()+" "+m.getNombre());
            }
            R=R.getSig();
        }
    }
    static boolean buscaEstCi(LS_NormalEst le, int cix){
        NodoEst R=le.getP();
        while(R!=null){
            if(R.getCi()==cix){
                return true;
            }
            R=R.getSig();
        }
        return  false;
    }
    
    
    
   static void listarEstudiantesDeLaMateriaX(LS_CircularMat lmat, String siglax){
        int nd=lmat.nroNodos();
        NodoMat R=lmat.getP();
        for (int i = 0; i <nd; i++) {
           Materia m =R.getMat();
           if(m.getSigla().equalsIgnoreCase(siglax)){
               LS_NormalEst e=m.getLe();
               e.mostrar();
           }
           R=R.getSig();
       }
    }
}
