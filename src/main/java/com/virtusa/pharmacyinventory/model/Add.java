package com.virtusa.pharmacyinventory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicinelists")
public class Add {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productid;
    private String medicinename;

    private String stock;
    private String mrp;
    private String offer;
    private String medicineid;

//    }

    public Add() {
    }

    public int getProduct_ID() {
        return productid;
    }

    public void setProduct_ID(int productid) {
        this.productid = productid;
    }

    public String getMedicine_Name() {
        return medicinename;
    }

    public void setMedicine_Name(String medicinename) {
        this.medicinename = medicinename;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getMRP() {
        return mrp;
    }

    public void setMRP(String mrp) {
        this.mrp = mrp;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }
    
    public String getmedicineid()
    {
    	return medicineid;
    }
    
    public void getmedicineid(String medicineid)
    {
    	this.medicineid = medicineid;    
    }
}