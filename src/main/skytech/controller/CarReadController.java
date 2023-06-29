package skytech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import skytech.model.CarModel;
import skytech.service.impl.CarServiceImpl;

import java.util.List;

@Controller
public class CarReadController {
    @Autowired
    CarServiceImpl carService;

    @GetMapping("/read")
    public ModelAndView read(ModelAndView modelAndView){
        List<CarModel> cars = carService.read();
        modelAndView.addObject("listcar" , cars);
        modelAndView.setViewName("display");
        return modelAndView;

    }

}
