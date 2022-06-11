package com.adow;
// ArrayList is a resizable array
//ArrayList<Integer> integers; // null
//integers = new ArrayList<>;
// In an ArrayList, we can store objects(String, Integer, Boolean, Double, Character, etc) but
// we cannot store string, integer, boolean, double, character, etc)


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<Double> doubles = new ArrayList<>();

        // When we create ArrayList object, the object has some methods(such as add, remove, set, get, etc,)
        // Using the add() method to add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Pineapple");
        System.out.println(fruits);//[Apple, Mango, Banana, Pineapple]

        // Adding elements(String) to specific index in the ArrayList
        fruits.add(0, "AtIndex 0");
        System.out.println(fruits);
        fruits.add(2, "AtIndex 2");
        System.out.println(fruits);

        // Accessing items/elements in the ArrayList
        // Using the get() method to get an element at an index
        System.out.println(fruits.get(0));
        System.out.println(fruits.get(1));
        System.out.println(fruits.get(2));
        System.out.println(fruits.get(3));

        // Changing an item in the ArrayList
        // Or assigning an element in the ArrayList to be equal to another value
        // Therefore, we use the set() method
        fruits.set(2, "Banana"); // change Apple to Banana
        System.out.println(fruits);
        // Removing an element in the ArrayList
        // Using the remove() method either by index or by value

        // Removing by index:
        fruits.remove((0));// remove the element at index 0
        System.out.println(fruits);
        // Removing by value:
        fruits.remove("Pineapple"); // remove "Pineapple"
        System.out.println(fruits);

        // To remove all elements in the ArrayList, we use the clear() method

        //fruits.clear(); // remove all elements
        //System.out.println(fruits);

        // To get the size of the ArrayList
        // We use the size() method: the size shows the number of elements which are in the ArrayList
        System.out.println(fruits.size());

        fruits.remove("Mango");
        System.out.println(fruits.size());

    }
}
