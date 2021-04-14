package com.mongo.demo.controller;

import com.mongo.demo.model.Funcionario;
import com.mongo.demo.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping
    public List<Funcionario> obterTodos() {
        return funcionarioService.obterTodos();
    }

    @GetMapping("/{codigo}")
    public Funcionario obterPorCodigo(@PathVariable String codigo) {
        return funcionarioService.obterPorCodigo(codigo);
    }

    @PostMapping
    public Funcionario addFuncionario(@RequestBody Funcionario funcionario) {
        return funcionarioService.addFuncionario(funcionario);
    }

    @GetMapping("/range")
    public List<Funcionario> obterFuncionariosPorRangeDeIdade(@RequestParam Integer de, @RequestParam Integer ate) {
        return funcionarioService.obterFuncionariosPorRangeDeIdade(de, ate);
    }
}
