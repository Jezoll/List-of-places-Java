/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dawid
 */
public class Places extends Localisations {

    private double longitude;
    private double latitude;
    /**
     * @return the longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * @return the latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    
    @Override
    public String toString(){
        
        return "Name = " + getName() + " " + "Country = " + getCountry() + " " + "City = " + getCity() + " " + "Visited = " + getVisited()
                + " " + "Longitude = " +getLongitude() + " " + " Latitude = "+ getLatitude() ;
    }
}
