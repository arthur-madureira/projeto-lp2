package com.manager.places.model;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

public class Location {
    
    @NotNull(message = "A latitude não pode ser nula")
    @DecimalMin(value = "-90.0", message = "A latitude deve ser entre -90 e 90")
    @DecimalMax(value = "90.0", message = "A latitude deve ser entre -90 e 90")
    private Double lat;

    @NotNull(message = "A longitude não pode ser nula")
    @DecimalMin(value = "-180.0", message = "A longitude deve ser entre -180 e 180")
    @DecimalMax(value = "180.0", message = "A longitude deve ser entre -180 e 180")
    private Double lng;

    public Location() {
    }

    public Location(Double lat, Double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }
}
