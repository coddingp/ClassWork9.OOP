package com.company;


public class Main {

    public static void main(String[] args) {

        Washer washer = new Washer();
        washer.brand = "Samsung";
        washer.kind = "Frontal";
        washer.load = 5;
        washer.warranty = "3 years";
        washer.price = 25999;
        System.out.println(washer.brand + "\n" + washer.kind + "\n" + washer.load + " kg" + "\n" + washer.warranty + "\n" + "Price: " + washer.price + " сом.\n" +
                "");

        Washer washer2 = new Washer();
        washer2.brand = "LG";
        washer2.kind = "Frontal";
        washer2.load = 6;
        washer2.warranty = "3 years";
        washer2.price = 27500;
        System.out.println(washer2.brand + "\n" + washer2.kind + "\n" + washer2.load + " kg" + "\n" + washer2.warranty + "\n" + "Price: " + washer2.price + " сом.\n");

        Washer washer3 = new Washer();
        washer3.brand = "Mellie";
        washer3.kind = "Frontal";
        washer3.load = 5;
        washer3.warranty = "10 years";
        washer3.price = 150000;
        System.out.println(washer3.brand + "\n" + washer3.kind + "\n" + washer3.load + " kg" + "\n" + washer3.warranty + "\n" + "Price: " + washer3.price + " сом.\n");
    }

}

