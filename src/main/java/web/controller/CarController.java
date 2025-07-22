package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import java.util.List;

@Controller
public class CarController {
    List <Car> carList = List.of(
            new Car("BMW","M5","Black"),
            new Car("Audi","RS6","White"),
            new Car("Mercedes-Benz","E200","Black"),
            new Car("Volkswagen","Passat","Gray"),
            new Car("Toyota","Supra","Orange"));

    @GetMapping("/cars?count ≥ 5")
    public String showAllCar (Model model) {
        model.addAttribute("cars", carList);
        return "cars";
    }

    @GetMapping("/cars")
    public String showCarCount (@RequestParam(value = "count", required = false) Integer countCar, Model model) {
        if(countCar == null){
            model.addAttribute("cars",carList);
        } else {
            model.addAttribute("cars", carList.subList(0, countCar));
        }
        return "cars";
    }
}
