package com.henrique.controlevacina.servise;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henrique.controlevacina.domain.Usuario;
import com.henrique.controlevacina.repository.UsuariosRepository;
import com.henrique.controlevacina.servise.exception.ObjectNotFoundException;

@Service
public class UsuarioService {

	@Autowired
	private UsuariosRepository repository;
	
	public Usuario findById(Integer id) {
		Optional<Usuario> obj = repository.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException("usuario nao encontrado !" + Usuario.class.getName()));
	}

	public Usuario create(Usuario obj) {
		obj.setId(null);
		return repository.save(obj);
	}
	
}
