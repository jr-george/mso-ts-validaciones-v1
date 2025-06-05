package com.trainibits.labs.mso_es_consulta_seguros_v1.repository;

import com.trainibits.labs.mso_es_consulta_seguros_v1.model.Requisito;
import com.trainibits.labs.mso_es_consulta_seguros_v1.model.Seguro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SeguroRepository {
    //Se define la fuente de datos, en este caso una lista de Seguros
    private List<Seguro> seguros = new ArrayList<Seguro>();

    //Aquí en el constructor se llena la lista

    public SeguroRepository() {
        //Seguro VIDA
        List<String> beneficiosSeguroVida = new ArrayList<String>();
        List<Requisito> requisitosVida = new ArrayList<>();
        List<Integer> generosSeguroVida = new ArrayList<>();
        beneficiosSeguroVida.add("Beneficio económico para tu familia, que se incrementará en caso de fallecimiento accide");
        beneficiosSeguroVida.add("Servicio funerario sin costo adicional");
        generosSeguroVida.add(1);
        generosSeguroVida.add(2);
        requisitosVida.add(new Requisito(18,75,generosSeguroVida));
        seguros.add(new Seguro(1,"VIDA",
                "Protección económica para tu familia en caso de fallecimiento natural o accidental.",
                700,
                beneficiosSeguroVida,requisitosVida));

        //Seguro INFARTO
        List<String> beneficiosSeguroInfarto = new ArrayList<String>();
        List<Requisito> requisitosInfarto = new ArrayList<>();
        List<Integer> generosSeguroInfarto = new ArrayList<>();
        beneficiosSeguroInfarto.add("Envio de Ambulancia");
        beneficiosSeguroInfarto.add("Consultas medicas ilimitadas");
        beneficiosSeguroInfarto.add("No se requiere presentar exámenes médicos");
        generosSeguroInfarto.add(1);
        generosSeguroInfarto.add(2);
        requisitosInfarto.add(new Requisito(15,64,generosSeguroInfarto));
        seguros.add(new Seguro(2,"INFARTO",
                "Protección económica de $50,000 por la primera ocurrencia de infarto al miocardio.",
                300,
                beneficiosSeguroInfarto,requisitosInfarto));

        List<String> beneficiosSeguroMujer = new ArrayList<String>();
        List<Requisito> requisitosMujer = new ArrayList<>();
        List<Integer> generosSeguroMujer = new ArrayList<>();
        beneficiosSeguroMujer.add("20 consultas psicologicas a domicilio, que apliquen siempre y cuando se haya diagnosticado el cáncer.");
        beneficiosSeguroMujer.add("Consultas psicologicas por teléfono ilimitadas.");
        beneficiosSeguroMujer.add("No se requiere presentar exámenes médicos");
        generosSeguroMujer.add(2);
        requisitosMujer.add(new Requisito(15,64,generosSeguroMujer));
        seguros.add(new Seguro(3,"MUJER",
                "Protección económica de $50,000 por el primer diagnóstico de cáncer de mama o cervicouterino",
                300,
                beneficiosSeguroMujer,requisitosMujer));
    }

    public List<Seguro> getSeguros() {
        return seguros;
    }
    public Seguro getSeguroById(Integer id) {
        for (Seguro seguro : seguros) {
            if (seguro.getId() == id) {
                return seguro;
            }
        }
        return null;
    }
}
