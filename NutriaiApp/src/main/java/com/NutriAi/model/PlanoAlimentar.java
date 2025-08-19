package com.NutriAi.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class PlanoAlimentar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomePaciente;
    private String condicaoClinica;
    private String descricao;
    private int caloriasDiarias;
}