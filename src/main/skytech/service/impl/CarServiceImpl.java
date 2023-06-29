package skytech.service.impl;

import skytech.dao.CarDao;
import skytech.model.CarModel;
import skytech.service.CarService;

import java.util.List;


public class CarServiceImpl implements CarService {
    private CarDao carDao;


    @Override
    public int createCarEntry(CarModel car) {

        return carDao.create(car);
    }

    @Override
    public List<CarModel> read() {
        return carDao.read();
    }

    @Override
    public CarModel getId(int car_id) {
       CarModel car3= carDao.getId(car_id);
        return car3;
    }

    @Override
    public int update(CarModel car) {
        return carDao.update(car);
    }

    @Override
    public int delete(int car_id) {
        return carDao.delete(car_id);
    }

    public CarDao getCarDao() {
        return carDao;
    }

    public void setCarDao(CarDao carDao) {
        this.carDao = carDao;
    }
}
