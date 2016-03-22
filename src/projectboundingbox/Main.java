/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectboundingbox;

/**
 * Classe Main
 * @author Alessio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cerchio c1 = new Cerchio(10.0f,new Punto(3.0f,3.0f));
        Cerchio c2 = new Cerchio(6.0f, new Punto(4.0f,4.0f));
        
        System.out.println("La figura è contenuta: " + c1.bb.contiene(c2.bb));
    }
    
}
