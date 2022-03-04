package com.virtusa.pharmacyinventory.service;

import com.virtusa.pharmacyinventory.model.Register;
import com.virtusa.pharmacyinventory.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private RegisterRepository registerRepository;

    @Override
    public Register saveRegister(Object register) {
        System.out.println("AAA");
        System.out.println(register);
        return registerRepository.save(new Register("Maaz","Hussain","maaz","mmm","male"));
    }

    @Override
    public List<Register> getAllRegisters() {
        return registerRepository.findAll();
    }
}