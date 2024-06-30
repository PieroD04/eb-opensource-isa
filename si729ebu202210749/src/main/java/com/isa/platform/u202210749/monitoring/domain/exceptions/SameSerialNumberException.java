package com.isa.platform.u202210749.monitoring.domain.exceptions;

public class SameSerialNumberException extends RuntimeException{
    public SameSerialNumberException(String serialNumber) {
        super("Product with serial number " + serialNumber + " already exists");
    }
}
