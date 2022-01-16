package com.andrew.ui;

import com.andrew.service.Storage;

import java.util.Scanner;

import static com.andrew.service.CommandExecutor.*;

public class Menu {
    private static Scanner in = new Scanner(System.in);
    public static void mainMenu() {
        Storage.getInstance();
        int choose = 0;
        while(choose!=3){
            System.out.println("1.Add");
            System.out.println("2.Show");
            System.out.println("3.Exit");
            choose = in.nextInt();
            switch (choose){
                case 1:{
                    add();
                    break;
                }
                case 2:{
                    print();
                    break;
                }
            }
        }
    }
    private static void add(){
        int choose = 0;
        while(choose!=5){
            System.out.println("1.Add operator");
            System.out.println("2.Add tariff");
            System.out.println("3.Add user");
            System.out.println("4.Add tariff for user");
            System.out.println("5.Exit");
            choose = in.nextInt();
            switch (choose){
                case 1:{
                    addOperator();
                    break;
                }
                case 2:{
                    addTarif();
                    break;
                }
                case 3:{
                    addUser();
                    break;
                }
                case 4:{
                    addTariffToUser();
                    break;
                }
            }
        }
    }
    private static void print(){

        int choose = 0;
        while(choose!=4){
            System.out.println("1.Show all operators/tariffs with their users count");
            System.out.println("2.Show all users and their tariffs");
            System.out.println("3.Sort all tariffs by cost");
            System.out.println("4.Exit");
            choose = in.nextInt();
            switch (choose){
                case 1:{
                    printOperators();
                    break;
                }
                case 2:{
                    printUsers();
                    break;
                }
                case 3:{
                    sort();
                    break;
                }
            }
        }
    }
}
