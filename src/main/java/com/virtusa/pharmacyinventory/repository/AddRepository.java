package com.virtusa.pharmacyinventory.repository;

import com.virtusa.pharmacyinventory.model.Add;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AddRepository extends JpaRepository<Add,Integer> {

    String save(String string);

}
