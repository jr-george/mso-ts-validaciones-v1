package com.trainibits.labs.mso_es_consulta_seguros_v1.model;

import java.util.List;

public class Requisito {
    private int edadMinima;
    private int edadMaxima;
    private List<Integer> generos;

    public Requisito(int edadMinima, int edadMaxima, List<Integer> generos) {
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;
        this.generos = generos;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public int getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(int edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public List<Integer> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Integer> generos) {
        this.generos = generos;
    }
}
