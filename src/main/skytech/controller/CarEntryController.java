package skytech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import skytech.model.CarModel;
import skytech.service.impl.CarServiceImpl;
import skytech.validator.CarValidator;

import javax.validation.Valid;

@Controller
public class CarEntryController {
    @Autowired
    private CarServiceImpl carService;
    @Autowired
    private CarValidator carValidator;

    @GetMapping("/")
    public String registerCarDetails(Model model){
        model.addAttribute("carModel", new CarModel());
        return "login";
    }

    @PostMapping("/enter")
    public String Create(@Valid @ModelAttribute CarModel carModel , BindingResult bindingResult ){
        carValidator.validate(carModel, bindingResult);
        if(bindingResult.hasErrors())
        {

            return "login";
        }
        else
        {
            System.out.println(carModel);
            int counter = carService.createCarEntry(carModel);
            if(counter>0)  return "success";
           else return "login";
        }

    }
}

