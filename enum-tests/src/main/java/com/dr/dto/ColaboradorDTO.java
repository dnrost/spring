package com.dr.dto;

import java.math.BigDecimal;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import com.dr.enums.TipoCargo;
import com.dr.model.Colaborador;
import com.fasterxml.jackson.annotation.JsonFormat;

public class ColaboradorDTO {

    @NotBlank
    private String nome;

    @NotBlank
    private TipoCargo cargo;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Positive
    private BigDecimal salario;

    public ColaboradorDTO(String nome, TipoCargo cargo, BigDecimal salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Colaborador converte() {
        return new Colaborador(nome, cargo, salario);
    }
}
