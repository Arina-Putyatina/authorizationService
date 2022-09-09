package com.example.authorizationservice.exception;

public class UnauthorizedUser extends RuntimeException {
    private final String msg;

    public UnauthorizedUser(String msg) {
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return msg;
    }

}
