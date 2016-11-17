package com.arkadiu.test.electricity;

import com.arkadiu.test.electricity.model.ElectricityConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Alexander on 16.11.2016.
 */
public class Switcher {

    private List<ElectricityConsumer> consumers = new ArrayList<>();

    public void addElectricutyListener(ElectricityConsumer listener){
        consumers.add(listener);
    }

    public void removeElectricutyListener(ElectricityConsumer listener){
        consumers.remove(listener);
    }

    public void switcherOn(){
        System.out.println("Выключатель включен!");

        /*for(model.ElectricityConsumer consumer : consumers)
            consumer.electricityOn();*/

        consumers.stream().peek(o -> o.electricityOn(this)).collect(Collectors.toList());
    }
}
