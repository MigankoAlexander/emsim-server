/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.technolog.models;

/**
 *
 * @author Администратор
 */
public class Incident {

    private long id;
    private String description;
    private double lat;
    private double lon;

    public Incident(long id, String description, double lat, double lon) {
        this.id = id;
        this.description = description;
        this.lat = lat;
        this.lon = lon;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    @Override
    public String toString() {
        return "Incident"
                + " id = " + id
                + " coords {" + lat
                + ";" + lon + ")"
                + " what's happened: " + description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Incident incident = (Incident) o;

        if (id != incident.id) {
            return false;
        }
        if (description != null ? !description.equals(incident.description) : incident.description != null) {
            return false;
        }
        if (lat != incident.lat) {
            return false;
        }
        if (lon != incident.lon) {
            return false;
        }
       
        return true;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

}
