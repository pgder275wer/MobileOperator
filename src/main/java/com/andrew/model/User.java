package com.andrew.model;

import com.andrew.service.Storage;

import java.util.ArrayList;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private ArrayList<Phone> phones;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        phones = new ArrayList<>();
    }

    public void setId(){
        this.id = generateId();
    }

    private int generateId(){
        return Storage.getInstance().getUsers().size() + 1;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Phone> getPhones() {
        return phones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addPhone(Phone phone){
        phones.add(phone);
    }

    @Override
    public String toString() {
        return id + " " + firstName + " " + lastName;
    }
}
