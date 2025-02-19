package net.bankapp.loans.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException (String message, Throwable throwable){
        super(message, throwable);
    }

    public ResourceNotFoundException (String message, Object... args){
        super(String.format(message, args));
    }
}