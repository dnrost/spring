package com.dr.model;

import java.math.BigDecimal;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import org.springframework.lang.NonNull;
import com.dr.enums.TipoCargo;

@Entity
public class Colaborador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String nome;

	@NonNull
	private TipoCargo cargo;

	@Positive
	private BigDecimal salario;

	@Deprecated
	public Colaborador() {
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public TipoCargo getCargo() {
		return cargo;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public Colaborador(String nome, TipoCargo cargo, BigDecimal salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario.add(cargo.bonificacaoColaborador(salario));
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Colaborador{" + id == null ? "" : "id=" + id + ", nome='" + nome + '\'' + ", cargo=" + cargo + ", salario=" + salario + '}';
	}
}
