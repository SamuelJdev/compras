package com.woker.validador.api.exception;

public class LimiteIndisponivelException extends RuntimeException {
    public LimiteIndisponivelException(String message) {
        super(message);
    }
}