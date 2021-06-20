package web.service;

import org.springframework.stereotype.Service;
import web.DAO.CarDAO;
import web.DAO.CarDaoImpl;
import web.models.Car;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    CarDAO carDAO = new CarDaoImpl();

    @Override
    public List<Car> carList(int count) {
        return carDAO.carList(count);
    }
}
