package com.smartcity.entity;

/**
 * Entity representing a request
 * Created by lpotages on 21/10/16.
 */
public class Request {

    private Services service;
    private Level emergencyLevel;
    private String address; // Address

    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }

    public Level getEmergencyLevel() {
        return emergencyLevel;
    }

    public void setEmergencyLevel(Level emergencyLevel) {
        this.emergencyLevel = emergencyLevel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Request request = (Request) o;

        if (service != request.service) return false;
        if (emergencyLevel != request.emergencyLevel) return false;
        return address.equals(request.address);

    }

    @Override
    public int hashCode() {
        int result = service.hashCode();
        result = 31 * result + emergencyLevel.hashCode();
        result = 31 * result + address.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Request{" +
                "service=" + service +
                ", emergencyLevel=" + emergencyLevel +
                ", address='" + address + '\'' +
                '}';
    }
}
