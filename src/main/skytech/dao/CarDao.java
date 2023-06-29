package skytech.dao;

import skytech.model.CarModel;

import java.util.List;

public interface CarDao {
    /**
     *
     * @param car
     * @return
     */
    int create(CarModel car);

    /**
     *
     * @param
     * @return
     */
    List<CarModel> read();
    CarModel getId(int car_id);
    int update(CarModel car);
    int delete(int car_id);


}
