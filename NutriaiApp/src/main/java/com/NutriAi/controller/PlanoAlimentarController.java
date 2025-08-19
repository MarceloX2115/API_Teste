package com.NutriAi.controller;

import com.NutriAi.model.PlanoAlimentar;
import com.NutriAi.service.PlanoAlimentarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/planos-alimentares")
public class PlanoAlimentarController {

    private final PlanoAlimentarService service;

    public PlanoAlimentarController(PlanoAlimentarService service) {
        this.service = service;
    }

    @PostMapping
    public PlanoAlimentar criar(@RequestBody PlanoAlimentar plano) {
        return service.salvar(plano);
    }

    @GetMapping
    public List<PlanoAlimentar> listarTodos() {
        return service.listarTodos();
    }
}