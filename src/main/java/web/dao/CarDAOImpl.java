package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImpl implements CarDAO {

    private List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("BMW", "x6", 2020));
        carList.add(new Car("Mazda", "6", 2015));
        carList.add(new Car("Toyota", "camry", 2014));
        carList.add(new Car("Nissan", "X-Trail", 2010));
        carList.add(new Car("Volvo", "xc90", 2010));
        carList.add(new Car("Volvo", "xc90", 2010));
    }

    @Override
    public List<Car> carList() {
        return carList;
    }

    @Override
    public List<Car> carListPar(int count) {
        return carList.subList(0, count);
    }

}
