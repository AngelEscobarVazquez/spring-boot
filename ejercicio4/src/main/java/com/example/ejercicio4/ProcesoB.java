package com.example.ejercicio4;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class ProcesoB implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        obtenerNombre();
    }

    private final MessageService messageService;
    private final Faker faker;

    public ProcesoB(@Qualifier("systemErrMessageService") MessageService messageService, Faker faker) {
        this.messageService = messageService;
        this.faker = faker;
    }

    public void obtenerNombre() {
        String nombre = this.getClass().getSimpleName();
        String frase = faker.backToTheFuture().quote();
        messageService.showMessage("\nEjecutando: " + nombre + "- Frase: " + frase);
    }
}
