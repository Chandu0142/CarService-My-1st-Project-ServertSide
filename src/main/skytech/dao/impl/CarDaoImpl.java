package skytech.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import skytech.dao.CarDao;
import skytech.model.CarModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CarDaoImpl implements CarDao {
    private JdbcTemplate jdbcTemplate;

    public CarDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int  create(CarModel car) {
        String query = "Insert into car(car_colour , car_price , car_brand , owner_name , contact_number) values(?,?,?,?,?)";

        try {
            int counter = jdbcTemplate.update(query, car.getCar_colour(), car.getCar_price(), car.getCar_brand() , car.getOwner_name(),car.getContact_number());
            return counter;

        } catch (Exception e) {
            e.printStackTrace();

            return 0;
        }
    }

    @Override
    /**
     * read method
     */
    public List<CarModel> read() {
        List<CarModel> carList = jdbcTemplate.query("select * from car", new RowMapper<CarModel>() {
            @Override
            public CarModel mapRow(ResultSet rs, int rowNum) throws SQLException {
                CarModel car1 = new CarModel();
                car1.setCar_id(rs.getInt("car_id"));
                car1.setCar_brand(rs.getString("car_brand"));
                car1.setCar_price(rs.getDouble("car_price"));
                car1.setCar_colour(rs.getString("car_colour"));
                car1.setOwner_name(rs.getString("owner_name"));
                car1.setContact_number(rs.getString("contact_number"));
                return car1;
            }
        });
        return carList ;
    }

    @Override
    /**
     * get by id
     */
    public CarModel getId(int car_id) {
        String query = "select * from car where car_id=?";
CarModel car3=jdbcTemplate.queryForObject(query , new Object[]{car_id} , new RowMapper<CarModel>() {
    @Override
    public CarModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        CarModel car2 = new CarModel();
        car2.setCar_id(rs.getInt("car_id"));
        car2.setCar_colour(rs.getString("car_colour"));
        car2.setCar_price(rs.getInt("car_price"));
        car2.setCar_brand(rs.getString("car_brand"));
        car2.setOwner_name(rs.getString("owner_name"));
        car2.setContact_number(rs.getString("contact_number"));

        return car2;
    }
});
        return car3;
    }

    @Override
    /**
     * update
     */
    public int update(CarModel car) {
        String query = "update car set car_colour=? , car_price=? , car_brand=? , owner_name=? , contact_number=? where car_id=?";
        int i = jdbcTemplate.update(query, car.getCar_colour(), car.getCar_price(), car.getCar_brand() ,car.getOwner_name(),car.getContact_number(),car.getCar_id());
        return i;
    }

    @Override
    /**
     * delete
     */
    public int delete(int car_id) {
        String query = "delete from car where car_id=?";
        return jdbcTemplate.update(query , car_id);

    }

}

