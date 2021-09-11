package com.fruit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Fruit> list = new ArrayList<Fruit>();
		list.add(new Fruit(101,"Apple",1000));
		list.add(new Fruit(102,"Banana",1500));
		list.add(new Fruit(103,"Grape",2000));
		list.add(new Fruit(104,"Watermelon",2500));
		list.add(new Fruit(105,"Orange",3000));
		list.add(new Fruit(106,"Kiwi",3500));
		list.add(new Fruit(107,"Peach",4000));
		list.add(new Fruit(108,"Melon",4500));
		list.add(new Fruit(109,"Strawberry",5000));
		list.add(new Fruit(110,"Plum",5500));
		
		Collections.sort(list, new FruitComparator());
		System.out.println("Fruit List (ordered by name)");
		for(Fruit f : list) {
			System.out.println(f.toString());
		}
		
		Collections.sort(list, new FruitComparatorDesc());
		System.out.println("Fruit List (reverse ordered by name)");
		for(Fruit f : list) {
			System.out.println(f.toString());
		}
	
	}

}
