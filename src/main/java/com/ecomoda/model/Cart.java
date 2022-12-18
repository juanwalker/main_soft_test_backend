package com.ecomoda.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class Cart implements Serializable {


    public Cart() {

    }
    private Integer id ;
    private Person person;
    private List<CartItem> items;
    private String address;
    private DeliveryDate deliveryDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void setItems(List<CartItem> items) {
        this.items = items;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public DeliveryDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(DeliveryDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
