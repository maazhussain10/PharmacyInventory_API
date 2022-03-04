package com.virtusa.pharmacyinventory.repository;

import com.virtusa.pharmacyinventory.model.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepository extends JpaRepository<Register,Integer> {

    String save(String string);

}
