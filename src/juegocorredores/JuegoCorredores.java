/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegocorredores;

/**
 *
 * @author Alejandro
 */
public class JuegoCorredores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cont=0;
        boolean band=false;
        
        Corredor c1 = new Corredor(0,"alejandro");
        Corredor c2 = new Corredor(0,"felipe");
        Corredor c3 = new Corredor(0,"pepe");
        
        while(!band){
            
            
            c1.correr();
            c2.correr();
            c3.correr();
            
            if(cont==5){
                System.out.println("hola desde el if contador..");
            c1.SaltarObs();
            c2.SaltarObs();
            c3.SaltarObs();
            cont=0;
            }
            cont++;
            if(c1.getDr()>1000 || c2.getDr()>1000 || c3.getDr()>1000)
            {
                band=true;
            }
            
        
        }
        System.out.println("");
        c1.mostrar();
        c2.mostrar();
        c3.mostrar();
        
    }
    
}
