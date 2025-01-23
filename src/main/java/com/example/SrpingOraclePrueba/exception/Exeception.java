package com.example.SrpingOraclePrueba.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class Exeception extends RuntimeException{
    public Exeception(String mensaje){
        super(mensaje);
    }
}
