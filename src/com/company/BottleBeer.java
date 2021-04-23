package com.company;/*
@USER: dench
@DATE: 23.04
@NAME: BottleBeer
@TIME: 21:30
*/

import java.util.Locale;

public class BottleBeer implements IBeer{
    private String name;
    private double bottlePrice=2;
    private String color;
    private double whitePrice=15;
    private double blackPrice=20;
    private double volume;

    public BottleBeer() {
    }

    public BottleBeer(String name, double bottlePrice, String color, double whitePrice, double blackPrice, double volume) {
        this.name = name;
        this.bottlePrice = bottlePrice;
        this.color = color;
        this.whitePrice = whitePrice;
        this.blackPrice = blackPrice;
        this.volume = volume;
    }

    public BottleBeer(String name, String color, double volume) {
        this.name = name;
        this.color = color;
        this.volume = volume;
    }
    public BottleBeer(String name, double bottlePrice, String color, double volume) {
        this.name = name;
        this.bottlePrice = bottlePrice;
        this.color = color;
        this.volume = volume;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBottlePrice() {
        return bottlePrice;
    }

    public void setBottlePrice(double bottlePrice) {
        this.bottlePrice = bottlePrice;
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
        return "BottleBeer{" +
                "name='" + name + '\'' +
                ", bottlePrice=" + bottlePrice +
                ", color='" + color + '\'' +
                ", whitePrice=" + whitePrice +
                ", blackPrice=" + blackPrice +
                ", volume=" + volume +
                '}';
    }

    @Override
    public double getPrice() {
        if(this.getColor() == "white"){
            return this.getVolume() * this.getWhitePrice() * this.getBottlePrice();
        }else {
            return this.getVolume() * this.getBlackPrice() * this.getBottlePrice();
        }
    }

    @Override
    public double getVolume1() {
        return this.getVolume();
    }
}
