package com.swetha;

import java.util.HashMap;
import java.util.Iterator;

public class FruitInventory {

    private HashMap<String,Fruit> inventoryMap;

    public FruitInventory() {
        inventoryMap = new HashMap<String,Fruit>();
    }


    public void addToInventory(String name, double price, int quantity){

        String fruitName = name;
        double fruitPrice = price;
        int fruitQuantity = quantity;

        Fruit fruit = new Fruit();
        fruit.addFruitDetails(fruitPrice,fruitQuantity);

        inventoryMap.put(fruitName,fruit);

    }

    public void showFruitInventory(){

        Fruit fruit = new Fruit();
        double price = 0.0f;
        int quantity = 0;

        String format = "%-25s%-25s%s%n";
        String fruitName = "Name";
        String fruitPrice = "Price";
        String fruitQuantity = "Quantity";
        System.out.printf("Fruit Inventory%n");
        System.out.printf(format, fruitName,fruitPrice,fruitQuantity);
        Iterator<String> keySetIterator = inventoryMap.keySet().iterator();

        while (keySetIterator.hasNext()){
            String key = keySetIterator.next();
            fruit = inventoryMap.get(key);
            price = fruit.getPrice();
            quantity = fruit.getQuantity();

            System.out.printf(format, key ,price, quantity);
            //fruit.getFruitDetails();

        }

    }

    public double getPrice(String fruitName){
        String key = fruitName;
        double price = 0.0f;
        Fruit fruit = inventoryMap.get(key);
        price = fruit.getPrice();
        return price;
    }

}
