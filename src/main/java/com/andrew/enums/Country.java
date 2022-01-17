package com.andrew.enums;

public enum Country {

    UKRAINE("+38"),
    RUSSIA("+7");

    private String countryCode;

    Country(String countryCode){
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryCode='" + countryCode + '\'' +
                '}';
    }
}
