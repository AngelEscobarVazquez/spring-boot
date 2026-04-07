package com.springboot.ejercicio1;

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

    public void obtenerNombre() {
        String nombre = this.getClass().getSimpleName();
        System.out.println("\nEjecutando: " + nombre);
    }
}
