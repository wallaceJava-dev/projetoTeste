package com.example.demo.service.excecoes;

public class ExcecoesDeDominio extends RuntimeException {
    public ExcecoesDeDominio(String message) {
        super(message);
    }

    public ExcecoesDeDominio(String message, Throwable cause) {
        super(message, cause);
    }
}