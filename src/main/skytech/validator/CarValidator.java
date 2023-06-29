package skytech.validator;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import skytech.model.CarModel;

public class CarValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return CarModel.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "car_colour", "error.car_colour.empty", "car color should not empty");
        CarModel model = (CarModel) target;
        double car_price = model.getCar_price();
        if(car_price<20000 ){
            errors.rejectValue("car_price" , "error.car_price.invalid");

        }
    }


}
