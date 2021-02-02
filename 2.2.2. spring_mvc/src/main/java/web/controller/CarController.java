package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
@RequestMapping(value = "/cars")
public class CarController {

    @Autowired
    public CarServiceImpl carService;

    @RequestMapping
    public String printCars(Model model, @RequestParam(value = "count", required = false) Integer count) {
        List<Car> carList = carService.getAllCars(count);
        model.addAttribute("cars", carList);
        return "cars";
    }


}
