package org.restfultoad;

public class Player {
    private String name;
    private int coins;


    public Player(String name, int coins) {
        this.name = name;
        this.coins = coins;
    }


    public String getName() {
        return this.name;
    }


    public int getCoins() {
        return this.coins;
    }


    public void setCoins(int coins) {
        this.coins = coins;
    }


    public void addCoin() {
        this.coins++;
    }


    public void removeCoin() {
        this.coins--;
    }
}
