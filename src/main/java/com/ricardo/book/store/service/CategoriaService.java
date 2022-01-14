package com.ricardo.book.store.service;

import com.ricardo.book.store.domain.Categoria;
import com.ricardo.book.store.repositories.CategoriaRepository;
import com.ricardo.book.store.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria findById(Integer id) {
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto nao encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }
}
