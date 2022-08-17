package com.author.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.author.entity.Books;

public interface IAuthorRepository extends JpaRepository<Books, Integer>{

}
