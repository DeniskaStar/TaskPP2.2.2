package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {

    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Toyota", "Corolla", 122));
        cars.add(new Car("Nissan", "Teana", 252));
        cars.add(new Car("Mazda", "3", 105));
        cars.add(new Car("BMW", "X3", 190));
        cars.add(new Car("Lada", "Granta", 78));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCar(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
