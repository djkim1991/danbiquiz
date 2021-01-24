package com.danbi.danbiquiz.exceptionHandler;

import com.danbi.danbiquiz.domain.dto.common.ResponseDto;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseDto exceptionHandle() {
        return ResponseDto.builder().status("fail").build();
    }
}
