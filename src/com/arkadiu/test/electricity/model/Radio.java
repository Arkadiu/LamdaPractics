package com.arkadiu.test.electricity.model;

/**
 * Created by Alexander on 16.11.2016.
 */
public class Radio implements ElectricityConsumer {
    public void playMusic() {
        System.out.println("Музыка играет!");
    }

    @Override
    public void electricityOn(Object sender) {
        playMusic();
    }
}
