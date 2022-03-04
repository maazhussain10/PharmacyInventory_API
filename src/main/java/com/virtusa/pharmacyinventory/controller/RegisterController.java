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

    @PostMapping(path = "/register")
    public Register register(@RequestBody String firstname) {
        System.out.println(firstname);
        Register register = new Register();
        register.setFirstname("Maaz");
        register.setLastname("Hussain");
        register.setEmail("maazhussain43@gmail.com");
        register.setPassword("Maaz123");
        register.setGender("Male");

        return registerRepository.save(register);
    }

    @GetMapping("/getAll")
    public List<Register> list() {
        return registerService.getAllRegisters();
    }
}
