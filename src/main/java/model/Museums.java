/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Dawid
 */
public class Museums extends Localisations {
    private String openingHours;
    private BigDecimal price;
    /**
     * @return the openingHours
     */
    public String getOpeningHours() {
        return openingHours;
    }

    /**
     * @param openingHours the openingHours to set
     */
    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    /**
     * @return the price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    @Override
    public String toString(){
        
        return "Name = " + getName() + " " + "Country = " + getCountry() + " " + "City = " + getCity() + " " + "Visited = " + getVisited()
                + " " + "Opening Hours = " +getOpeningHours() + " " + " Price = "+ getPrice() ;
    }
}
