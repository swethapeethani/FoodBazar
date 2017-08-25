package com.swetha;

import java.util.HashMap;
import java.util.Iterator;

public class FruitBasket {

    private int totalItemsInBasket = 0;
    private double priceOfItemsInBasket = 0.0f;

    private HashMap<String,Integer> fruitBasket;
    FruitInventory fruitInventory;

    public FruitBasket( FruitInventory inventory ) {
        fruitBasket = new HashMap<String,Integer>();
         fruitInventory = inventory;
    }

    public void addItemToBasket(String name,int quantity){
        String fruitName = name;
        Integer fruitQuantity = quantity;

        fruitBasket.put(fruitName,fruitQuantity);

    }

    public void showItemsInBasket(){

        Iterator<String> keySetIterator = fruitBasket.keySet().iterator();

        System.out.println("Fruits in Basket ");
        String format = "%-40s%s%n";
        String name = "Fruit Name";
        String quantity = "Quantity";
        System.out.printf(format, name,quantity);
        while(keySetIterator.hasNext()){

            String key = keySetIterator.next();


            System.out.printf(format, key , fruitBasket.get(key));
        }
    }

    public void costOfItemsInBasket(){

        double price = 0.0f;
        int quantity = 0;
        Iterator<String> keySetIterator = fruitBasket.keySet().iterator();

        while(keySetIterator.hasNext()){
            String key = keySetIterator.next();
            price = fruitInventory.getPrice(key);
            quantity = fruitBasket.get(key);
            //System.out.println("price" + price);
           priceOfItemsInBasket = priceOfItemsInBasket + quantity * price ;

        }
        System.out.println("price of Items in basket" + priceOfItemsInBasket);
    }

    public void printReceipt(){

        Iterator<String> keySetIterator = fruitBasket.keySet().iterator();

        System.out.println("Customer Bill ");
        String format = "%-25s%-25s%s%n";
        String name = "Fruit Name";
        String quantity = "Quantity";
        String price = "Price";
        System.out.printf(format, name,quantity,price);
        while(keySetIterator.hasNext()){

            String key = keySetIterator.next();


            System.out.printf(format, key , fruitBasket.get(key),fruitInventory.getPrice(key)*fruitBasket.get(key));

        }
        System.out.println("Total Bill  " + priceOfItemsInBasket);
    }
}
