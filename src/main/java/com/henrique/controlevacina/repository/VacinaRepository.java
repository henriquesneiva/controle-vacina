package com.henrique.controlevacina.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henrique.controlevacina.domain.Vacina;

public interface VacinaRepository extends JpaRepository<Vacina,Integer>{

}
