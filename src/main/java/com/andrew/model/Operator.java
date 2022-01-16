package com.andrew.model;

import com.andrew.enums.Country;
import com.andrew.model.absract.Tarif;
import com.andrew.service.Storage;

import java.util.ArrayList;

public class Operator{
    private int id;
    private String name;
    private Country country;
    private ArrayList<String> phonePrefix;
    private ArrayList<Tarif> tarifs;

    public Operator(String name, Country country, ArrayList<String> phonePrefix) {
        this.name = name;
        this.country = country;
        this.phonePrefix = phonePrefix;
        tarifs = new ArrayList<>();
    }

    private int generateId(){
        return Storage.getInstance().getOperators().size()+1;
    }


    public int getId() {
        return id;
    }

    public void setId(){
        this.id = generateId();
    }

    public void setId(int id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public ArrayList<String> getPhonePrefix() {
        return phonePrefix;
    }

    public void setPhonePrefix(ArrayList<String> phonePrefix) {
        this.phonePrefix = phonePrefix;
    }

    public void addTarif(Tarif tarif){
        this.tarifs.add(tarif);
    }

    public ArrayList<Tarif> getTarifs() {
        return tarifs;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "country=" + country +
                ",phonePrefix=" + phonePrefix +
                '}';
    }
}