package com.endpoint.giveme.models;

public class LocationError {

    private int status;

    public LocationError(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
