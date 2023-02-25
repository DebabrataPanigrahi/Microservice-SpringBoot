package com.user.service.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(){
        super("Resource not found in server !!");
    }
    public ResourceNotFoundException(String message){
        super(message);
    }
}
