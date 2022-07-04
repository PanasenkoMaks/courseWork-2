package com.example.coursework2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalideExamGenerateExceptoin extends IllegalArgumentException{
    public InvalideExamGenerateExceptoin (int amount, int correcSize){
        super(String.format("Не корректный размер", amount, correcSize));
    }
}
