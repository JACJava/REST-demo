package com.wiredbrain.friends.model;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Embeddable

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String street;
    private String city;


    @JsonBackReference
    @ManyToOne
    Friend friend;


    public Friend getFriend() {
        return friend;
    }

    public void setFriend(Friend friend) {
        this.friend = friend;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
