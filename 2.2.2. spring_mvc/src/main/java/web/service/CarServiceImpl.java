package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.*;

@Service
public class CarServiceImpl implements CarService {

    public static final List<Car> carList = Arrays.asList(
            new Car("Volvo", 740, 25000),
            new Car("Moskvich", 412, 5000),
            new Car("BMW", 5, 30000),
            new Car("Toyota", 4, 40000),
            new Car("LADA", 2104, 2000)
    );

    @Override
    public List<Car> getAllCars(Integer count) {
        return count == null || count > carList.size() ? carList : carList.subList(0, count);

    }

}
