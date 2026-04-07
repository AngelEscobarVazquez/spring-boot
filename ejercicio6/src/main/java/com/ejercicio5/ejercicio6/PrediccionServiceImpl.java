package com.ejercicio5.ejercicio6;

import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class PrediccionServiceImpl implements PrediccionService {

    private final List<PrediccionDia> prediccionFija = new ArrayList<>();

    public PrediccionServiceImpl() {
        Random r = new Random();
        LocalDate hoy = LocalDate.now();

        for (int i = 0; i < 8; i++) {
            int prob = r.nextInt(101);
            int min = r.nextInt(11);
            int max = r.nextInt(11) + 10;
            int uv = r.nextInt(6);

            this.prediccionFija.add(new PrediccionDia(hoy.plusDays(i), prob, min, max, uv));
        }
    }

    @Override
    public List<PrediccionDia> obtenerPrediccionSemana() {
        return this.prediccionFija;
    }
}