package com.virtusa.pharmacyinventory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardController {
    @GetMapping("/")
    public String home() {
        return "Hellosaccsasca Welcome to Pharmacy Inventory System";
    }
}
