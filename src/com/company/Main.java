package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    BottleBeer vasya = new BottleBeer();
	    vasya.setName("Vasya");
	    vasya.setBottlePrice(0.75);
	    vasya.setColor("white");
	    vasya.setVolume(3);
	    BottleBeer ivan= new BottleBeer("Ivan", "white",2);
	    BottleBeer denys= new BottleBeer("Denys", 5 , "black", 1.5);
	    BottleBeer kolya= new BottleBeer("Kolya",2, "black",10);
	    BottleBeer oleksiy= new BottleBeer("Oleksiy",3, "white",3);

    	BottingBeer sanya= new BottingBeer("Sasha","white",4);
    	BottingBeer vanya= new BottingBeer("Vanya","black",6);
    	BottingBeer kiril= new BottingBeer("Kiril","white",2);
    	BottingBeer felix= new BottingBeer("Felix","black",1.5);
    	BottingBeer petya= new BottingBeer("Petya","white",1);

    	List<IBeer> list = new ArrayList<>();
		list.add(vasya);
    	list.add(ivan);
		list.add(denys);
		list.add(kolya);
		list.add(oleksiy);
		list.add(sanya);
		list.add(vanya);
		list.add(kiril);
		list.add(felix);
		list.add(petya);
		System.out.println(list.stream().max(Comparator.comparing(item -> item.getVolume1())));
		System.out.println("he buy more beer than another");
		System.out.println("Botting beer is cheaper than Bootle bear because you" +
				"don't pay for the bottle");
    }
}
