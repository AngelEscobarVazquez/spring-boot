package com.ejercicio5.ejercicio6;

import net.datafaker.Faker;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    private final Faker faker;

    // Spring inyectará el bean 'faker' definido en BeansConfiguration
    public PersonaServiceImpl(Faker faker) {
        this.faker = faker;
    }

    @Override
    public Persona findOne() {
        String nombre = faker.name().firstName();
        String apellidos = faker.name().lastName();
        // Genera un DNI ficticio: 8 números y una letra en mayúscula
        String dni = faker.numerify("########") + faker.letterify("?").toUpperCase();

        // Genera una fecha de nacimiento aleatoria para alguien de entre 1 y 80 años
        LocalDate fechaNacimiento = faker.date()
                .birthday(1, 80)
                .toLocalDateTime()
                .toLocalDate();

        return new Persona(nombre, apellidos, dni, fechaNacimiento);
    }

    @Override
    public List<Persona> find(int count) {
        List<Persona> lista_personas = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            lista_personas.add(findOne());
        }
        return lista_personas;
    }
}