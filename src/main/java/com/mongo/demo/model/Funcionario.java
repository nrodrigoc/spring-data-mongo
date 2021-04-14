package com.mongo.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Document
public class Funcionario {

    @Id
    private String codigo;

    private String nome;

    private Integer idade;

    private BigDecimal salario;

    @DBRef //Referencia para outra collection/document
    private Funcionario chefe;

}
