package com.example.exceptionhandler.Exception;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class ApiErrorResponse {
    private int code;
    private String message;


    public ApiErrorResponse(int code, String massage) {
        this.code = code;
        this.message = massage;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMassage() {
        return message;
    }

    public void setMassage(String massage) {
        this.message = massage;
    }
}
