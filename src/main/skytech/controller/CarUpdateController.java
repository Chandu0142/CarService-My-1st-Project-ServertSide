package skytech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import skytech.model.CarModel;
import skytech.service.CarService;

@Controller
public class CarUpdateController {
    @Autowired
    CarService carService;

    @GetMapping("/getid/update/{id}")
    public ModelAndView read(@PathVariable int id , ModelAndView modelAndView ) {
        CarModel car = carService.getId(id);
        modelAndView.addObject("car", car);
        modelAndView.setViewName("update");
        return modelAndView;
    }
    @PostMapping ("/getid/update/update1")
    public ModelAndView update(@ModelAttribute CarModel car , ModelAndView modelAndView){
        carService.update(car);
        modelAndView.setViewName("redirect:/read");
        return modelAndView;
    }
    
    @RequestMapping(value = "/getid/del/{car_id}", method = RequestMethod.GET)

    public String delete(@PathVariable int car_id){
        carService.delete(car_id);
        return "delete";
    }

}
