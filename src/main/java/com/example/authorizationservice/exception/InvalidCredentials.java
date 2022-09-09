package com.example.authorizationservice.exception;

public class InvalidCredentials extends RuntimeException {
    private final String msg;

    public InvalidCredentials(String msg) {
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return msg;
    }

}
