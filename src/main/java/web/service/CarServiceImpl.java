package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDAO carDAO;

    @Override
    public List<Car> carList() {
        return carDAO.carList();
    }

    @Override
    public List<Car> carListPar(int count) {
        return carDAO.carListPar(count);
    }

}
