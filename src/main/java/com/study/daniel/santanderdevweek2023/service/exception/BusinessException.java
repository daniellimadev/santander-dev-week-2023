package com.study.daniel.santanderdevweek2023.service.exception;

public class BusinessException extends RuntimeException{
    private static final long serialVesionUID = 1L;

    public  BusinessException(String message) {
        super(message);
    }
}
