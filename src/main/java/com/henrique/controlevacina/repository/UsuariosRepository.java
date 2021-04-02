package com.henrique.controlevacina.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henrique.controlevacina.domain.Usuario;

public interface UsuariosRepository extends JpaRepository<Usuario, Integer>{

}
