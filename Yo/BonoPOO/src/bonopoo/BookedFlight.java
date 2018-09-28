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
public class BookedFlight {
    private int flightNumber;
    private String departure;
    private String arrival;
    
    private Airport from;
    private Airport to;
    
    public BookedFlight(){
        
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }
    
    
}
