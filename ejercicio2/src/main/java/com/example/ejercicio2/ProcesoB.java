package com.example.ejercicio2;

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

    public ProcesoB(MessageService messageService) {
        this.messageService = messageService;
    }

    public void obtenerNombre() {
        String nombre = this.getClass().getSimpleName();
        messageService.showMessage("\nEjecutando: "+nombre);
    }
}
