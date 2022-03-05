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

    @GetMapping(path = "/add")
    public Add add() {
        Add add = new Add();
        add.setMedicine_Name("Advair Diskus");
        add.setStock("95");
        add.setMRP("550");
        add.setOffer("1+1");

        return addRepository.save(add);
    }
    @GetMapping(path = "/delete")
    public Add delete() {
        Add add = new Add();
        addRepository.deleteAll();
        return add;
    }
}
