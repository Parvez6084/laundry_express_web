package com.service.laundry.laundry_express.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class ItemModel {

    private int id;
    private String itemName;
    private double itemPrice;
    private boolean itemAvailable;



}
