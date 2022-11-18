package com.virtusa.pharmacyinventory.controller;

import com.virtusa.pharmacyinventory.model.Register;
import com.virtusa.pharmacyinventory.service.RegisterService;
import com.virtusa.pharmacyinventory.repository.RegisterRepository;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pharmacy")
@CrossOrigin ("http://localhost:3000/")

public class RegisterController {
    @Autowired
    private RegisterService registerService;
    @Autowired
    private RegisterRepository registerRepository;

    @PostMapping(path = "/register")
    public Register register(@RequestBody Register register) {
        
    	System.out.println(register.getCity());       
    	return registerRepository.save(register);
    }

    @GetMapping("/getAll")
    public List<Register> list() {
        return registerService.getAllRegisters();
    }
    
    @GetMapping("/login")
    public Register login(@RequestParam String email, @RequestParam String password) {
    	List<Register> list = registerRepository.findAll();
    			for(int i=0; i<list.size(); i++)
    			{
    				if(list.get(i).getEmail()!=null && list.get(i).getPassword()!=null)
    				{
    					if(list.get(i).getEmail().equals(email)&& list.get(i).getPassword().equals(password))
    					{
    						return list.get(i);
    					}
    				}
    			}
    			return null;
    }
}
