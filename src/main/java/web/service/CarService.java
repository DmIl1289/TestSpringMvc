package web.service;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public static List<Car> getCars(){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BadCar", "Black", 1));
        cars.add(new Car("BetterCar", "White", 2));
        cars.add(new Car("GoodCar", "Orange", 3));
        cars.add(new Car("AwesomeCar", "Silver", 4));
        cars.add(new Car("SuperCar", "Red", 5));
        return cars;
    }
}
