package com.example.exceptionhandler.Exception;

import org.springframework.http.HttpStatus;


public class APIException extends  RuntimeException{
    private HttpStatus status;
    private String massage;


    public APIException(HttpStatus status, String massage) {
        this.status = status;
        this.massage = massage;
    }

    public HttpStatus getStatus() {
        return status;
    }


    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }
}
