package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao{

    private static final List<Car> carList = new ArrayList<>();

    @Override
    public void add(Car car) {
        carList.add(car);
    }

    @Override
    public List<Car> listCars(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
