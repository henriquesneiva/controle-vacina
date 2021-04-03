package com.henrique.controlevacina.servise;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henrique.controlevacina.domain.Usuario;
import com.henrique.controlevacina.domain.Vacina;
import com.henrique.controlevacina.repository.VacinaRepository;
import com.henrique.controlevacina.servise.exception.ObjectNotFoundException;

@Service
public class VacinaService {

	@Autowired
	private VacinaRepository repository;
	@Autowired
	private UsuarioService usuarioService;
	
	public Vacina findById(Integer id) {
		Optional<Vacina> obj = repository.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException("vacina nao encontrada !" + Vacina.class.getName()));
	}
	
	public Vacina create(Integer id_user,Vacina obj) {
		obj.setId(null);
		Usuario user = usuarioService.findById(id_user);
		obj.setUsuario(user);
		return repository.save(obj);
	}
	
}
