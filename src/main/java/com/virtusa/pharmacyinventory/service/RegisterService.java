package com.virtusa.pharmacyinventory.service;

import com.virtusa.pharmacyinventory.model.Register;

import java.util.List;
public interface RegisterService {
    public Register saveRegister(Object register);
    public List<Register> getAllRegisters();
}
