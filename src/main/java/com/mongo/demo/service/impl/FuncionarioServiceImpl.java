package com.mongo.demo.service.impl;

import com.mongo.demo.model.Funcionario;
import com.mongo.demo.repository.FuncionarioRepository;
import com.mongo.demo.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Override
    public List<Funcionario> obterTodos() {
        return funcionarioRepository.findAll();
    }

    @Override
    public Funcionario obterPorCodigo(String codigo) {
        return funcionarioRepository.findById(codigo).orElse(null);
    }

    @Override
    public Funcionario addFuncionario(Funcionario funcionario) {

        if(funcionario.getChefe() != null) {
            Funcionario chefe = obterPorCodigo(funcionario.getChefe().getCodigo());
            funcionario.setChefe(chefe);
        }

        return funcionarioRepository.save(funcionario);
    }

    @Override
    public List<Funcionario> obterFuncionariosPorRangeDeIdade(Integer de, Integer ate) {
        return funcionarioRepository.obterFuncionariosPorRangeDeIdade(de, ate);
    }
}
