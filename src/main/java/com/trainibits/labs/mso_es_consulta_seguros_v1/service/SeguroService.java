package com.trainibits.labs.mso_es_consulta_seguros_v1.service;

import com.trainibits.labs.mso_es_consulta_seguros_v1.model.Seguro;

import java.util.List;

public interface SeguroService {
    public List<Seguro> get();
    public Seguro getById(Integer id);
}
