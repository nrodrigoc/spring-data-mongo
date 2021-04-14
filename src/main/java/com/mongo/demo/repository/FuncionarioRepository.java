package com.mongo.demo.repository;

import com.mongo.demo.model.Funcionario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface FuncionarioRepository extends MongoRepository<Funcionario, String> {

    // o ?0 significa "parâmetro 0"
    @Query(" { $and: [ { 'idade': { $gte: ?0 } } , { 'idade': { $lte: ?1 }  } ] } ")
    List<Funcionario> obterFuncionariosPorRangeDeIdade(Integer de, Integer ate);

}
