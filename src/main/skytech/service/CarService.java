package skytech.service;

import skytech.model.CarModel;

import java.util.List;

public interface CarService {
    /**
     * @param car
     * @return
     */
    int createCarEntry(CarModel car);

    List<CarModel> read();

    CarModel getId(int car_id);

    int update(CarModel car);
    int delete(int car_id);
}
