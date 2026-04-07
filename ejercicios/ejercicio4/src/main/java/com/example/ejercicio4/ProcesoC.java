package com.example.ejercicio4;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class ProcesoC implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        obtenerNombre();
    }

    private final MessageService messageService;
    private final Faker faker;

    public ProcesoC(MessageService messageService, Faker faker) {
        this.messageService = messageService;
        this.faker = faker;
    }

    public void obtenerNombre() {
        String nombre = this.getClass().getSimpleName();
        String frase = faker.gameOfThrones().quote();
        messageService.showMessage("\nEjecutando: " + nombre + "- Frase: " + frase);
    }
}
