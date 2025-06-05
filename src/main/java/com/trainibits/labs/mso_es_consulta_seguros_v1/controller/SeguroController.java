package com.trainibits.labs.mso_es_consulta_seguros_v1.controller;

import com.trainibits.labs.mso_es_consulta_seguros_v1.model.Seguro;
import com.trainibits.labs.mso_es_consulta_seguros_v1.service.SeguroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@RequestMapping("/seguros/v1/")
public class SeguroController {
    @Autowired
    private SeguroService seguroService;



    @GetMapping
    public ResponseEntity<?> getSeguros(@RequestParam(value = "id", required = false) Integer id) {
        if (id!=null)
        {
            return ResponseEntity.ok(seguroService.getById(id));
        }
        else {
            return ResponseEntity.ok(seguroService.get());
        }
    }
}
