package com.NutriAi.service;

import com.NutriAi.model.PlanoAlimentar;
import com.NutriAi.repository.PlanoAlimentarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanoAlimentarService {

    private final PlanoAlimentarRepository repository;

    public PlanoAlimentarService(PlanoAlimentarRepository repository) {
        this.repository = repository;
    }

    public PlanoAlimentar salvar(PlanoAlimentar plano) {
        return repository.save(plano);
    }

    public List<PlanoAlimentar> listarTodos() {
        return repository.findAll();
    }
}