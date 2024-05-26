package com.weather.app.demo.exception;

public class APIError {
    private final int status;
    private final String message;

    public APIError(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}