package com.trainibits.labs.mso_es_consulta_seguros_v1.model;

import java.util.List;

public class Seguro {
    private Integer id;
    private String nombre;
    private String descripcion;
    private double primaTotal;
    private List<String> beneficios;
    private List<Requisito> requisitos;

    public Seguro(int id, String nombre, String descripcion, double primaTotal, List<String> beneficios, List<Requisito> requisitos) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.primaTotal = primaTotal;
        this.beneficios = beneficios;
        this.requisitos = requisitos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrimaTotal() {
        return primaTotal;
    }

    public void setPrimaTotal(double primaTotal) {
        this.primaTotal = primaTotal;
    }

    public List<String> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(List<String> beneficios) {
        this.beneficios = beneficios;
    }

    public List<Requisito> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(List<Requisito> requisitos) {
        this.requisitos = requisitos;
    }
}
