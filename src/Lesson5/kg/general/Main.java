package Lesson5.kg.general;

import Lesson5.kg.object.Car;
import Lesson5.kg.object.Chair;

public class Main {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "black";
        c1.volume = 2.5;
        c1.year = 2019;
        c1.signal = "bip";
        Car c2 = new Car(2020, 2.0, "red");
        c2.signal = "bip-bip";
        System.out.println(c2.color + " " + c2.year + " " + c2.volume);
        c1.makeSignal();
        c2.makeSignal();
        Chair ch = new Chair();
        ch.material = "skin";
        ch.price = 100.0;
        c2.chair = ch;
        System.out.println(c2.year + " " + c2.volume + " " + c2.color + " " + c2.chair.material + " " + c2.chair.price);
        }
    }
