package org.fasttrackit;

import java.time.LocalDate;


public class AnimalFood {
    String name;
    int price;
    int amount;
    LocalDate expirationDate;
    boolean inStoc;
    String store;
    String flavor;

    public AnimalFood(String name) {
        this.name = name;
    }

    public AnimalFood() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isInStoc() {
        return inStoc;
    }

    public void setInStoc(boolean inStoc) {
        this.inStoc = inStoc;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
