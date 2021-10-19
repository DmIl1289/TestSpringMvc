package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String printSetOfCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List<Car> cars = CarService.getCars().stream().limit(count).collect(Collectors.toList());
        model.addAttribute("cars", cars);
        return "cars";
    }
}