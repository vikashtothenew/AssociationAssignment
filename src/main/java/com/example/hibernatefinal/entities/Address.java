package com.example.hibernatefinal.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private int streetnumber;
    private String location;
    private String state;

    public int getStreetNumber() {
        return streetnumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetnumber = streetNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
