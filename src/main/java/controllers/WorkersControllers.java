package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.pcs.car_store.models.Workers;
import ru.pcs.car_store.repositories.WorkersRepository;

@Controller
public class WorkersControllers {

    @Autowired
    public WorkersRepository workersRepository;

    @GetMapping("/Workers")
    public String addUser() {
        return "Workers";
    }

    @PostMapping("/users")
    public String addUserPost(@RequestParam String firstName, @RequestParam String lastName) {
        Workers workers = Workers.builder()
                .firstName(firstName)
                .lastName(lastName)
                .build();
        workersRepository.save(workers);
        return "redirect:/Catalog";
    }
}