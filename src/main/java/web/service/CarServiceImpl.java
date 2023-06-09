package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDAO carDAO;

    @Override
    public List<Car> carListPar(Integer count) {
        if (count == null) {
            return carDAO.carList();
        } else {
            return count >= 2 && count <= 4 ? carDAO.carListPar(count) : carDAO.carList();
        }
    }
}
