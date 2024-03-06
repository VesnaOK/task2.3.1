package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private final List<Car> listCars = new ArrayList<>(List.of(
            new Car("A", 1, 100),
            new Car("B", 2, 200),
            new Car("C", 3, 300),
            new Car("D", 4, 400),
            new Car("E", 5, 500)));

    @Override
    public List<Car> listCars(int count) {
        if (count > 0 && count < 5) {
            return listCars.stream().limit(count).toList();
        } else {
            return listCars;
        }
    }
}
