/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest.c_default;

/**
 *
 * @author chanuka
 */
public class Java8Tester {

    public static void main(String args[]) {
        MyVehicle vehicle = new Car();
        vehicle.print();
    }
}

interface MyVehicle {

    default void print() {
        System.out.println("I am a vehicle!");
    }

    static void blowHorn() {
        System.out.println("Blowing horn!!!");
    }
}

interface FourWheeler {

    default void print() {
        System.out.println("I am a four wheeler!");
    }
}

class Car implements MyVehicle, FourWheeler {

    public void print() {
        MyVehicle.super.print();
        FourWheeler.super.print();
        MyVehicle.blowHorn();
        System.out.println("I am a car!");
    }
}
