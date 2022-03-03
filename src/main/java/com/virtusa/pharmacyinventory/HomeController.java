package com.virtusa.pharmacyinventory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @CrossOrigin
public class HomeController {
<<<<<<< HEAD
    @GetMapping("/welcome")
=======
    @GetMapping("/a")
>>>>>>> 47ce0e53ef8783e2a80ecf69ab1049d36091246d
    public String home() {
        return "Welcome Please login to enter";
    }

<<<<<<< HEAD
    @GetMapping("/1001")
    public String getDolo() {
        return "Dolo in Stock";
    }

    @GetMapping("/1005")
    public String getParacetomols() {
        return "Paracetomol in Stock";
    }

    @GetMapping("/2001")
    public String getAdvairDiskus() {
        return "Advair Diskus in Stock";
    }

    @GetMapping("/3502")
    public String getLantusSolostar() {
        return "Lantus Solostar in Stock";
    }

    @GetMapping("/5002")
    public String getSpirivaHandihaler() {
        return "Betadine Solution out of Stock";
    }

    @GetMapping("/5421")
    public String getGlycometGP() {
        return " Glycomet GP out of Stock";
    }

    @GetMapping("/7421")
    public String getSynthriod() {
        return "Synthriod out of Stock";
    }

    @GetMapping("/8725")
    public String getParacetomol() {
        return "Paracetomol out of Stock";
    }

    @GetMapping("/4725")
    public String getCrocin() {
        return "Crocin out of Stock";
    }
=======
    @GetMapping("/login")
    public String getTablets() {
        
        return "Login Success";
    }

    @GetMapping("/abc")
    public String getTablets2() {
        return "We need Crocin for 2000 Patients";
    }


>>>>>>> 47ce0e53ef8783e2a80ecf69ab1049d36091246d
}
