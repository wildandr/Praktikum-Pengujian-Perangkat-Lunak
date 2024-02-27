package org.example;
import java.util.ArrayList;
import java.util.List;

public class Wallet {
    private String name;
    private List<String> cards;
    private double cash;

    public Wallet(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
        this.cash = 0;
    }

    public void addCash(double amount) {
        this.cash += amount;
    }

    public boolean withdrawCash(double amount) {
        if (amount > cash) {
            return false; // Not enough cash
        }
        cash -= amount;
        return true;
    }

    public void addCard(String card) {
        if (!cards.contains(card)) {
            cards.add(card);
        }
    }

    public boolean removeCard(String card) {
        return cards.remove(card);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCards() {
        return new ArrayList<>(cards); // Returns a copy of the cards list
    }

    public double getCash() {
        return cash;
    }
}
