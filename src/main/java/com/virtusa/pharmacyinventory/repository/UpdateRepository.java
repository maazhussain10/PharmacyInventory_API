package com.virtusa.pharmacyinventory.repository;

import com.virtusa.pharmacyinventory.model.Update;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UpdateRepository extends JpaRepository<Update,Integer> {

    String save(String string);

    void update();
}