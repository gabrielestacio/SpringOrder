package br.com.gabriel.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(Object resource) {
        super("Resource not found: " + resource);
    }
}
