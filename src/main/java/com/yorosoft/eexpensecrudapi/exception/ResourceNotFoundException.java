package com.yorosoft.eexpensecrudapi.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException() {
        super("Could not find resource.");
    }
    public ResourceNotFoundException(Long id) {
        super("Could not find resource " + id + ".");
    }
}
