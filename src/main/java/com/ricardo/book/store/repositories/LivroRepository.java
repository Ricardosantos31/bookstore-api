package com.ricardo.book.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ricardo.book.store.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer>{

}
