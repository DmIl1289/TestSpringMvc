package web.service;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("BadCar", "Black", 1));
        cars.add(new Car("BetterCar", "White", 2));
        cars.add(new Car("GoodCar", "Orange", 3));
        cars.add(new Car("AwesomeCar", "Silver", 4));
        cars.add(new Car("SuperCar", "Red", 5));
    }


    public static List<Car> setOfCars(int i){
        return CarService.cars.stream().limit(i).collect(Collectors.toList());
    }
}
