package com.author.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.author.entity.Author;


public interface IAuthorRepository extends JpaRepository<Author, Integer>{

}
