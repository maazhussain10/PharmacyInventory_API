package com.virtusa.pharmacyinventory.controller;

import com.virtusa.pharmacyinventory.model.Register;
import com.virtusa.pharmacyinventory.service.RegisterService;
import com.virtusa.pharmacyinventory.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pharmacy")
@CrossOrigin

public class RegisterController {
    @Autowired
    private RegisterService registerService;
    @Autowired
    private RegisterRepository registerRepository;

    @GetMapping(path = "/register")
    public Register register() {
        Register register = new Register();
        register.setFirstname("Mohamed");
        register.setLastname("Shafeeq");
        register.setEmail("shafeeqarshad09@gmail.com");
        register.setPassword("shafeeq1234");
        register.setGender("Male");

        return registerRepository.save(register);
    }

    @GetMapping("/getAll")
    public List<Register> list() {
        return registerService.getAllRegisters();
    }
}
