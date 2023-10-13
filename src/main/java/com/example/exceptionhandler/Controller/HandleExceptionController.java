package com.example.exceptionhandler.Controller;


import com.example.exceptionhandler.Exception.APIException;
import com.example.exceptionhandler.Exception.ApiErrorResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class HandleExceptionController {




    // theo e hiểu thì khi gọi cái API a cho kia thì nó sẽ trả về 1 thằng json {"code":401,"message":"This error is unauthorized"} kiểu này
    // nên e tạo thằng ApiErrorResponse kia để kiểu hứng dữ liệu thôi ạ , e vẫn dùng thằng ObjectMapper để hứng data

    @GetMapping(value = "/handleEx")
    public ApiErrorResponse handleException(){
        try {
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<ApiErrorResponse> s = restTemplate.getForEntity("https://8658-14-160-25-148.ngrok.io/exception?id=1",ApiErrorResponse.class);

            ObjectMapper objectMapper = new ObjectMapper();
            ApiErrorResponse apiErrorResponse = objectMapper.convertValue(s.getBody(),ApiErrorResponse.class);

            return apiErrorResponse;

        }catch (APIException ex){
            throw new APIException(HttpStatus.OK, "abc");
        }

    }
}
