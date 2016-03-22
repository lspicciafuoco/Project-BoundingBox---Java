/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectboundingbox;

/**
 * Classe Punto
 * @author Alessio
 */
public class Punto {
    private float x; //Definizione della variabile x
    private float y; //Definizione della variabile y
        
        

    /**
     * Costruttore della classe Punto
     * @param x
     * @param y
     */
            public Punto(float x, float y){
            this.x = x;
            this.y = y;
        }
        
       

    /**
     * Metodo getters del parametro x 
     * @return
     */
        public float getX(){
        return this.x;
    }
    

    /**
     * Metodo getters del parametro y
     * @return
     */
        public float getY(){
        return this.y;
    }
    
}
