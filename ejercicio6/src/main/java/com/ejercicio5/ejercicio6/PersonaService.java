package com.ejercicio5.ejercicio6;

import java.util.List;


public interface PersonaService {

    List<Persona> find(int count);

    Persona findOne();

}
