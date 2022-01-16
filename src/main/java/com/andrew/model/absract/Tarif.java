package com.andrew.model.absract;

import com.andrew.enums.TarifType;
import com.andrew.model.Operator;
import com.andrew.model.User;
import com.andrew.model.interfaces.NumberGenerator;
import com.andrew.service.Storage;

import java.util.ArrayList;

public abstract class Tarif implements NumberGenerator {
    private int id;
    private String name;
    private int cost;
    private int internet;
    private int сallsOnNet;
    private int callsOutSide;
    private int SMS;
    private Operator operator;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TarifType getType() {
        return type;
    }

    public void setType(TarifType type) {
        this.type = type;
    }

    private TarifType type;
    private ArrayList<User> users;

    public Tarif(String name, int cost, int internet, int сallsOnNet, int callsOutSide, int SMS, Operator operator) {
        this.name = name;
        this.cost = cost;
        this.internet = internet;
        this.сallsOnNet = сallsOnNet;
        this.callsOutSide = callsOutSide;
        this.SMS = SMS;
        this.operator = operator;
        users = new ArrayList<User>();
    }

    public int getId() {
        return id;
    }

    public void setId(){
        this.id = generateId();
    }

    private int generateId(){
        ArrayList<Operator> operators = Storage.getInstance().getOperators();
        int id = 0;
        for(int i=0; i<operators.size(); i++){
            id += operators.get(i).getTarifs().size();
        }
        return ++id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInternet() {
        return internet;
    }

    public void setInternet(int internet) {
        this.internet = internet;
    }

    public int getСallsOnNet() {
        return сallsOnNet;
    }

    public void setСallsOnNet(int сallsOnNet) {
        this.сallsOnNet = сallsOnNet;
    }

    public int getCallsOutSide() {
        return callsOutSide;
    }

    public void setCallsOutSide(int callsOutSide) {
        this.callsOutSide = callsOutSide;
    }

    public int getSMS() {
        return SMS;
    }

    public void setSMS(int SMS) {
        this.SMS = SMS;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public void addUser(User user){
        boolean flag = false;
        for(User u : users)
            if(u.getId() == user.getId())
                flag=true;
        if(!flag)
            users.add(user);
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Tarif{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", internet=" + internet +
                ", сallsOnNet=" + сallsOnNet +
                ", callsOutSide=" + callsOutSide +
                ", SMS=" + SMS +
                ", operator=" + operator.getName() +
                ", type=" + type.name() +
                '}';
    }
}
