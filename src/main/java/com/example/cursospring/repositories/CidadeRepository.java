package com.example.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cursospring.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
