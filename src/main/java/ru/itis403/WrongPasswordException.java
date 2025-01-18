package ru.itis403;

public class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super(message);

    }
}