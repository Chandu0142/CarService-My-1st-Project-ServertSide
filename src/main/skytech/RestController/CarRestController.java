package skytech.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import skytech.model.CarModel;
import skytech.service.impl.CarServiceImpl;

import java.util.List;

@RestController
public class CarRestController {

    @Autowired
    CarServiceImpl carService;

    @GetMapping("/carDetails")
    public List<CarModel> displayAll(){
       List<CarModel> list= carService.read();
       return list;
    }
    @GetMapping("/carDetails/{car_id}")
    public CarModel getId(@PathVariable int car_id){
        CarModel carModel = carService.getId(car_id);
        return carModel;
    }
    @GetMapping("/delete/{car_id}")
    public int delete(@PathVariable int car_id){
       return carService.delete(car_id);

    }
    @PostMapping("/update")
    public int update(@RequestBody CarModel carModel){
        return carService.update(carModel);
    }
    @PostMapping("/insertCarDetails")
    public int insert(@RequestBody CarModel carModel){
        return carService.createCarEntry(carModel);
    }
}
