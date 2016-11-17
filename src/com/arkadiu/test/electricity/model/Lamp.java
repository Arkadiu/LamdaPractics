package com.arkadiu.test.electricity.model;

/**
 * Created by Alexander on 16.11.2016.
 */
public class Lamp implements ElectricityConsumer {

    public void lightOn() {
        System.out.println("Свет включен");
    }

    @Override
    public void electricityOn(Object sender) {
        lightOn();
    }
}
