package com.crok.pessoas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crok.pessoas.model.Pessoas;

@Repository
public interface PessoasDao extends JpaRepository<Pessoas, Integer> {

}
