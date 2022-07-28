package controllers;

import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginControllers {

    @SneakyThrows
    @GetMapping("/Login")
    public String getLogin (Model model){
        return "Login";
    }
}