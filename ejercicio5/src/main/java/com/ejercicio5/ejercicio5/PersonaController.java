package com.ejercicio5.ejercicio5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


import java.util.ArrayList;
import java.util.List;

@Controller
public class PersonaController {

    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/personas")
    public String obtenerPersonas(Model model) {
        List<Persona> personas = personaService.find(10);
        model.addAttribute("lista", personas);
        return "listado_personas";
    }

    @GetMapping("/persona/una")
    public String obtenerPersonaUna(Model model) {
        model.addAttribute("persona", personaService.findOne());
        return "persona_aleatoria";
    }
}
