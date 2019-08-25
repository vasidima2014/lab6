package edu.brainacademy.dima93;

public class ClientOfShop {
    public String name;
    public int old;
    public static final boolean clientIsAlwaysRight=true;

    private int money;

    ClientOfShop(String name, int old, int money) {
        this.money = money;
        this.name = name;
        this.old = old;
    }
}
