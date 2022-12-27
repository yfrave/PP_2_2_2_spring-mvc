package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("мерс", "зеленый", 240));
        cars.add(new Car("жига", "белый", 120));
        cars.add(new Car("повозка с собаками", "серые собаки", 40));
        cars.add(new Car("corvete", "красный", 280));
        cars.add(new Car("pagani", "черный", 380));
    }

    public List<Car> carList(int count) {
        if (count > cars.size()) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }

}
