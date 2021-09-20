package com.ricardo.book.store.service;

import com.ricardo.book.store.domain.Categoria;
import com.ricardo.book.store.domain.Livro;
import com.ricardo.book.store.repositories.CategoriaRepository;
import com.ricardo.book.store.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;



@Service
public class DBService {

    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private LivroRepository livroRepository;


    public void instenciaBaseDeDados(){
        Categoria cat1 = new Categoria(null, "Informatica", "Livro de TI");
        Categoria cat2 = new Categoria(null,"Ficcao Cientifica","Ficcao Cientifica");
        Categoria cat3 = new Categoria(null,"Biografias","Livros de Biografia");


        Livro l1 = new Livro(null, "Clean code", "Robert Martin", "Lorem ipsum", cat1);
        Livro l2 = new Livro(null, "Engenharia de software", "LouisV. Gerstner", "Lorem ipsum", cat1);
        Livro l3 = new Livro(null, "The Time Machine", "H.G. Wells", "Lorem ipsum", cat2);
        Livro l4 = new Livro(null, "The War of the Worlds", "H.G. Wells", "Lorem ipsum", cat2);
        Livro l5 = new Livro(null, "I,Robot", "Isaac Asimov", "Lorem ipsum", cat2);

        cat1.getLivros().addAll(Arrays.asList(l1, l2));
        cat2.getLivros().addAll(Arrays.asList(l3, l4, l5));

        categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

        livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
    }
}
