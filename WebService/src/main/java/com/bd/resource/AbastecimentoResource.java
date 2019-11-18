package com.bd.resource;

import com.bd.model.Abastecimento;
import com.bd.repository.AbastecimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/abastecimento")
public class AbastecimentoResource {

	@Autowired
	private AbastecimentoRepository abastecimentoRepository;

	@GetMapping
	public List<Abastecimento> getAll() {
		return abastecimentoRepository.findAll();
	}

	@PostMapping
	public ResponseEntity<Abastecimento> create(@RequestBody Abastecimento abastecimento, HttpServletResponse response) {
		Abastecimento save = abastecimentoRepository.save(abastecimento);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(save.getId()).toUri();

		return ResponseEntity.created(uri).body(save);
	}
}
