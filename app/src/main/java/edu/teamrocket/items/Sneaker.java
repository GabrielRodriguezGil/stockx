package edu.teamrocket.items;

public class Sneaker {

    private String style;
    private String name;
    private int sale;
    private int ask;
    private int bid;

    Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
    }

    public Object getStyle() {
        return this.style;
    }

    public Object getName() {
        return this.name;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public int getAsk() {
        return ask;
    }

    public void setAsk(int ask) {
        this.ask = ask;
    }

}