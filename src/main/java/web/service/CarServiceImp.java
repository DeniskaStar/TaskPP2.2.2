package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService{

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getAllCars(){
        return carDao.getAllCars();
    }

    @Override
    public List<Car> getCar(int count) {
        return carDao.getCar(count);
    }
}
