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
public class Hotel extends Travel {
    private String name;
    private String address;
    
    //encapsulamiento

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    //constructor

    public Hotel(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    
    
}
