package br.com.jvm.consomecoingecko.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(Object coin){
        super("Resource not found. Coin" + coin);
    }



}
