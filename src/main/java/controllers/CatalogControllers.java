package controllers;

import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CatalogControllers {

    @SneakyThrows
    @GetMapping("/Catalog")
    public String getСatalog (Model model) {
        return "Catalog";
    }
}