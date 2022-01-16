package com.andrew.model;

import com.andrew.enums.TarifType;
import com.andrew.model.absract.Tarif;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ContractTarif extends Tarif {


    public ContractTarif(String name, int cost, int internet, int сallsOnNet, int callsOutSide, int SMS, Operator operator) {
        super(name, cost, internet, сallsOnNet, callsOutSide, SMS, operator);
        super.setType(TarifType.CONTRACT);
    }

    @Override
    public String generateNumber() {
        Random random = new Random();
        return getOperator().getCountry().getCountryCode()+getOperator().getPhonePrefix().get(random.nextInt(getOperator().getPhonePrefix().size()))+"777"+ ThreadLocalRandom.current().nextInt(1111,9999);
    }
}
