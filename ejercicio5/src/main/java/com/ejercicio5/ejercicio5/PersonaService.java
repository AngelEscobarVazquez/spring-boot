package com.ejercicio5.ejercicio5;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface PersonaService {

    List<Persona> find(int count);

    Persona findOne();

}
