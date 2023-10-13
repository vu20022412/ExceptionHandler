package com.example.exceptionhandler.Exception;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(APIException.class)
    public ResponseEntity<ApiErrorResponse> handelException(APIException ex){

        ApiErrorResponse apiErrorResponse = new ApiErrorResponse(ex.getStatus().value(),ex.getMassage());

        return new ResponseEntity<>(apiErrorResponse,ex.getStatus());
    }
}
