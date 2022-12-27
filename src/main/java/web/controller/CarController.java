package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.service.CarService;


@Controller
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @RequestMapping("/cars")
    public String getCount(@RequestParam(value = "count", defaultValue = "5")
                           int count, ModelMap modelMap) {
        modelMap.addAttribute("cars", carService.carList(count));
        return "cars";
    }
}
