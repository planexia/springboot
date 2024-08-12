package com.example.demo.cont;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        // Retorna el nombre de la vista (sin la extensión .html)
        return "index";
    }
}