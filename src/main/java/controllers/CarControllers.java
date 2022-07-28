package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.pcs.car_store.models.Car;
import ru.pcs.car_store.models.Specifications;
import ru.pcs.car_store.repositories.CarRepositories;
import ru.pcs.car_store.repositories.SpecificationsRepositories;

import java.util.List;

@Controller
public class CarControllers {

    @Autowired
    public CarRepositories carRepositories;
    @Autowired
    public SpecificationsRepositories specificationsRepositories;

    @GetMapping("/CarStore/{car_id}") //Название страницы в браузере
    public String getCarStore(@PathVariable("car_id") int car_id, Model model) {
        List<Specifications> specifications = specificationsRepositories.findByIndicatorNumbers(car_id);
        model.addAttribute("specifications", specifications);
        List<Car> car = carRepositories.findAllByCarId(car_id);
        System.out.println(specifications.get(0).getEngine());
        model.addAttribute("car", car);
        System.out.println(car_id);
        return "CarStore";
    }
}