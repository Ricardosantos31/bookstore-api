package com.ricardo.book.store.service;


import com.ricardo.book.store.domain.Livro;
import com.ricardo.book.store.repositories.LivroRepository;
import com.ricardo.book.store.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    public Livro findById(Integer id) {
        Optional<Livro> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto nao encontrado ! Id " + id + ", Tipo: " + Livro.class.getName()));
    }

}
