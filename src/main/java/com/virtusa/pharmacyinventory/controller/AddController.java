package com.virtusa.pharmacyinventory.controller;

import com.virtusa.pharmacyinventory.model.Add;
import com.virtusa.pharmacyinventory.repository.AddRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pharmacy")
@CrossOrigin

public class AddController {
    @Autowired
    private AddRepository addRepository;

    @PostMapping(path = "/add")
    public Add add(@RequestBody Add product) {
        return addRepository.save(product);
    }
    
    @GetMapping(path = "/delete")
    public Add delete() {
        Add add = new Add();
        addRepository.deleteAll();
        return add;
    }
}
