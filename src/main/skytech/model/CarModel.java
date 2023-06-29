package skytech.model;

import javax.validation.constraints.NotEmpty;

public class CarModel {
    private int car_id;

    private double car_price;

    @NotEmpty
    private String car_colour;

    @NotEmpty
    private String car_brand;
    @NotEmpty
    private String owner_name;
    @NotEmpty
    private String contact_number;

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public String getCar_colour() {
        return car_colour;
    }

    public void setCar_colour(String car_colour) {
        this.car_colour = car_colour;
    }

    public String getCar_brand() {
        return car_brand;
    }

    public void setCar_brand(String car_brand) {
        this.car_brand = car_brand;
    }

    public double getCar_price() {
        return car_price;
    }

    public void setCar_price(double car_price) {
        this.car_price = car_price;
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "car_id=" + car_id +
                ", car_price=" + car_price +
                ", car_colour='" + car_colour + '\'' +
                ", car_brand='" + car_brand + '\'' +
                '}';
    }
}
