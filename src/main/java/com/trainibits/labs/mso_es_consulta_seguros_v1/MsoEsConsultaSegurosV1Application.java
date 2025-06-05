package com.trainibits.labs.mso_es_consulta_seguros_v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsoEsConsultaSegurosV1Application {

	public static void main(String[] args) {
		SpringApplication.run(MsoEsConsultaSegurosV1Application.class, args);
	}

}
