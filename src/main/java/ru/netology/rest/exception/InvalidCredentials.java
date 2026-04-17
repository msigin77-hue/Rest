package ru.netology.rest.exception;

public class InvalidCredentials extends RuntimeException {
    public InvalidCredentials(String message) {

        super(message);
    }
}
