package com.mahadi;

/**
 * Created by Mahadi on 1/31/2018.
 */
public class Mammal implements Animal {

    Mammal(){
        //x = 50; // final
    }
    public int noOfLegs(){
        return 10;
    }

    public static void main(String[] args) {

        Mammal mammal = new Mammal();
        mammal.eat();
        mammal.travel();

        System.out.println(mammal.noOfLegs());

    }

    @Override
    public void eat() {
        System.out.println("Mammal Eats");
    }

    @Override
    public void travel() {
        System.out.println("Mammal Travels");
    }
}
