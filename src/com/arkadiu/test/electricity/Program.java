package com.arkadiu.test.electricity;

import com.arkadiu.test.electricity.model.Lamp;
import com.arkadiu.test.electricity.model.Radio;

/**
 * Created by Alexander on 17.11.2016.
 */
public class Program {
    public static void fire(Object sender) {
        System.out.println("Fire!!!");
    }

    public static void main(String[] args) {

        Switcher sw = new Switcher();

        sw.addElectricutyListener(new Lamp());
        sw.addElectricutyListener(new Radio());

        sw.addElectricutyListener(sender -> System.out.println("Пожар!!!!"));

        //sw.addElectricutyListener(s -> Main.fire(s));
        sw.addElectricutyListener(Program::fire);
        sw.switcherOn();
    }
}
