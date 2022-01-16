package com.andrew.model;

import com.andrew.model.absract.Tarif;

public class Phone {
    private Tarif tarif;
    private String number;

    public Phone(Tarif tarif) {
        this.tarif = tarif;
        number = this.tarif.generateNumber();
    }

    public Phone(Tarif tarif, String number) {
        this.tarif = tarif;
        this.number = number;
    }

    public Tarif getTarif() {
        return tarif;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "tarif=" + tarif +
                ", number='" + number + '\'' +
                '}';
    }
}
