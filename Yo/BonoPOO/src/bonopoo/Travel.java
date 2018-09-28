/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonopoo;

/**
 *
 * @author Juan
 */
public class Travel {
    private String start;
    private int duration;
    
    private BookedFlight outbound;
    private BookedFlight retorno;
    
    private Hotel hotel;
    
    public Travel(){
        outbound = new BookedFlight();
        retorno = new BookedFlight();
        
    }
    
}
