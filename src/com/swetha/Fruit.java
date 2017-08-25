package com.swetha;

public class Fruit {

    private FruitInventory FBInventory;
    private double price = 0.0f;
    private int quantity = 0;

    void addFruitDetails(double price,int quantity){
        this.price = price;
        this.quantity = quantity;
    }
    void getFruitDetails(){
        System.out.println("Price: " + this.price +" Quantity: " + this.quantity) ;
        //System.out.println("Quantity " + this.quantity);
    }
    public double getPrice(){
        return this.price;
    }
    public int getQuantity(){
        return this.quantity;
    }
}
