package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//        Car деген класс тузунуз (Id, номер авто)
//        Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат (год выпуска, модель, цена, цвет)
//        HashMap тузунуз ключ - машина, маани - машинанын данныйлары
//        HashMapти толтуруп кайра entrySet деген методун колдонуп баардык элементтерин консольго чыгарыныз.



        Map<Car, CarDetails> car = new HashMap<>();
        car.put(new Car("08KGAMJ", 778),new CarDetails(2020,"BMW", 1000000, "black"));
        car.put(new Car("04KGNVU", 111),new CarDetails(2007,"Mercedes", 1500000, "white"));
        car.put(new Car("01KGUUU", 315),new CarDetails(2009,"Toyota", 2000000, "red"));
        car.put(new Car("12KGTRE", 999),new CarDetails(2002,"Lexus", 500000, "grey"));
        car.put(new Car("99KGiii", 675),new CarDetails(2001,"Lambo", 1200000, "yellow"));

        for (Car car1: car.keySet()) {
            System.out.println(car1 + " " + car.get(car1));
        }


    }
}
