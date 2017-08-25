package com.swetha;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        FruitInventory fruitInventory = new FruitInventory();
        fruitInventory.addToInventory("Apple",100.0,10);
        fruitInventory.addToInventory("Banana",50.0f,10);
        fruitInventory.addToInventory("Oranges",60.0f,10);
        fruitInventory.addToInventory("Kiwi",1100.0f,10);

        fruitInventory.showFruitInventory();

        FruitBasket fruitBasket = new FruitBasket(fruitInventory);
        fruitBasket.addItemToBasket("Apple", 2);
        fruitBasket.addItemToBasket("Banana", 4);
        fruitBasket.addItemToBasket("Oranges", 5);
        fruitBasket.addItemToBasket("Kiwi", 1);

        fruitBasket.showItemsInBasket();

        fruitBasket.costOfItemsInBasket();
        fruitBasket.printReceipt();


    }
}
