package com.dr.controller;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.dr.dto.ColaboradorDTO;
import com.dr.model.Colaborador;
import com.dr.repository.ColaboradorRepository;
import java.util.List;

@RestController
public class ColaboradorController {

	private ColaboradorRepository colaboradorRepository;

	public ColaboradorController(ColaboradorRepository colaboradorRepository) {
		this.colaboradorRepository = colaboradorRepository;
	}

	@PostMapping("/colaborador")
	@Transactional
	public String create(@RequestBody ColaboradorDTO dto) {
		Colaborador colaborador = dto.converte();
		colaboradorRepository.save(colaborador);
		return colaborador.toString();
	}

	@GetMapping("/colaborador")
	public List<Colaborador> findAll() {
		return colaboradorRepository.findAll();
	}
}
