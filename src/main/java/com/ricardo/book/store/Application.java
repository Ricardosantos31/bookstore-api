package com.ricardo.book.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ricardo.book.store.domain.Categoria;
import com.ricardo.book.store.domain.Livro;
import com.ricardo.book.store.repositories.CategoriaRepository;
import com.ricardo.book.store.repositories.LivroRepository;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class Application {
	

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
