package com.trainibits.labs.mso_es_consulta_seguros_v1.service.impl;

import com.trainibits.labs.mso_es_consulta_seguros_v1.model.Seguro;
import com.trainibits.labs.mso_es_consulta_seguros_v1.repository.SeguroRepository;
import com.trainibits.labs.mso_es_consulta_seguros_v1.service.SeguroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SeguroServiceImpl implements SeguroService {
    @Autowired
    private SeguroRepository seguroRepository;

    @Override
    public List<Seguro> get() {
        return seguroRepository.getSeguros();
    }

    @Override
    public Seguro getById(Integer id) {
        return seguroRepository.getSeguroById(id);
    }
}
