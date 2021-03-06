package com.aps.bethstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aps.bethstore.domain.Estoque;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Integer>{

}
