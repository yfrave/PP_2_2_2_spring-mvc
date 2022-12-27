package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    Car car1 = new Car("мерс", "зеленый", 240);
    Car car2 = new Car("жига", "белый", 120);
    Car car3 = new Car("повозка с собаками", "серые собаки", 40);
    Car car4 = new Car("corvete", "красный", 280);
    Car car5 = new Car("pagani", "черный", 380);


    List<Car> cars = new ArrayList<>();

    {
        cars.add(1, car1);
        cars.add(2, car2);
        cars.add(3, car3);
        cars.add(4, car4);
        cars.add(5, car5);
    }

    public List<Car> carList(int count) {
        if (cars.size() > count) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }

}
