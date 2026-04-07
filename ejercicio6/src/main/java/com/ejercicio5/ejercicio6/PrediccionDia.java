package com.ejercicio5.ejercicio6;

import java.time.LocalDate;

public class PrediccionDia {
    private LocalDate fecha;
    private int probPrecipitacion;
    private int tempMin;
    private int tempMax;
    private int nivelUV;

    public PrediccionDia(LocalDate fecha, int probPrecipitacion, int tempMin, int tempMax, int nivelUV) {
        this.fecha = fecha;
        this.probPrecipitacion = probPrecipitacion;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.nivelUV = nivelUV;
    }

    // Getters necesarios para que Thymeleaf pueda leer los datos
    public LocalDate getFecha() { return fecha; }
    public int getProbPrecipitacion() { return probPrecipitacion; }
    public int getTempMin() { return tempMin; }
    public int getTempMax() { return tempMax; }
    public int getNivelUV() { return nivelUV; }
}