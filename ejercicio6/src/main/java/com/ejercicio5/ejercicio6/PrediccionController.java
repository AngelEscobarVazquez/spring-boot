package com.ejercicio5.ejercicio6;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrediccionController {

    private final PrediccionService prediccionService;

    public PrediccionController(PrediccionService prediccionService) {
        this.prediccionService = prediccionService;
    }

    @GetMapping("/prediccion")
    public String verPrediccion(Model model) {
        model.addAttribute("semana", prediccionService.obtenerPrediccionSemana());
        return "prediccion";
    }
}