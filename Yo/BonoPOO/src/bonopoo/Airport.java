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
public class Airport {
    //campos
    private String description;
    
    //Encapsulamiento
       public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    // Consturctor de la clase
    public Airport(String description) {
        this.description = description;
    }
    
    //destructor
    

 
}
