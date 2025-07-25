package web.service;

import web.model.Car;

import java.util.List;

public class CreateCarList {
    public List<Car> getCarList(){
        return  List.of(
                new Car("BMW","M5","Black"),
                new Car("Audi","RS6","White"),
                new Car("Mercedes-Benz","E200","Black"),
                new Car("Volkswagen","Passat","Gray"),
                new Car("Toyota","Supra","Orange"));
    }
}
