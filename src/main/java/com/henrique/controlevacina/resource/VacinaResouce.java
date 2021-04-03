package com.henrique.controlevacina.resource;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.henrique.controlevacina.domain.Vacina;
import com.henrique.controlevacina.servise.VacinaService;

@RestController
@RequestMapping(value ="/vacinas")
public class VacinaResouce {

	@Autowired
	private VacinaService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Vacina> findById(@PathVariable Integer id){
		Vacina obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<Vacina> creat(@RequestParam(value = "usuario",defaultValue = "0")Integer id_user,@RequestBody Vacina obj){
		obj = service.create(id_user, obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/vacinas/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
	
}
