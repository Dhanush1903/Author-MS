package com.author.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.author.entity.Author;


public interface IAuthorRepository extends JpaRepository<Author, String>{

	Optional<Author> findByEmail(String email);

}
