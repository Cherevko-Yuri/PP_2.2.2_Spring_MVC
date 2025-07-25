package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CreateCarList;

import java.util.List;

@Controller
public class CarController {
    CreateCarList createCarList;
    @GetMapping("/cars?count ≥ 5")
    public String showAllCar (Model model) {
        model.addAttribute("cars", createCarList.getCarList());
        return "cars";
    }

    @GetMapping("/cars")
    public String showCarCount (@RequestParam(value = "count", required = false) Integer countCar, Model model) {
        if(countCar == null){
            model.addAttribute("cars",createCarList.getCarList());
        } else {
            model.addAttribute("cars", createCarList.getCarList().subList(0, countCar));
        }
        return "cars";
    }
}
