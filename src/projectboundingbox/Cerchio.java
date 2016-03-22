/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectboundingbox;

/**
 * Classe Cerchio
 * @author Alessio
 */
public class Cerchio extends Figura{
    
    private float raggio; //Definizione della variabile raggio
    private Punto centro; //Definizione della variabile centro
    
    /**
     * Costruttore della classe Cerchio
     * @param raggio
     * @param centro
     */
    public Cerchio(float raggio, Punto centro){
            this.raggio = raggio;
            this.centro = centro;
            this.bb = new BoundingBox(this.centro.getX() - this.raggio, this.centro.getX() + this.raggio,this.centro.getY() - this.raggio, this.centro.getY() + this.raggio);
        }
    
    /**
     * Metodo getter dell'attributo raggio
     * @return
     */
    public double getRaggio() {
        return this.raggio;
    }
    
    /**
     * Metodo getter dell'attributo centro
     * @return
     */
    public Punto getCentro() {
        return this.centro;
    }
}
   
