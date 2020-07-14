package com.igeek.ch07.trans.exception;

public class AccountException extends  RuntimeException {

    public AccountException() {
    }

    public AccountException(String message) {
        super(message);
    }
}