/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectboundingbox;

/**
 * Classe BoundingBox
 * @author Alessio
 */
public class BoundingBox {
    
    private float xMin; //Parametro xMin della Bounding Box
    private float xMax; //Parametro xMax della Bounding Box
    private float yMin; //Parametro yMin della Bounding Box
    private float yMax; //Parametro yMax della Bounding Box
    
        //

    /**
     * Costruttore della classe Bounding Box
     * @param xMin
     * @param xMax
     * @param yMin
     * @param yMax
     */
            public BoundingBox(float xMin, float xMax, float yMin, float yMax){
            this.xMin = xMin; 
            this.xMax = xMax; 
            this.yMin = yMin;
            this.yMax = yMax;
        }
        
        

    /**
     * Metodo getters del parametro xMin
     * @return
     */
            public float getXMin(){
            return this.xMin;
        }
        //

    /**
     * Metodo getters del parametro xMax
     * @return
     */
            public float getXMax(){
            return this.xMax;
        }
        

    /**
     * Metodo getters del parametro yMin
     * @return
     */
            public float getYMin(){
            return this.yMin;
        }
        

    /**
     * Metodo getters del parametro yMax
     * @return
     */
            public float getYMax(){
            return this.yMax;
        }
        
    /**
     * Metodo contiene per verificare se una BoundingBox contiene un'altra
     * @param bb
     * @return
     */
    public boolean contiene(BoundingBox bb){
        if((((this.getXMin() < bb.getXMin()) && (bb.getXMax() < this.getXMax())) && ((this.getYMin()< bb.getYMin()) && (bb.getYMax()< this.getYMax()))))
            return true;
        else{
            return false;
        }
    }
}
