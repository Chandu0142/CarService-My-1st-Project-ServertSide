package skytech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import skytech.model.CarModel;
import skytech.service.impl.CarServiceImpl;

@Controller
public class CarGetByIdController {
    @Autowired
    CarServiceImpl carService;
    @GetMapping("/getid/{id}")
    public ModelAndView show(@PathVariable int id , ModelAndView view){

        CarModel car4 = carService.getId(id);
        view.addObject("carModel",car4);
        view.setViewName("getid");

      return view;
    }
}
