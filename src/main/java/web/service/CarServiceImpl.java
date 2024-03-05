package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{
    @Override
    public List<Car> listCars() {
        List<Car> listCars = new ArrayList<>();
        listCars.add(new Car("A" , 1, 100));
        listCars.add(new Car("B" , 2, 200));
        listCars.add(new Car("C" , 3, 300));
        listCars.add(new Car("D" , 4, 400));
        listCars.add(new Car("E" , 5, 500));
        return listCars;
    }
}
