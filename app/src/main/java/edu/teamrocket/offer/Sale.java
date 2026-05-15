package edu.teamrocket.offer;

public class Sale implements Offer {

    private String size;
    private Integer price;

    Sale(String size, int bid) {
        this.size = size;
        this.price = bid;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.price.intValue();
    }

    @Override
    public int compareTo(Offer price) {
        return this.price.compareTo(price.value());
    }

    @Override
    public String toString() {
        return "\t\t" + this.size() + "\t" + this.value() + "\n";
    }
}