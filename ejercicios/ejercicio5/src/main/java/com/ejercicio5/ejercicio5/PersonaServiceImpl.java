package com.ejercicio5.ejercicio5;

import net.datafaker.Faker;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {
    private final Faker faker;

    public PersonaServiceImpl(Faker faker) {
        this.faker = faker;
    }

    @Override
    public Persona findOne() {
        String nombre = faker.name().firstName();
        String apellidos = faker.name().lastName();
        String dni = faker.numerify("########") + faker.letterify("?").toUpperCase();
        //var instante = faker.date().birthday(1, 80).toInstant();
        //LocalDate fechaNacimiento = instante.atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaNacimiento = faker.date().birthday(1, 80).toLocalDateTime().toLocalDate();
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
