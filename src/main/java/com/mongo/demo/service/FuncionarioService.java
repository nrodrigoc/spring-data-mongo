package com.mongo.demo.service;

import com.mongo.demo.model.Funcionario;

import java.util.List;

public interface FuncionarioService {

    List<Funcionario> obterTodos();

    Funcionario obterPorCodigo(String codigo);

    Funcionario addFuncionario(Funcionario funcionario);

    List<Funcionario> obterFuncionariosPorRangeDeIdade(Integer de, Integer ate);
}
