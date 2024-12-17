package com.manager.places.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class Address {

    @NotEmpty(message = "A rua não pode estar vazia")
    private String street;

    @NotEmpty(message = "A cidade não pode estar vazia")
    private String city;

    @NotEmpty(message = "O estado não pode estar vazio")
    private String state;

    @NotEmpty(message = "O código postal não pode estar vazio")
    private String zip;

    @NotNull(message = "A localização não pode ser nula")
    private Location location;

    public Address() {}

    public Address(String street, String city, String state, String zip, Location location) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.location = location;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
