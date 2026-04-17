package ru.netology.rest.exception;

public class UnauthorizedUser extends RuntimeException {
    public UnauthorizedUser(String message) {

        super(message);
    }
}
