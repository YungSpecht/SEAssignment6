package com.example.restservice;

import java.util.ArrayList;

public class Pizza {
    private int pizza_id;
    private String name;
    private boolean vegetarian;
    private double price;
    private String[] toppings;

    public Pizza(int pizza_id, String name, boolean vegetarian, double price, String[] toppings){
        this.price = pizza_id;
        this.name = name;
        this.vegetarian = vegetarian;
        this.price = price;
        this.toppings = toppings;
    }

    public int getPizzaId(){
        return pizza_id;
    }

    public String getName(){
        return name;
    }

    public boolean getVegetarianStatus(){
        return vegetarian;
    }

    public double getPrice(){
        return price;
    }

    public String[] getToppings(){
        return toppings;
    }
}
