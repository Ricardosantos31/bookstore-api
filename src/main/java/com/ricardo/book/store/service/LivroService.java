package com.ricardo.book.store.service;


import com.ricardo.book.store.domain.Categoria;
import com.ricardo.book.store.domain.Livro;
import com.ricardo.book.store.repositories.LivroRepository;
import com.ricardo.book.store.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    @Autowired
    private CategoriaService categoriaService;

    public Livro findById(Integer id) {
        Optional<Livro> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto nao encontrado ! Id " + id + ", Tipo: " + Livro.class.getName()));
    }

    public List<Livro> findAll(Integer id_cat) {
        categoriaService.findById(id_cat);
        return repository.findAllByCategoria(id_cat);
    }


    public Livro update(Integer id, Livro obj) {
        Livro newObj = findById(id);
        updateData(newObj, obj);
        return repository.save(newObj);
    }

    private void updateData(Livro newObj, Livro obj) {
        newObj.setTitulo(obj.getTitulo());
        newObj.setNome_autor(obj.getNome_autor());
        newObj.setTexto(obj.getTexto());
    }

    public Livro create(Integer id_cat, Livro obj) {
        obj.setId(null);
        Categoria cat = categoriaService.findById(id_cat);
        obj.setCategoria(cat);
        return repository.save(obj);

    }
}
