package com.company;/*
@USER: dench
@DATE: 23.04
@NAME: BottingBeer
@TIME: 21:32
*/

public class BottingBeer implements IBeer{
    private String name;
    private String color;
    private double whitePrice=14;
    private double blackPrice=19;
    private double volume;

    public BottingBeer() {
    }

    public BottingBeer(String name, String color, double whitePrice, double blackPrice, double volume) {
        this.name = name;
        this.color = color;
        this.whitePrice = whitePrice;
        this.blackPrice = blackPrice;
        this.volume = volume;
    }

    public BottingBeer(String name, String color, double volume) {
        this.name = name;
        this.color = color;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWhitePrice() {
        return whitePrice;
    }

    public void setWhitePrice(double whitePrice) {
        this.whitePrice = whitePrice;
    }

    public double getBlackPrice() {
        return blackPrice;
    }

    public void setBlackPrice(double blackPrice) {
        this.blackPrice = blackPrice;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BottingBeer{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", whitePrice=" + whitePrice +
                ", blackPrice=" + blackPrice +
                ", volume=" + volume +
                '}';
    }

    @Override
    public double getPrice() {
        if(this.getColor() == "white"){
            return this.getVolume() * this.getWhitePrice();
        }else {
            return this.getVolume() * this.getBlackPrice();
        }
    }

    @Override
    public double getVolume1() {
        return this.getVolume();
    }
}
