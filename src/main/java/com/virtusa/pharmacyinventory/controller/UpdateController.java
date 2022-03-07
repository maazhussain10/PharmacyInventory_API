package com.virtusa.pharmacyinventory.controller;

import com.virtusa.pharmacyinventory.model.Update;
import com.virtusa.pharmacyinventory.repository.UpdateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pharmacy")
@CrossOrigin

public class UpdateController {
    @Autowired
    private UpdateRepository updateRepository;

    @GetMapping(path = "/update")
    public Update update() {
        Update update = new Update();
        updateRepository.update();
        return update;
    }
}
